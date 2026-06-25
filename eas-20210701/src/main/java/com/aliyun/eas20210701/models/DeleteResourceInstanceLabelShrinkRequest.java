// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the operation takes effect on all instances in the resource group. If this parameter is set to true, the InstanceIds parameter does not take effect.</p>
     */
    @NameInMap("AllInstances")
    public Boolean allInstances;

    /**
     * <p>The machine instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The tags to delete. (Deprecated. Use LabelKeys instead.).</p>
     */
    @NameInMap("Keys")
    @Deprecated
    public String keysShrink;

    /**
     * <p>The tags to delete.</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeysShrink;

    public static DeleteResourceInstanceLabelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstanceLabelShrinkRequest self = new DeleteResourceInstanceLabelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstanceLabelShrinkRequest setAllInstances(Boolean allInstances) {
        this.allInstances = allInstances;
        return this;
    }
    public Boolean getAllInstances() {
        return this.allInstances;
    }

    public DeleteResourceInstanceLabelShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    @Deprecated
    public DeleteResourceInstanceLabelShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public DeleteResourceInstanceLabelShrinkRequest setLabelKeysShrink(String labelKeysShrink) {
        this.labelKeysShrink = labelKeysShrink;
        return this;
    }
    public String getLabelKeysShrink() {
        return this.labelKeysShrink;
    }

}
