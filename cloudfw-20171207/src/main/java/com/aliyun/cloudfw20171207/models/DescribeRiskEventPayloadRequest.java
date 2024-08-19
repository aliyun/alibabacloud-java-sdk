// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventPayloadRequest extends TeaModel {
    /**
     * <p>The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.2</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The ID of the destination VPC to query. If you specify this parameter, all intrusion events that contain the specified ID of the destination VPC are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6jr1klwqb60dyn2****</p>
     */
    @NameInMap("DstVpcId")
    public String dstVpcId;

    /**
     * <p>The end of the time range to query. The value is a timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1681288980</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the firewall. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewall</li>
     * <li><strong>InternetFirewall</strong> (default): Internet firewall</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The public IP address. If you specify this parameter, all intrusion events that contain the specified public IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.3</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The source IP address to query. If you specify this parameter, all intrusion events from the specified source IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>203.0.113.1</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The ID of the source VPC to query. If you specify this parameter, all intrusion events that contain the specified ID of the source VPC are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9j2lqyo15udw5nt****</p>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The beginning of the time range to query. The value is a timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1669533617</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The UUID of the intrusion event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e62c25e0-1073-46bd-9567-b8f12b3d****</p>
     */
    @NameInMap("UUID")
    public String UUID;

    public static DescribeRiskEventPayloadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventPayloadRequest self = new DescribeRiskEventPayloadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventPayloadRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeRiskEventPayloadRequest setDstVpcId(String dstVpcId) {
        this.dstVpcId = dstVpcId;
        return this;
    }
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    public DescribeRiskEventPayloadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventPayloadRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeRiskEventPayloadRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeRiskEventPayloadRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeRiskEventPayloadRequest setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public DescribeRiskEventPayloadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRiskEventPayloadRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
