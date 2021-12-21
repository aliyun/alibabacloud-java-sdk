// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowNodeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceRequest self = new DescribeFlowNodeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowNodeInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowNodeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
