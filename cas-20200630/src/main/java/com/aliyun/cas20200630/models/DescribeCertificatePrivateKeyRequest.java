// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyRequest extends TeaModel {
    /**
     * <p>The password that is used to encrypt the private key. The password can contain letters, digits, and special characters, such as `, + - _ #`. The password can be up to 32 bytes in length.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Warning** You must remember the password that you specify. The password is required to decrypt the encrypted private key. If you forget the password, the encrypted private key that is returned cannot be decrypted. You must call this operation again.</p>
     */
    @NameInMap("EncryptedCode")
    public String encryptedCode;

    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to query.</p>
     * <br>
     * <p>>  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.</p>
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
