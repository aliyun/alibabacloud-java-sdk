// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RevokeWHClientCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
