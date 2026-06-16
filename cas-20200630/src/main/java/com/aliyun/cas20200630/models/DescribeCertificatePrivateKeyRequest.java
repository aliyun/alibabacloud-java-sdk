// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyRequest extends TeaModel {
    /**
     * <p>The password to encrypt the private key. The password can contain uppercase letters, lowercase letters, digits, and special characters, such as <code>,.+-_#</code>. The maximum length is 32 bytes.</p>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Remember the password you set. You need this password to decrypt the encrypted private key. If you forget the password, you cannot decrypt the private key that you get from this API call. You must call this API again to get a new encrypted key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>!Demo@WS3ed</p>
     */
    @NameInMap("EncryptedCode")
    public String encryptedCode;

    /**
     * <p>The unique identifier of the client or server-side certificate for which you want to get the private key.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465990.html">ListClientCertificate</a> to query the unique identifiers of all client and server-side certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bc37133bb7ed68c7938d928fd26d****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the resource group to which the certificate belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    public DescribeCertificatePrivateKeyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
