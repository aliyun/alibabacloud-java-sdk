// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateKMSEncryptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the Secret-at-rest encryption feature.</p>
     * <ul>
     * <li><code>true</code>: Disables the at-rest encryption feature.</li>
     * <li><code>false</code>: Enables the at-rest encryption feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_encryption")
    public Boolean disableEncryption;

    /**
     * <p>The KMS key ID used by the Secret-at-rest encryption feature.</p>
     * <blockquote>
     * <p>Notice: You cannot use a service key. You must use either a master key or a customer master key. The key type must be <code>Aliyun_AES_256</code>, and the key usage must be <code>ENCRYPT/DECRYPT</code>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Warning: During the process of enabling or disabling the at-rest encryption feature and after the feature is successfully enabled, do not disable or delete the KMS key via the KMS console or OpenAPI. Otherwise, the cluster API Server will become unavailable, preventing normal retrieval of objects such as Secrets and ServiceAccounts, which impacts the normal operation of business applications.</p>
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
