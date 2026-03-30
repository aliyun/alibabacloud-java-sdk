// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainJwtAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
     */
    @NameInMap("authenticationTokenId")
    public String authenticationTokenId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_jwt_subject</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    public static ObtainJwtAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainJwtAuthenticationTokenRequest self = new ObtainJwtAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public ObtainJwtAuthenticationTokenRequest setAuthenticationTokenId(String authenticationTokenId) {
        this.authenticationTokenId = authenticationTokenId;
        return this;
    }
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    public ObtainJwtAuthenticationTokenRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

}
