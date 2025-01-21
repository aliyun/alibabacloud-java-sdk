// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to delete. The status of the certificate must be <strong>REVOKE</strong>.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers and status of all client certificates and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DeleteClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCertificateRequest self = new DeleteClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
