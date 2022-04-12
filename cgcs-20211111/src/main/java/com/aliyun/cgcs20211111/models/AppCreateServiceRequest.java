// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppCreateServiceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppCreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppCreateServiceRequest self = new AppCreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppCreateServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppCreateServiceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AppCreateServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
