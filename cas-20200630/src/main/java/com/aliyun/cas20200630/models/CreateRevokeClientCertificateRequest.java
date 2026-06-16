// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client or server certificate to revoke.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465990.html">ListClientCertificate</a> to query the unique identifiers of all client and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static CreateRevokeClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRevokeClientCertificateRequest self = new CreateRevokeClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRevokeClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
