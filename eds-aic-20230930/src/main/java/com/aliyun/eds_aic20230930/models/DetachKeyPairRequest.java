// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DetachKeyPairRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    public static DetachKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairRequest self = new DetachKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DetachKeyPairRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

}
