// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyUserDefinedSgShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SgIdList")
    public String sgIdListShrink;

    public static ModifyUserDefinedSgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserDefinedSgShrinkRequest self = new ModifyUserDefinedSgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserDefinedSgShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserDefinedSgShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserDefinedSgShrinkRequest setSgIdListShrink(String sgIdListShrink) {
        this.sgIdListShrink = sgIdListShrink;
        return this;
    }
    public String getSgIdListShrink() {
        return this.sgIdListShrink;
    }

}
