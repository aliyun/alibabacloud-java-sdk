// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionGetServiceRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppVersionGetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppVersionGetServiceRequest self = new AppVersionGetServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppVersionGetServiceRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AppVersionGetServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
