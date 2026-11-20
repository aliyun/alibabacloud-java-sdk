// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceLabelRequest extends TeaModel {
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
    public java.util.List<String> instanceIds;

    /**
     * <p>The user-defined tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    public static UpdateResourceInstanceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceLabelRequest self = new UpdateResourceInstanceLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceLabelRequest setAllInstances(Boolean allInstances) {
        this.allInstances = allInstances;
        return this;
    }
    public Boolean getAllInstances() {
        return this.allInstances;
    }

    public UpdateResourceInstanceLabelRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public UpdateResourceInstanceLabelRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

}
