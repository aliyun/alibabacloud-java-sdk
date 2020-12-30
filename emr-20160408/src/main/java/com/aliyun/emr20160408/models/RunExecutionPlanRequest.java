// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunExecutionPlanRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Arguments")
    public java.util.Map<String, ?> arguments;

    public static RunExecutionPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RunExecutionPlanRequest self = new RunExecutionPlanRequest();
        return TeaModel.build(map, self);
    }

    public RunExecutionPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunExecutionPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunExecutionPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RunExecutionPlanRequest setArguments(java.util.Map<String, ?> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.Map<String, ?> getArguments() {
        return this.arguments;
    }

}
