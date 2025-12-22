// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class AddUserDefinedSgShrinkRequest extends TeaModel {
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

    public static AddUserDefinedSgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserDefinedSgShrinkRequest self = new AddUserDefinedSgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddUserDefinedSgShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUserDefinedSgShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserDefinedSgShrinkRequest setSgIdListShrink(String sgIdListShrink) {
        this.sgIdListShrink = sgIdListShrink;
        return this;
    }
    public String getSgIdListShrink() {
        return this.sgIdListShrink;
    }

}
