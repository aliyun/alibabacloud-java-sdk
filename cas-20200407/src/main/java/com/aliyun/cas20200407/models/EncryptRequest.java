// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class EncryptRequest extends TeaModel {
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
     * <p>The unique identifier of the certificate. You can call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation to obtain the identifier.</p>
     * <ul>
     * <li>If the certificate is an SSL certificate, the value of this parameter must be in the {Certificate ID}-cn-hangzhou format.</li>
     * <li>If the certificate is a private certificate, the value of this parameter must be the value of the Identifier field for the private certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("CustomIdentifier")
    public String customIdentifier;

    /**
     * <p>The value type of the Message parameter. Valid values:</p>
     * <ul>
     * <li>RAW: The value of the Plaintext parameter is directly encrypted. This is the default value.</li>
     * <li>Base64: The value of the Plaintext parameter is Base64-encoded data. The data is decoded and then encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RAW</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The data that you want to encrypt. The value of this parameter can be raw data or Base64-encoded data. For more information, see the description of the MessageType parameter. For example, if the hexadecimal data that you want to encrypt is <code>[0x31, 0x32, 0x33, 0x34]</code>, the Base64-encoded data is MTIzNA==. The size of data that can be encrypted varies based on the encryption algorithm that you use. The following list describes the relationship between the encryption algorithms and data sizes:</p>
     * <ul>
     * <li><strong>RSAES_OAEP_SHA_1</strong>: 214 bytes</li>
     * <li><strong>RSAES_OAEP_SHA_256</strong>: 190 bytes</li>
     * <li><strong>SM2PKE</strong>: 6,047 bytes</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234***</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

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

}
