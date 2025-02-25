// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelRequest extends TeaModel {
    /**
     * <p>Specifies whether the delete operation takes effect on all instances in the resource group. If you set this parameter to true, the InstanceIds parameter does not take effect.</p>
     */
    @NameInMap("AllInstances")
    public Boolean allInstances;

    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The keys of the tags that you want to delete.</p>
     */
    @NameInMap("Keys")
    public java.util.List<String> keys;

    public static DeleteResourceInstanceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstanceLabelRequest self = new DeleteResourceInstanceLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstanceLabelRequest setAllInstances(Boolean allInstances) {
        this.allInstances = allInstances;
        return this;
    }
    public Boolean getAllInstances() {
        return this.allInstances;
    }

    public DeleteResourceInstanceLabelRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DeleteResourceInstanceLabelRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

}
