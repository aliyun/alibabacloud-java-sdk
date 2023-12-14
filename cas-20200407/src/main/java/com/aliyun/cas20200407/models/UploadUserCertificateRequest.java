// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateRequest extends TeaModel {
    /**
     * <p>The content of the certificate in the PEM format.</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The content of the encryption certificate in PEM format.</p>
     */
    @NameInMap("EncryptCert")
    public String encryptCert;

    /**
     * <p>The private key of the encryption certificate in the PEM format.</p>
     */
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    /**
     * <p>The private key of the certificate in the PEM format.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the certificate. The name can contain up to 128 characters in length. The name can contain all types of characters, such as letters, digits, and underscores (\_).</p>
     * <br>
     * <p>>  The name must be unique within an Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>the resource group id.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The content of the signing certificate in the PEM format.</p>
     */
    @NameInMap("SignCert")
    public String signCert;

    /**
     * <p>The private key of the signing certificate in the PEM format.</p>
     */
    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    public static UploadUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadUserCertificateRequest self = new UploadUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadUserCertificateRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public UploadUserCertificateRequest setEncryptCert(String encryptCert) {
        this.encryptCert = encryptCert;
        return this;
    }
    public String getEncryptCert() {
        return this.encryptCert;
    }

    public UploadUserCertificateRequest setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public UploadUserCertificateRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UploadUserCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadUserCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UploadUserCertificateRequest setSignCert(String signCert) {
        this.signCert = signCert;
        return this;
    }
    public String getSignCert() {
        return this.signCert;
    }

    public UploadUserCertificateRequest setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

}
