// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DetachKeyPairRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances. You can specify a maximum of 50 cloud phone instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the ADB key pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-6v2q33ae4tw3a****</p>
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
