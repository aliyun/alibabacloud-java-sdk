// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DecryptRequest extends TeaModel {
    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>RSAES_OAEP_SHA_1</strong></p>
     * </li>
     * <li><p><strong>RSAES_OAEP_SHA_256</strong></p>
     * </li>
     * <li><p><strong>SM2PKE</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAESOAEPSHA_1</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The unique identifier of the certificate. Call <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> to obtain this parameter.</p>
     * <ul>
     * <li><p>The identifier of an SSL certificate is typically in the format {Certificate ID}-cn-hangzhou.</p>
     * </li>
     * <li><p>For a private certificate authority (PCA) certificate, this is the value of the Identifier field of the private certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The Base64-encoded data to decrypt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A custom identifier that serves as a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p>RAW: The response returns the plaintext in UTF-8 encoding.</p>
     * </li>
     * <li><p>Base64 (default): The response returns the Base64-encoded plaintext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The ID of the repository.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> to obtain this ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static DecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptRequest self = new DecryptRequest();
        return TeaModel.build(map, self);
    }

    public DecryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DecryptRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public DecryptRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public DecryptRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public DecryptRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
