// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddTagToFlinkClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5defa51f******c92bd2ef5fb093269</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab18f***93744d</p>
     */
    @NameInMap("FlinkWorkSpaceId")
    public String flinkWorkSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flink-demo</p>
     */
    @NameInMap("FlinkWorkSpaceName")
    public String flinkWorkSpaceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>198608******7619</p>
     */
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
