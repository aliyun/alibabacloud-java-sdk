// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAckClusterConnectorRequest extends TeaModel {
    /**
     * <p>The ACK cluster ID. You can call the following operation to obtain the value:</p>
     * <ul>
     * <li><a href="~~DescribeAckClusters~~">DescribeAckClusters</a>: Lists ACK clusters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the ACK cluster connector. The name must be 1 to 64 characters in length and can contain letters, digits, Chinese characters, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-cluster-connector-name</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <p>The Alibaba Cloud UID of the account to which the ACK cluster resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The primary vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
     * <ul>
     * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Lists the vSwitches of synchronization nodes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zerfbbje7dvnbii2****</p>
     */
    @NameInMap("PrimaryVswitchId")
    public String primaryVswitchId;

    /**
     * <p>The IP address of the primary vSwitch of the ACK cluster connector.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.1.1</p>
     */
    @NameInMap("PrimaryVswitchIp")
    public String primaryVswitchIp;

    /**
     * <p>The region ID of the ACK cluster connector. You can call the following operation to obtain the value:</p>
     * <ul>
     * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Lists the regions of synchronization nodes.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the regions supported by ACK cluster connectors in Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK cluster synchronization nodes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The standby vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
     * <ul>
     * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Lists the vSwitches of synchronization nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-2ze2gtlfozrab01cfo****</p>
     */
    @NameInMap("StandbyVswitchId")
    public String standbyVswitchId;

    /**
     * <p>The IP address of the standby vSwitch of the ACK cluster connector.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.2.1</p>
     */
    @NameInMap("StandbyVswitchIp")
    public String standbyVswitchIp;

    /**
     * <p>The synchronization interval of the ACK cluster connector. Valid values: 2 to 60. Unit: seconds.</p>
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
