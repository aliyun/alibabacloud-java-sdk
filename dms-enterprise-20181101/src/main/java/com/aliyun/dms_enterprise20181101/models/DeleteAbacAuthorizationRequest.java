// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAbacAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("AuthorizationId")
    public Long authorizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteAbacAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbacAuthorizationRequest self = new DeleteAbacAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAbacAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public DeleteAbacAuthorizationRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public DeleteAbacAuthorizationRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
