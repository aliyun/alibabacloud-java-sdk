// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the delete operation takes effect on all instances in the resource group. If you set this parameter to true, the InstanceIds parameter does not take effect.</p>
     */
    @NameInMap("AllInstances")
    public Boolean allInstances;

    /**
     * <p>The instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The keys of the tags that you want to delete.</p>
     */
    @NameInMap("Keys")
    public String keysShrink;

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

    public DeleteResourceInstanceLabelShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

}
