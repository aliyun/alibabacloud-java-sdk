// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppDeleteServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppDeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppDeleteServiceRequest self = new AppDeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppDeleteServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppDeleteServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
