// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about a machine group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroup")
    public NodeGroupConfig nodeGroup;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupRequest self = new CreateNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodeGroupRequest setNodeGroup(NodeGroupConfig nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public NodeGroupConfig getNodeGroup() {
        return this.nodeGroup;
    }

    public CreateNodeGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
