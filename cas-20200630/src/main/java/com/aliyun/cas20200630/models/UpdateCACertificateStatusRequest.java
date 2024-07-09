// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the CA certificate whose status you want to change.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The state to which you want to change the CA certificate. Set to the value to <strong>REVOKE</strong>. After this operation is called, the status of the CA certificate is changed to <strong>REVOKE</strong>.</p>
     * <blockquote>
     * <p> You can call this operation only if the status of a CA certificate is <strong>ISSUE</strong>. You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the status of a CA certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REVOKE</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateCACertificateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusRequest self = new UpdateCACertificateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateCACertificateStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
