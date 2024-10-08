// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateRotationPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
     * <ul>
     * <li>true: enables automatic key rotation.</li>
     * <li>false: disables automatic key rotation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The period of automatic key rotation. Specify the value in the integer[unit] format. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day period. The period can range from 7 days to 730 days.</p>
     * <blockquote>
     * <p> If you set the EnableAutomaticRotation parameter to true, you must also specify this parameter. If you set the EnableAutomaticRotation parameter to false, you can leave this parameter unspecified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30d</p>
     */
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
