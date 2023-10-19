// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteSignatureRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the key to be deleted.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    public static DeleteSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignatureRequest self = new DeleteSignatureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSignatureRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteSignatureRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

}
