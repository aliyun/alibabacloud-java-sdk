// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachKeyPairShrinkRequest extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-50f8q9mbfjzlkuk9znjglnne3&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

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

    public static DetachKeyPairShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairShrinkRequest self = new DetachKeyPairShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DetachKeyPairShrinkRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public DetachKeyPairShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
