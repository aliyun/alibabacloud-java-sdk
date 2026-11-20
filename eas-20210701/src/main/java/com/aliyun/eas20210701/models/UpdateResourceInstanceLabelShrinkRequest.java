// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceLabelShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the operation applies to all instances in the resource group. If this parameter is set to true, the InstanceIds parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllInstances")
    public Boolean allInstances;

    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The user-defined tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    public static UpdateResourceInstanceLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceLabelShrinkRequest self = new UpdateResourceInstanceLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceLabelShrinkRequest setAllInstances(Boolean allInstances) {
        this.allInstances = allInstances;
        return this;
    }
    public Boolean getAllInstances() {
        return this.allInstances;
    }

    public UpdateResourceInstanceLabelShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public UpdateResourceInstanceLabelShrinkRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

}
