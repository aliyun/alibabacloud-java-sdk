// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("EnableAutomaticRotation")
    @Validation(required = true)
    public Boolean enableAutomaticRotation;

    @NameInMap("RotationInterval")
    public String rotationInterval;

    public static UpdateRotationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRotationPolicyRequest self = new UpdateRotationPolicyRequest();
        return TeaModel.build(map, self);
    }

}
