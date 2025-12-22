// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteUserDefinedSgShrinkRequest extends TeaModel {
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

    public static DeleteUserDefinedSgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefinedSgShrinkRequest self = new DeleteUserDefinedSgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefinedSgShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteUserDefinedSgShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUserDefinedSgShrinkRequest setSgIdListShrink(String sgIdListShrink) {
        this.sgIdListShrink = sgIdListShrink;
        return this;
    }
    public String getSgIdListShrink() {
        return this.sgIdListShrink;
    }

}
