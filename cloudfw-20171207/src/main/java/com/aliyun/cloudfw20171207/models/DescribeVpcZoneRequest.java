// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcZoneRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **TransitRouter**</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member in Cloud Firewall.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static DescribeVpcZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcZoneRequest self = new DescribeVpcZoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcZoneRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public DescribeVpcZoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcZoneRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcZoneRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
