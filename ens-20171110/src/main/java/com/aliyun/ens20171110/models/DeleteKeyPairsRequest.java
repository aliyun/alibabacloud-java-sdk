// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    public static DeleteKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsRequest self = new DeleteKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DeleteKeyPairsRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
