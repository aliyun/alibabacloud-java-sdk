// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeVSwitchsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B892DA2-9ABC-5CC0-AD73-405479C3FA53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried vSwitches.</p>
     */
    @NameInMap("VSwitches")
    public DescribeVSwitchsResponseBodyVSwitches vSwitches;

    public static DescribeVSwitchsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchsResponseBody self = new DescribeVSwitchsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchsResponseBody setVSwitches(DescribeVSwitchsResponseBodyVSwitches vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public DescribeVSwitchsResponseBodyVSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static class DescribeVSwitchsResponseBodyVSwitchesVSwitch extends TeaModel {
        /**
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>195813423043****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The ID of the user channel.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The time when the vSwitch was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-18T12:43:57Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the vSwitch was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-22T12:43:57Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch. Valid values: <strong>true</strong>: The vSwitch is the default vSwitch. <strong>false</strong>: The vSwitch is not the default vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The zone ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>The region ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The state of the vSwitch. Valid values: <strong>Pending</strong>: the vSwitch is being configured. <strong>Available</strong>: the vSwitch is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-25bcdxs7pv1****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>VSW-Test-hangzhou-I</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        public static DescribeVSwitchsResponseBodyVSwitchesVSwitch build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchsResponseBodyVSwitchesVSwitch self = new DescribeVSwitchsResponseBodyVSwitchesVSwitch();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVSwitchsResponseBodyVSwitchesVSwitch setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

    }

    public static class DescribeVSwitchsResponseBodyVSwitches extends TeaModel {
        /**
         * <p>The queried vSwitch.</p>
         */
        @NameInMap("VSwitch")
        public java.util.List<DescribeVSwitchsResponseBodyVSwitchesVSwitch> vSwitch;

        public static DescribeVSwitchsResponseBodyVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchsResponseBodyVSwitches self = new DescribeVSwitchsResponseBodyVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchsResponseBodyVSwitches setVSwitch(java.util.List<DescribeVSwitchsResponseBodyVSwitchesVSwitch> vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public java.util.List<DescribeVSwitchsResponseBodyVSwitchesVSwitch> getVSwitch() {
            return this.vSwitch;
        }

    }

}
