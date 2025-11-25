// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallManualVSwitchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6EED3674-74E7-54DC-8FD4-6A374133****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VSwitchList")
    public java.util.List<DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList> vSwitchList;

    public static DescribeVpcFirewallManualVSwitchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallManualVSwitchListResponseBody self = new DescribeVpcFirewallManualVSwitchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallManualVSwitchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallManualVSwitchListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcFirewallManualVSwitchListResponseBody setVSwitchList(java.util.List<DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList> vSwitchList) {
        this.vSwitchList = vSwitchList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList> getVSwitchList() {
        return this.vSwitchList;
    }

    public static class DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>122167357026****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <strong>example:</strong>
         * <p>10.0.31.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>137578716100****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vtb-2zet3gyk01o07so****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp10d0kcp907721z****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vsw-test</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf62kq7c364sil2z2****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList self = new DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallManualVSwitchListResponseBodyVSwitchList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
