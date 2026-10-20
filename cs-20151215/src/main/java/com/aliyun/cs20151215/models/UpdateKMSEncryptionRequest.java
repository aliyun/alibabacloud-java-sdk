// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateKMSEncryptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the encryption at rest feature for Secrets.</p>
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
     * <p>The KMS key ID used for the encryption at rest feature for Secrets.</p>
     * <blockquote>
     * <p>Notice: You cannot use a service key. You must use a master key or a customer master key (CMK). The key type must be <code>Aliyun_AES_256</code>, and the key usage must be <code>ENCRYPT/DECRYPT</code>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Warning: Do not use the KMS console or OpenAPI to disable or delete this KMS key during the enable or shutdown procedure for encryption at rest, or after the feature is successfully enabled. Otherwise, the cluster API server becomes inactive, which prevents you from retrieving objects such as Secrets and ServiceAccounts and affects the normal operation of your applications.</p>
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
