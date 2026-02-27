// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateKMSEncryptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_encryption")
    public Boolean disableEncryption;

    /**
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
