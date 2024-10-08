// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic rotation. Valid values:</p>
     * <ul>
     * <li>true: enables automatic rotation.</li>
     * <li>false: does not enable automatic rotation. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutomaticRotation")
    public Boolean enableAutomaticRotation;

    /**
     * <p>The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).</p>
     * <p>The value is in the <code>integer[unit]</code> format.````</p>
     * <p>The unit can be d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s indicate a seven-day interval.</p>
     * <blockquote>
     * <p> This parameter is required if you set the EnableAutomaticRotation parameter to true. This parameter is ignored if you set the EnableAutomaticRotation parameter to false or does not specify the EnableAutomaticRotation parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30d</p>
     */
    @NameInMap("RotationInterval")
    public String rotationInterval;

    /**
     * <p>The name of the secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RdsSecret/Mysql5.4/MyCred</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretRotationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRotationPolicyRequest self = new UpdateSecretRotationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRotationPolicyRequest setEnableAutomaticRotation(Boolean enableAutomaticRotation) {
        this.enableAutomaticRotation = enableAutomaticRotation;
        return this;
    }
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    public UpdateSecretRotationPolicyRequest setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public UpdateSecretRotationPolicyRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
