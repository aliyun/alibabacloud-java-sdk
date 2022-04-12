// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppGetServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppGetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppGetServiceRequest self = new AppGetServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppGetServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppGetServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
