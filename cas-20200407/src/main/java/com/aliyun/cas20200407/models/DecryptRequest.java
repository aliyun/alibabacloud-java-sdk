// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DecryptRequest extends TeaModel {
    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li><strong>RSAES_OAEP_SHA_1</strong></li>
     * <li><strong>RSAES_OAEP_SHA_256</strong></li>
     * <li><strong>SM2PKE</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSAESOAEPSHA_1</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The unique identifier of the certificate. You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
     * <ul>
     * <li>The identifier of an SSL certificate is typically in the {Certificate ID}-cn-hangzhou format.</li>
     * <li>The identifier of a PCA certificate is the Identifier field of the corresponding private certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The data to be decrypted. The data is Base64-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The custom user identifier, which is a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li>RAW: The plaintext result encoded in UTF-8 is returned.</li>
     * <li>Base64: The Base64-encoded result is returned. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The repository ID.</p>
     * <blockquote>
     * <p>You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation.</p>
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
