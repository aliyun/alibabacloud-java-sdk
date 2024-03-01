// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcListLiteRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcName")
    public String vpcName;

    public static DescribeVpcListLiteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListLiteRequest self = new DescribeVpcListLiteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListLiteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcListLiteRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeVpcListLiteRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeVpcListLiteRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpcListLiteRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
