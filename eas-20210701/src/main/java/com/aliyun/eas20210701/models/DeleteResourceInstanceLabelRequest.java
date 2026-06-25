// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelRequest extends TeaModel {
    /**
     * <p>Specifies whether the operation takes effect on all instances in the resource group. If this parameter is set to true, the InstanceIds parameter does not take effect.</p>
     */
    @NameInMap("AllInstances")
    public Boolean allInstances;

    /**
     * <p>The machine instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The tags to delete. (Deprecated. Use LabelKeys instead.).</p>
     */
    @NameInMap("Keys")
    @Deprecated
    public java.util.List<String> keys;

    /**
     * <p>The tags to delete.</p>
     */
    @NameInMap("LabelKeys")
    public java.util.List<String> labelKeys;

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

    @Deprecated
    public DeleteResourceInstanceLabelRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public DeleteResourceInstanceLabelRequest setLabelKeys(java.util.List<String> labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public java.util.List<String> getLabelKeys() {
        return this.labelKeys;
    }

}
