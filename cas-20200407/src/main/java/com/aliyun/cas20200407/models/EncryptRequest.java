// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class EncryptRequest extends TeaModel {
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
     * <p>The unique identifier of the certificate. To obtain this parameter, call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
     * <ul>
     * <li><p>The identifier of an SSL certificate is usually in the {Certificate ID}-cn-hangzhou format.</p>
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
     * <p>The custom identifier, which serves as a unique key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81dg3</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li><p>RAW (default): Directly encrypts the value of Plaintext.</p>
     * </li>
     * <li><p>Base64: Decodes the Base64-encoded value of Plaintext and then encrypts the decoded data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RAW</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The data to encrypt. The data can be plaintext or Base64-encoded plaintext. For more information, see the MessageType parameter. If you use Base64 encoding, for example, if the hexadecimal content of the data to be encrypted is <code>[0x31, 0x32, 0x33, 0x34]</code>, the corresponding Base64-encoded string is MTIzNA==. The maximum size of Plaintext depends on the Algorithm:</p>
     * <ul>
     * <li><p><strong>RSAES_OAEP_SHA_1</strong>: 214 bytes.</p>
     * </li>
     * <li><p><strong>RSAES_OAEP_SHA_256</strong>: 190 bytes.</p>
     * </li>
     * <li><p><strong>SM2PKE</strong>: 6047 bytes.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234***</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <p>The repository ID.</p>
     * <blockquote>
     * <p>To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static EncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptRequest self = new EncryptRequest();
        return TeaModel.build(map, self);
    }

    public EncryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public EncryptRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public EncryptRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public EncryptRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public EncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public EncryptRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
