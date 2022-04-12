// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptGetServiceRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AdaptGetServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AdaptGetServiceRequest self = new AdaptGetServiceRequest();
        return TeaModel.build(map, self);
    }

    public AdaptGetServiceRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AdaptGetServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
