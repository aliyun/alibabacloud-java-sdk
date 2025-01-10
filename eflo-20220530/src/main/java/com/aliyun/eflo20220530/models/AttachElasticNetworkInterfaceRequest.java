// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AttachElasticNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the ENI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>leni-1234****</p>
     */
    @NameInMap("ElasticNetworkInterfaceId")
    public String elasticNetworkInterfaceId;

    /**
     * <p>The ID of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-lbj3aej****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID of the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachElasticNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachElasticNetworkInterfaceRequest self = new AttachElasticNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public AttachElasticNetworkInterfaceRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public AttachElasticNetworkInterfaceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AttachElasticNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
