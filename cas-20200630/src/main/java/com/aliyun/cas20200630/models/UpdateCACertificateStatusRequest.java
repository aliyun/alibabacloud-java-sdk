// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request.</p>
     * <p>Generate a unique parameter value from your client for each request. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3838B684-3075-582B-9A45-8C99104029DF</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique identifier of the CA certificate.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The operation to perform on the CA certificate. Set the value to <strong>REVOKE</strong>. This revokes the CA certificate and changes its status to <strong>REVOKE</strong>.</p>
     * <blockquote>
     * <p>This operation is supported only when the CA certificate is in the <strong>ISSUE</strong> state. Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the current status of the CA certificate.</p>
     * </blockquote>
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

    public UpdateCACertificateStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
