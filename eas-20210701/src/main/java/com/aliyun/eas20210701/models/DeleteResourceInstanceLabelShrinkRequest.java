// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstanceLabelShrinkRequest extends TeaModel {
    @NameInMap("AllInstances")
    public Boolean allInstances;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

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
