// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAckClusterConnectorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-cluster-connector-name</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zerfbbje7dvnbii2****</p>
     */
    @NameInMap("PrimaryVswitchId")
    public String primaryVswitchId;

    /**
     * <strong>example:</strong>
     * <p>10.100.1.1</p>
     */
    @NameInMap("PrimaryVswitchIp")
    public String primaryVswitchIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>vsw-2ze2gtlfozrab01cfo****</p>
     */
    @NameInMap("StandbyVswitchId")
    public String standbyVswitchId;

    /**
     * <strong>example:</strong>
     * <p>10.100.2.1</p>
     */
    @NameInMap("StandbyVswitchIp")
    public String standbyVswitchIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public String ttl;

    public static CreateAckClusterConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAckClusterConnectorRequest self = new CreateAckClusterConnectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAckClusterConnectorRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateAckClusterConnectorRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public CreateAckClusterConnectorRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateAckClusterConnectorRequest setPrimaryVswitchId(String primaryVswitchId) {
        this.primaryVswitchId = primaryVswitchId;
        return this;
    }
    public String getPrimaryVswitchId() {
        return this.primaryVswitchId;
    }

    public CreateAckClusterConnectorRequest setPrimaryVswitchIp(String primaryVswitchIp) {
        this.primaryVswitchIp = primaryVswitchIp;
        return this;
    }
    public String getPrimaryVswitchIp() {
        return this.primaryVswitchIp;
    }

    public CreateAckClusterConnectorRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public CreateAckClusterConnectorRequest setStandbyVswitchId(String standbyVswitchId) {
        this.standbyVswitchId = standbyVswitchId;
        return this;
    }
    public String getStandbyVswitchId() {
        return this.standbyVswitchId;
    }

    public CreateAckClusterConnectorRequest setStandbyVswitchIp(String standbyVswitchIp) {
        this.standbyVswitchIp = standbyVswitchIp;
        return this;
    }
    public String getStandbyVswitchIp() {
        return this.standbyVswitchIp;
    }

    public CreateAckClusterConnectorRequest setTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }
    public String getTtl() {
        return this.ttl;
    }

}
