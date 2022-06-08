// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyRequest extends TeaModel {
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    public static UpdateRotationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRotationPolicyRequest self = new UpdateRotationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRotationPolicyRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public UpdateRotationPolicyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public UpdateRotationPolicyRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

}
