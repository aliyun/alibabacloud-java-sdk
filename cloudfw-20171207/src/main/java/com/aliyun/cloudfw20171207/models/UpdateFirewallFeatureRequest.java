// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateFirewallFeatureRequest extends TeaModel {
    /**
     * <p>The name of the feature to enable. Valid values:</p>
     * <ul>
     * <li><strong>ApplicationControl</strong>: application control</li>
     * <li><strong>WebFilter</strong>: web filtering</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ApplicationControl</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The status of the feature. Only <strong>Enable</strong> is supported, which enables the feature. Specifying Disable or other values returns an error. This operation is idempotent if the feature is already enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateFirewallFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFirewallFeatureRequest self = new UpdateFirewallFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFirewallFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public UpdateFirewallFeatureRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
