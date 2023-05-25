// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteSignatureRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   This API operation deletes an existing backend signature key.</p>
     * <p>*   You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.</p>
     * <p>*   The QPS limit on this operation is 50 per user.</p>
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
