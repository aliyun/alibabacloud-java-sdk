// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class EncryptionConfig extends TeaModel {
    @NameInMap("KeyType")
    public String keyType;

    @NameInMap("KmsKeyArn")
    public String kmsKeyArn;

    public static EncryptionConfig build(java.util.Map<String, ?> map) throws Exception {
        EncryptionConfig self = new EncryptionConfig();
        return TeaModel.build(map, self);
    }

    public EncryptionConfig setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public EncryptionConfig setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

}
