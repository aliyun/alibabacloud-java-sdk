// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client or server-side certificate to delete. The certificate must be in the <strong>REVOKE</strong> state.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465990.html">ListClientCertificate</a> to query the unique identifiers and current states of all client and server-side certificates.</p>
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
