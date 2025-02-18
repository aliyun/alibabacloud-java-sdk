// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateRequest extends TeaModel {
    /**
     * <p>The content of the certificate in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The content of the encryption certificate in PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICDzCCA***
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("EncryptCert")
    public String encryptCert;

    /**
     * <p>The private key of the encryption certificate in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN EC PRIVATE KEY-----
     * MHcCAQEEI****
     * -----END EC PRIVATE KEY-----</p>
     */
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    /**
     * <p>The private key of the certificate in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICDzCCAbagAw****
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the certificate. The name can be up to 64 characters in length, and can contain all types of characters, such as letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p> The name must be unique within an Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cert-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>the resource group id.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae****vty</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The content of the signing certificate in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIICDzCCAbagAw****
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("SignCert")
    public String signCert;

    /**
     * <p>The private key of the signing certificate in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN EC PRIVATE KEY-----
     * MHcCAQEEILR****
     * -----END EC PRIVATE KEY-----</p>
     */
    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UploadUserCertificateRequestTags> tags;

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

    public UploadUserCertificateRequest setTags(java.util.List<UploadUserCertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UploadUserCertificateRequestTags> getTags() {
        return this.tags;
    }

    public static class UploadUserCertificateRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UploadUserCertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UploadUserCertificateRequestTags self = new UploadUserCertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public UploadUserCertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UploadUserCertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
