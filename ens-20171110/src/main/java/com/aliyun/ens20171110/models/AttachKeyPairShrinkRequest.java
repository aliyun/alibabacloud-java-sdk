// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachKeyPairShrinkRequest extends TeaModel {
    /**
     * <p>The instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-50f8q9mbfjzlkuk9znjglnne3&quot;]</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
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

    public static AttachKeyPairShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairShrinkRequest self = new AttachKeyPairShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public AttachKeyPairShrinkRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public AttachKeyPairShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
