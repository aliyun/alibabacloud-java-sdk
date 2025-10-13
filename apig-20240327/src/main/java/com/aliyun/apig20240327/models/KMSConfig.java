// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class KMSConfig extends TeaModel {
    @NameInMap("kmsInstanceId")
    public String kmsInstanceId;

    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    public static KMSConfig build(java.util.Map<String, ?> map) throws Exception {
        KMSConfig self = new KMSConfig();
        return TeaModel.build(map, self);
    }

    public KMSConfig setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public KMSConfig setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

}
