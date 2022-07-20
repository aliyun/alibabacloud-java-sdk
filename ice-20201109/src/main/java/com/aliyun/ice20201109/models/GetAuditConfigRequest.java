// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAuditConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetAuditConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditConfigRequest self = new GetAuditConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
