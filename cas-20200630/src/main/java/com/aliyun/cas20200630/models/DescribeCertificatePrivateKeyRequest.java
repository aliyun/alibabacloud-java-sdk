// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyRequest extends TeaModel {
    /**
     * <p>The password that is used to encrypt the private key. The password can contain letters, digits, and special characters, such as <code>, + - _ #</code>. The password can be up to 32 bytes in length.</p>
     * <p><strong>Warning</strong> You must remember the password that you specify. The password is required to decrypt the encrypted private key. If you forget the password, the encrypted private key that is returned cannot be decrypted. You must call this operation again.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>!QA@WS3ed</p>
     */
    @NameInMap("EncryptedCode")
    public String encryptedCode;

    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bc37133bb7ed68c7938d928fd26d****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DescribeCertificatePrivateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatePrivateKeyRequest self = new DescribeCertificatePrivateKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatePrivateKeyRequest setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
        return this;
    }
    public String getEncryptedCode() {
        return this.encryptedCode;
    }

    public DescribeCertificatePrivateKeyRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
