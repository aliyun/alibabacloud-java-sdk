// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunExecutionPlanShrinkRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Arguments")
    public String argumentsShrink;

    public static RunExecutionPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunExecutionPlanShrinkRequest self = new RunExecutionPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunExecutionPlanShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunExecutionPlanShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunExecutionPlanShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RunExecutionPlanShrinkRequest setArgumentsShrink(String argumentsShrink) {
        this.argumentsShrink = argumentsShrink;
        return this;
    }
    public String getArgumentsShrink() {
        return this.argumentsShrink;
    }

}
