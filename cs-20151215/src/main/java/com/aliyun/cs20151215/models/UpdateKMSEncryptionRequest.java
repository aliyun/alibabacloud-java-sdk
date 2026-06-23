// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateKMSEncryptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the Secret encryption at rest feature.</p>
     * <ul>
     * <li><code>true</code>: Disables the encryption at rest feature.</li>
     * <li><code>false</code>: Enables the encryption at rest feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_encryption")
    public Boolean disableEncryption;

    /**
     * <p>The key ID of the KMS key used by the Secret encryption at rest feature.</p>
     * <blockquote>
     * <p>Notice: You cannot use a service key. Use only a master key or a customer master key (CMK). The key type must be <code>Aliyun_AES_256</code>, and the key usage must be <code>ENCRYPT/DECRYPT</code>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Warning: During the procedure of enabling or shutdown of encryption at rest and after the feature is enabled, do not disable or delete the KMS key in the KMS console or through OpenAPI. Otherwise, the cluster API Server becomes not active, which prevents normal retrieval of objects such as Secrets and ServiceAccounts and affects the normal operation of business applications.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key-abc***</p>
     */
    @NameInMap("kms_key_id")
    public String kmsKeyId;

    public static UpdateKMSEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKMSEncryptionRequest self = new UpdateKMSEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKMSEncryptionRequest setDisableEncryption(Boolean disableEncryption) {
        this.disableEncryption = disableEncryption;
        return this;
    }
    public Boolean getDisableEncryption() {
        return this.disableEncryption;
    }

    public UpdateKMSEncryptionRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

}
