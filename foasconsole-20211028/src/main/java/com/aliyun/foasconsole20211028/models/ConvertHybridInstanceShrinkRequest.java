// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertHybridInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The order instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc_flinkserverless_public_cn-7e22*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The maximum resource specifications available for the pay-as-you-go portion of hybrid billing.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    public static ConvertHybridInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertHybridInstanceShrinkRequest self = new ConvertHybridInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConvertHybridInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertHybridInstanceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ConvertHybridInstanceShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

}
