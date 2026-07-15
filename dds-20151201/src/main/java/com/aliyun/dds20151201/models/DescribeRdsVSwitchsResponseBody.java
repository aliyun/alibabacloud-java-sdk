// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRdsVSwitchsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60EEBD77-227C-5B39-86EA-D89163C5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of vSwitches.</p>
     */
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
        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>192.<strong>.</strong>.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The vSwitch is the default vSwitch.</p>
         * </li>
         * <li><p><strong>false</strong>: The vSwitch is not the default vSwitch.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <p>This parameter is deprecated. No value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The status of the vSwitch. A value of <strong>Available</strong> indicates that the vSwitch is active.</p>
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
         * <p>vsw-bp*******************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-name</p>
         */
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
        /**
         * <p>The vSwitch information.</p>
         */
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
