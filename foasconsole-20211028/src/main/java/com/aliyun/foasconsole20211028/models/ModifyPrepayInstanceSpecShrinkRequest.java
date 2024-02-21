// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    public static ModifyPrepayInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecShrinkRequest self = new ModifyPrepayInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

}
