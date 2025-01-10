// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNodeInfosForPodRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the node for this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>node-be70****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListNodeInfosForPodRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInfosForPodRequest self = new ListNodeInfosForPodRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeInfosForPodRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodeInfosForPodRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListNodeInfosForPodRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNodeInfosForPodRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
