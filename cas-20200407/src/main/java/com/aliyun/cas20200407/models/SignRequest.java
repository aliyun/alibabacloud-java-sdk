// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class SignRequest extends TeaModel {
    /**
     * <p>The unique identifier of the certificate. You can get this value by calling the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
     * <ul>
     * <li><p>The identifier of an SSL certificate is typically in the format \&quot;{Certificate ID}-cn-hangzhou\&quot;.</p>
     * </li>
     * <li><p>For a PCA certificate, this is the Identifier from the corresponding private certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>A unique, user-defined identifier.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong>e6bb538d538c70c01f81fg3</strong></em>*</p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The data to sign. The MessageType parameter determines the format of this data. If MessageType is set to RAW, Message is the raw data. If MessageType is set to BASE64, Message is the Base64-encoded raw data. If MessageType is set to DIGEST, Message is the message digest (hash value). If MessageType is set to BLIND, Message is the Base64-encoded blinded message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNA==</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p><code>RAW</code> (default): The raw data.</p>
     * </li>
     * <li><p><code>DIGEST</code>: The message digest (hash value) of the raw data.</p>
     * </li>
     * <li><p><code>BASE64</code>: The Base64-encoded raw data.</p>
     * </li>
     * <li><p><code>BLIND</code>: Enables blind signing. This is supported only for certificates that use an RSA algorithm.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RAW</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The signature algorithm. Valid values:</p>
     * <ul>
     * <li><p><code>SHA256withRSA</code></p>
     * </li>
     * <li><p><code>SHA256withRSA/PSS</code></p>
     * </li>
     * <li><p><code>SHA256withECDSA</code></p>
     * </li>
     * <li><p><code>SM3withSM2</code></p>
     * </li>
     * <li><p><code>SHA256withRSA/P7</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256withRSA</p>
     */
    @NameInMap("SigningAlgorithm")
    public String signingAlgorithm;

    /**
     * <p>The repository ID.</p>
     * <blockquote>
     * <p>You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static SignRequest build(java.util.Map<String, ?> map) throws Exception {
        SignRequest self = new SignRequest();
        return TeaModel.build(map, self);
    }

    public SignRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public SignRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public SignRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SignRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SignRequest setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    public SignRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
