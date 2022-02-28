// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateInfrastructureRequest extends TeaModel {
    @NameInMap("Credential")
    public String credential;

    @NameInMap("InfrastructureId")
    public String infrastructureId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateInfrastructureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInfrastructureRequest self = new UpdateInfrastructureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInfrastructureRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public UpdateInfrastructureRequest setInfrastructureId(String infrastructureId) {
        this.infrastructureId = infrastructureId;
        return this;
    }
    public String getInfrastructureId() {
        return this.infrastructureId;
    }

    public UpdateInfrastructureRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
