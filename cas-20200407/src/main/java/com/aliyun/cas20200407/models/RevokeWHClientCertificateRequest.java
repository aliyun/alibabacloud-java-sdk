// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RevokeWHClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to revoke.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static RevokeWHClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeWHClientCertificateRequest self = new RevokeWHClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public RevokeWHClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
