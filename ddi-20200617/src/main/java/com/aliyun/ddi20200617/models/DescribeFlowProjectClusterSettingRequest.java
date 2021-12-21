// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowProjectClusterSettingRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowProjectClusterSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowProjectClusterSettingRequest self = new DescribeFlowProjectClusterSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowProjectClusterSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowProjectClusterSettingRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowProjectClusterSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
