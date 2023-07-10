// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRdsVpcsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the VPCs.</p>
     */
    @NameInMap("Vpcs")
    public DescribeRdsVpcsResponseBodyVpcs vpcs;

    public static DescribeRdsVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVpcsResponseBody self = new DescribeRdsVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsVpcsResponseBody setVpcs(DescribeRdsVpcsResponseBodyVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeRdsVpcsResponseBodyVpcs getVpcs() {
        return this.vpcs;
    }

    public static class DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs extends TeaModel {
        /**
         * <p>The CIDR block of the vSwitch.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The state of the vSwitch. If **Available** is returned, the vSwitch is available.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs self = new DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs();
            return TeaModel.build(map, self);
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

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
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

        public DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeRdsVpcsResponseBodyVpcsVpc extends TeaModel {
        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The CIDR block of the VPC.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the VPC is the default VPC. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The state of the VPC. If **Available** is returned, the VPC is available.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Details of the vSwitches.</p>
         */
        @NameInMap("VSwitchs")
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> vSwitchs;

        /**
         * <p>The ID of VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeRdsVpcsResponseBodyVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVpcsResponseBodyVpcsVpc self = new DescribeRdsVpcsResponseBodyVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVSwitchs(java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<DescribeRdsVpcsResponseBodyVpcsVpcVSwitchs> getVSwitchs() {
            return this.vSwitchs;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRdsVpcsResponseBodyVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeRdsVpcsResponseBodyVpcs extends TeaModel {
        /**
         * <p>Details of the VPC.</p>
         */
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
