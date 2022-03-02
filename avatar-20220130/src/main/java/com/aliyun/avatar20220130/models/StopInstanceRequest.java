// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StopInstanceRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
