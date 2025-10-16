// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceVSwitchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>450D47F5-956E-543E-8502-2F71C8C54E72</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Zones")
    public java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZones> zones;

    public static DescribeAccessInstanceVSwitchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceVSwitchListResponseBody self = new DescribeAccessInstanceVSwitchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceVSwitchListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAccessInstanceVSwitchListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessInstanceVSwitchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessInstanceVSwitchListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessInstanceVSwitchListResponseBody setZones(java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>254</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FirewallVSwitch")
        public Boolean firewallVSwitch;

        /**
         * <strong>example:</strong>
         * <p>vsw-qzeaol304m***</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>ManagedVSW</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf6b5lyul0x******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList self = new DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setFirewallVSwitch(Boolean firewallVSwitch) {
            this.firewallVSwitch = firewallVSwitch;
            return this;
        }
        public Boolean getFirewallVSwitch() {
            return this.firewallVSwitch;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeAccessInstanceVSwitchListResponseBodyZones extends TeaModel {
        @NameInMap("VSwitchList")
        public java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList> vSwitchList;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAccessInstanceVSwitchListResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessInstanceVSwitchListResponseBodyZones self = new DescribeAccessInstanceVSwitchListResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZones setVSwitchList(java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }
        public java.util.List<DescribeAccessInstanceVSwitchListResponseBodyZonesVSwitchList> getVSwitchList() {
            return this.vSwitchList;
        }

        public DescribeAccessInstanceVSwitchListResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
