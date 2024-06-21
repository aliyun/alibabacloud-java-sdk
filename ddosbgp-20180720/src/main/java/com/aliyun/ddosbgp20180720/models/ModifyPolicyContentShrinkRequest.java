// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyContentShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>demo**</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyPolicyContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyContentShrinkRequest self = new ModifyPolicyContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyContentShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public ModifyPolicyContentShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPolicyContentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
