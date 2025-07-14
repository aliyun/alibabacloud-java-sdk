// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNodeGroupShrinkRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i118191731740041623425</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Node ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroup")
    public String nodeGroupShrink;

    /**
     * <p>Node information</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;NodeUnitId\&quot;:\&quot;3c2999a8-2b95-4409-93c5-ad3985fc5c9f\&quot;,\&quot;ResourceGroupId\&quot;:\&quot;\&quot;,\&quot;MaxNodes\&quot;:0,\&quot;NodeUnitName\&quot;:\&quot;asi_cn-serverless-sale_e01-lingjun-psale\&quot;}</p>
     */
    @NameInMap("NodeUnit")
    public String nodeUnitShrink;

    public static CreateNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupShrinkRequest self = new CreateNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodeGroupShrinkRequest setNodeGroupShrink(String nodeGroupShrink) {
        this.nodeGroupShrink = nodeGroupShrink;
        return this;
    }
    public String getNodeGroupShrink() {
        return this.nodeGroupShrink;
    }

    public CreateNodeGroupShrinkRequest setNodeUnitShrink(String nodeUnitShrink) {
        this.nodeUnitShrink = nodeUnitShrink;
        return this;
    }
    public String getNodeUnitShrink() {
        return this.nodeUnitShrink;
    }

}
