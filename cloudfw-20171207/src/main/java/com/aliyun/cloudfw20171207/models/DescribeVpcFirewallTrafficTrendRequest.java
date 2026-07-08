// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficTrendRequest extends TeaModel {
    /**
     * <p>The end time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1767493189</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The instance ID of the peer VPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-j6c7mscdg4hfqanfi****</p>
     */
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.21.186.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1780626107</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The instance ID of the VPC-connected instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-j6cnofg4lg1ujx3xj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficTrendRequest self = new DescribeVpcFirewallTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallTrafficTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallTrafficTrendRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public DescribeVpcFirewallTrafficTrendRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeVpcFirewallTrafficTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVpcFirewallTrafficTrendRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
