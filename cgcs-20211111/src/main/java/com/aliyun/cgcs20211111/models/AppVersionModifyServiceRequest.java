// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionModifyServiceRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppVersionModifyServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppVersionModifyServiceRequest self = new AppVersionModifyServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppVersionModifyServiceRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AppVersionModifyServiceRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public AppVersionModifyServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
