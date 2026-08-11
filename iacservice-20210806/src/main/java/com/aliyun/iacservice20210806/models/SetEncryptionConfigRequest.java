// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class SetEncryptionConfigRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The ID of the KMS key used for encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>09d0641c-e96c-495a-925e-9b50xxxxxxxx</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The region ID of the KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("kmsRegionId")
    public String kmsRegionId;

    public static SetEncryptionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEncryptionConfigRequest self = new SetEncryptionConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetEncryptionConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetEncryptionConfigRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public SetEncryptionConfigRequest setKmsRegionId(String kmsRegionId) {
        this.kmsRegionId = kmsRegionId;
        return this;
    }
    public String getKmsRegionId() {
        return this.kmsRegionId;
    }

}
