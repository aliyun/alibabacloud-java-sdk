// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRdsVpcsResponseBody extends TeaModel {
    @NameInMap("Vpcs")
    public DescribeRdsVpcsResponseBodyVpcs vpcs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRdsVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVpcsResponseBody self = new DescribeRdsVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVpcsResponseBody setVpcs(DescribeRdsVpcsResponseBodyVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeRdsVpcsResponseBodyVpcs getVpcs() {
        return this.vpcs;
    }

    public DescribeRdsVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IzNo")
        public String izNo;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs self = new DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeRdsVpcsResponseBodyVpcsVpc extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("VSwitchs")
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> vSwitchs;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Bid")
        public String bid;

        public static DescribeRdsVpcsResponseBodyVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVpcsResponseBodyVpcsVpc self = new DescribeRdsVpcsResponseBodyVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVSwitchs(java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> getVSwitchs() {
            return this.vSwitchs;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

    }

    public static class DescribeRdsVpcsResponseBodyVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpc> vpc;

        public static DescribeRdsVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVpcsResponseBodyVpcs self = new DescribeRdsVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVpcsResponseBodyVpcs setVpc(java.util.List<DescribeRdsVpcsResponseBodyVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
