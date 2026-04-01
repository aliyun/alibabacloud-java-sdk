// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachKeyPairRequest extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-50f8q9mbfjzlkuk9znjglnne3&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The key pair ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ssh-xxx</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The name of the SSH key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>test-kp</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

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

    public DetachKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
