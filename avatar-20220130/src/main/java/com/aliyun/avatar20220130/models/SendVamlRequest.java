// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendVamlRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Vaml")
    public String vaml;

    public static SendVamlRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVamlRequest self = new SendVamlRequest();
        return TeaModel.build(map, self);
    }

    public SendVamlRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendVamlRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendVamlRequest setVaml(String vaml) {
        this.vaml = vaml;
        return this;
    }
    public String getVaml() {
        return this.vaml;
    }

}
