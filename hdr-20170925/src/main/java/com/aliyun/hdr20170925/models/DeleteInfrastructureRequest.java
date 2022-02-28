// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeleteInfrastructureRequest extends TeaModel {
    @NameInMap("InfrastructureId")
    public String infrastructureId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteInfrastructureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInfrastructureRequest self = new DeleteInfrastructureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInfrastructureRequest setInfrastructureId(String infrastructureId) {
        this.infrastructureId = infrastructureId;
        return this;
    }
    public String getInfrastructureId() {
        return this.infrastructureId;
    }

    public DeleteInfrastructureRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
