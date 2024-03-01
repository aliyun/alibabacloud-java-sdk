// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcZoneRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public String memberUid;

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
