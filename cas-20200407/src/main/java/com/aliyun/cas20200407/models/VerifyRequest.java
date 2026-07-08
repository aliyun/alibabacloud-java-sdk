// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class VerifyRequest extends TeaModel {
    /**
     * <p>The unique identifier of the certificate. To get this parameter, call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
     * <ul>
     * <li><p>The identifier for an SSL certificate is typically in the format \<code>{Certificate ID}-cn-hangzhou\\</code>.</p>
     * </li>
     * <li><p>For a PCA certificate, this is the value of the \<code>Identifier\\</code> field.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The custom identifier. This key must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
     */
    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The data to verify. The data must be Base64-encoded. For example, if the hexadecimal content of the data to sign is \<code>[0x31, 0x32, 0x33, 0x34]\\</code>, the Base64-encoded value is \<code>MTIzNA==\\</code>. If you set \<code>MessageType\\</code> to \<code>RAW\\</code>, the data size must be less than 4 KB. If the data to sign is larger than 4 KB, set \<code>MessageType\\</code> to \<code>DIGEST\\</code>. Then, set \<code>Message\\</code> to the message digest, or hash, that you calculate locally. The hashing algorithm for the digest must be compatible with the signature algorithm:<br></p>
     * <ul>
     * <li><p>The hashing algorithm for \<code>SHA256withRSA\\</code>, \<code>SHA256withRSA/PSS\\</code>, and \<code>SHA256withECDSA\\</code> is SHA-256.</p>
     * </li>
     * <li><p>The hashing algorithm for \<code>SM3withSM2\\</code> is SM3.</p>
     * </li>
     * </ul>
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
     * <li><p><strong>RAW</strong> (default): The raw data.</p>
     * </li>
     * <li><p><strong>DIGEST</strong>: The message digest of the raw data.</p>
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
     * <p>The signature value. The value must be Base64-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyaC0w3ROK5b3QcHmUtAhMY/sQjKu2t3uBfnf6J/gn7JfZtyxwcCUjzXbw5jmqJQRbj1te670Bshg9kUdanKhtHFhJjU5jX+ZMMBr6pH0gqQDJxR0K0yHXRc0Q5OQoUZ6BfpbI4Wt4jJvJSdCstz1vSg12CfEHS8Kd5qfhItK7Y=</p>
     */
    @NameInMap("SignatureValue")
    public String signatureValue;

    /**
     * <p>The signature algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>SHA256withRSA</strong></p>
     * </li>
     * <li><p><strong>SHA256withRSA/PSS</strong></p>
     * </li>
     * <li><p><strong>SHA256withECDSA</strong></p>
     * </li>
     * <li><p><strong>SM3withSM2</strong></p>
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
     * <p>The ID of the repository. To get this parameter, call the <a href="https://help.aliyun.com/document_detail/453246.html">ListCertWarehouse</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WarehouseId")
    public String warehouseId;

    public static VerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRequest self = new VerifyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public VerifyRequest setCustomIdentifier(String customIdentifier) {
        this.customIdentifier = customIdentifier;
        return this;
    }
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public VerifyRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public VerifyRequest setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }
    public String getSignatureValue() {
        return this.signatureValue;
    }

    public VerifyRequest setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    public VerifyRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
