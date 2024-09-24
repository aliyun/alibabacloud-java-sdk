// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ModifyApplicationSpecShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02S7UU41WKJL7ERR</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("InstanceSpec")
    public String instanceSpecShrink;

    public static ModifyApplicationSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSpecShrinkRequest self = new ModifyApplicationSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSpecShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationSpecShrinkRequest setInstanceSpecShrink(String instanceSpecShrink) {
        this.instanceSpecShrink = instanceSpecShrink;
        return this;
    }
    public String getInstanceSpecShrink() {
        return this.instanceSpecShrink;
    }

}
