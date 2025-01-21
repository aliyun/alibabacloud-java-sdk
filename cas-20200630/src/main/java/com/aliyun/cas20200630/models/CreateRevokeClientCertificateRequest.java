// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to revoke.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
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
