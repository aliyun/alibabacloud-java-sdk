// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionDeleteServiceRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppVersionDeleteServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppVersionDeleteServiceRequest self = new AppVersionDeleteServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppVersionDeleteServiceRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AppVersionDeleteServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
