// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallManualVSwitchListRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>18820897691****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The VPC-connected instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5ewlqkuf7orclr1****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallManualVSwitchListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallManualVSwitchListRequest self = new DescribeVpcFirewallManualVSwitchListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallManualVSwitchListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallManualVSwitchListRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallManualVSwitchListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcFirewallManualVSwitchListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeVpcFirewallManualVSwitchListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
