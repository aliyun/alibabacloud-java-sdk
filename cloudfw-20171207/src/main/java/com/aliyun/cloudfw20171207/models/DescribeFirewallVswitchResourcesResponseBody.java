// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallVswitchResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A81E99DF-07CF-5EE4-966A-9FF9F2F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of vSwitches.</p>
     */
    @NameInMap("VswitchList")
    public java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchList> vswitchList;

    public static DescribeFirewallVswitchResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallVswitchResourcesResponseBody self = new DescribeFirewallVswitchResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallVswitchResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallVswitchResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFirewallVswitchResourcesResponseBody setVswitchList(java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchList> vswitchList) {
        this.vswitchList = vswitchList;
        return this;
    }
    public java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchList> getVswitchList() {
        return this.vswitchList;
    }

    public static class DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList extends TeaModel {
        /**
         * <p>The ID of the firewall instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-37145c8f5ede45e9****</p>
         */
        @NameInMap("FirewallId")
        public String firewallId;

        /**
         * <p>The name of the Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>test-Firewall</p>
         */
        @NameInMap("FirewallName")
        public String firewallName;

        /**
         * <p>The type of the Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>NatFirewall</p>
         */
        @NameInMap("FirewallType")
        public String firewallType;

        public static DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList self = new DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList setFirewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public String getFirewallId() {
            return this.firewallId;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList setFirewallName(String firewallName) {
            this.firewallName = firewallName;
            return this;
        }
        public String getFirewallName() {
            return this.firewallName;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList setFirewallType(String firewallType) {
            this.firewallType = firewallType;
            return this;
        }
        public String getFirewallType() {
            return this.firewallType;
        }

    }

    public static class DescribeFirewallVswitchResourcesResponseBodyVswitchList extends TeaModel {
        /**
         * <p>The number of available IP addresses in the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvailableIpCount")
        public String availableIpCount;

        /**
         * <p>The IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.XX/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The details of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The list of firewalls.</p>
         */
        @NameInMap("FirewallList")
        public java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList> firewallList;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-uf6ml7rgw5gzzdr****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <ul>
         * <li><p><strong>Custom</strong>: a custom route table.</p>
         * </li>
         * <li><p><strong>System</strong>: a system route table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("RouteTableType")
        public String routeTableType;

        /**
         * <p>The configuration status.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10qla9mgi42eo****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-test</p>
         */
        @NameInMap("VswitchName")
        public String vswitchName;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFirewallVswitchResourcesResponseBodyVswitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallVswitchResourcesResponseBodyVswitchList self = new DescribeFirewallVswitchResourcesResponseBodyVswitchList();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setAvailableIpCount(String availableIpCount) {
            this.availableIpCount = availableIpCount;
            return this;
        }
        public String getAvailableIpCount() {
            return this.availableIpCount;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setFirewallList(java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList> firewallList) {
            this.firewallList = firewallList;
            return this;
        }
        public java.util.List<DescribeFirewallVswitchResourcesResponseBodyVswitchListFirewallList> getFirewallList() {
            return this.firewallList;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

        public DescribeFirewallVswitchResourcesResponseBodyVswitchList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
