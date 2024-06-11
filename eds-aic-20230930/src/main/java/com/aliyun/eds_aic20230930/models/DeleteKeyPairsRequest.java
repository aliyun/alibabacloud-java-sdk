// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsRequest extends TeaModel {
    @NameInMap("KeyPairIds")
    public java.util.List<String> keyPairIds;

    public static DeleteKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsRequest self = new DeleteKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsRequest setKeyPairIds(java.util.List<String> keyPairIds) {
        this.keyPairIds = keyPairIds;
        return this;
    }
    public java.util.List<String> getKeyPairIds() {
        return this.keyPairIds;
    }

}
