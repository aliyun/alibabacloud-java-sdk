// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeRdsVSwitchsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VSwitches")
    public DescribeRdsVSwitchsResponseBodyVSwitches vSwitches;

    public static DescribeRdsVSwitchsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVSwitchsResponseBody self = new DescribeRdsVSwitchsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVSwitchsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsVSwitchsResponseBody setVSwitches(DescribeRdsVSwitchsResponseBodyVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeRdsVSwitchsResponseBodyVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IzNo")
        public String izNo;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch self = new DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeRdsVSwitchsResponseBodyVSwitches extends TeaModel {
        @NameInMap("VSwitch")
        public java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> vSwitch;

        public static DescribeRdsVSwitchsResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVSwitchsResponseBodyVSwitches self = new DescribeRdsVSwitchsResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVSwitchsResponseBodyVSwitches setVSwitch(java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeRdsVSwitchsResponseBodyVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}
