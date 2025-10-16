// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallVSwitchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A1562A68-99FA-5D6B-BD5B-2F959F25****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VswitchList")
    public java.util.List<DescribeFirewallVSwitchResponseBodyVswitchList> vswitchList;

    public static DescribeFirewallVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallVSwitchResponseBody self = new DescribeFirewallVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallVSwitchResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFirewallVSwitchResponseBody setVswitchList(java.util.List<DescribeFirewallVSwitchResponseBodyVswitchList> vswitchList) {
        this.vswitchList = vswitchList;
        return this;
    }
    public java.util.List<DescribeFirewallVSwitchResponseBodyVswitchList> getVswitchList() {
        return this.vswitchList;
    }

    public static class DescribeFirewallVSwitchResponseBodyVswitchListFirewallList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vfw-tr-37145c8f5ede45e9****</p>
         */
        @NameInMap("FirewallId")
        public String firewallId;

        /**
         * <strong>example:</strong>
         * <p>test-Firewall</p>
         */
        @NameInMap("FirewallName")
        public String firewallName;

        public static DescribeFirewallVSwitchResponseBodyVswitchListFirewallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallVSwitchResponseBodyVswitchListFirewallList self = new DescribeFirewallVSwitchResponseBodyVswitchListFirewallList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallVSwitchResponseBodyVswitchListFirewallList setFirewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public String getFirewallId() {
            return this.firewallId;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchListFirewallList setFirewallName(String firewallName) {
            this.firewallName = firewallName;
            return this;
        }
        public String getFirewallName() {
            return this.firewallName;
        }

    }

    public static class DescribeFirewallVSwitchResponseBodyVswitchList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvailableIpCount")
        public String availableIpCount;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.XX/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FirewallCount")
        public String firewallCount;

        @NameInMap("FirewallList")
        public java.util.List<DescribeFirewallVSwitchResponseBodyVswitchListFirewallList> firewallList;

        /**
         * <strong>example:</strong>
         * <p>184480249330****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zeez7gymz5r4pi****am</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp10qla9mgi42eo****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>vsw-test</p>
         */
        @NameInMap("VswitchName")
        public String vswitchName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFirewallVSwitchResponseBodyVswitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallVSwitchResponseBodyVswitchList self = new DescribeFirewallVSwitchResponseBodyVswitchList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setAvailableIpCount(String availableIpCount) {
            this.availableIpCount = availableIpCount;
            return this;
        }
        public String getAvailableIpCount() {
            return this.availableIpCount;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setFirewallCount(String firewallCount) {
            this.firewallCount = firewallCount;
            return this;
        }
        public String getFirewallCount() {
            return this.firewallCount;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setFirewallList(java.util.List<DescribeFirewallVSwitchResponseBodyVswitchListFirewallList> firewallList) {
            this.firewallList = firewallList;
            return this;
        }
        public java.util.List<DescribeFirewallVSwitchResponseBodyVswitchListFirewallList> getFirewallList() {
            return this.firewallList;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

        public DescribeFirewallVSwitchResponseBodyVswitchList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
