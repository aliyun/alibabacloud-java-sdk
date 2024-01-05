// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddTagToFlinkClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("FlinkWorkSpaceId")
    public String flinkWorkSpaceId;

    @NameInMap("FlinkWorkSpaceName")
    public String flinkWorkSpaceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static AddTagToFlinkClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagToFlinkClusterRequest self = new AddTagToFlinkClusterRequest();
        return TeaModel.build(map, self);
    }

    public AddTagToFlinkClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddTagToFlinkClusterRequest setFlinkWorkSpaceId(String flinkWorkSpaceId) {
        this.flinkWorkSpaceId = flinkWorkSpaceId;
        return this;
    }
    public String getFlinkWorkSpaceId() {
        return this.flinkWorkSpaceId;
    }

    public AddTagToFlinkClusterRequest setFlinkWorkSpaceName(String flinkWorkSpaceName) {
        this.flinkWorkSpaceName = flinkWorkSpaceName;
        return this;
    }
    public String getFlinkWorkSpaceName() {
        return this.flinkWorkSpaceName;
    }

    public AddTagToFlinkClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagToFlinkClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddTagToFlinkClusterRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
