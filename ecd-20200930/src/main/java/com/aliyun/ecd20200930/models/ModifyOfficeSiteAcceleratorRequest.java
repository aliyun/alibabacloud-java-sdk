// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAcceleratorRequest extends TeaModel {
    /**
     * <p>The information about the regions to accelerate.</p>
     */
    @NameInMap("AccelerateRegion")
    public java.util.List<ModifyOfficeSiteAcceleratorRequestAccelerateRegion> accelerateRegion;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAcceleratorRequest self = new ModifyOfficeSiteAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAcceleratorRequest setAccelerateRegion(java.util.List<ModifyOfficeSiteAcceleratorRequestAccelerateRegion> accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }
    public java.util.List<ModifyOfficeSiteAcceleratorRequestAccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    public ModifyOfficeSiteAcceleratorRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyOfficeSiteAcceleratorRequestAccelerateRegion extends TeaModel {
        /**
         * <p>The ID of the region to accelerate.</p>
         * <p>The number of regions that you can add is limited by the total bandwidth and the instance type of the GA instance. For more information about the number of access regions supported by each instance type, see <a href="t1855472.xdita#">Overview of GA instances</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The peak public bandwidth. Unit: Mbps.</p>
         * <blockquote>
         * <p>For the pay-by-bandwidth metering method, the value ranges from 10 to 1000.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The IP protocol version used to access GA instances. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong> (default)</p>
         * </li>
         * <li><p><strong>IPv6</strong></p>
         * </li>
         * <li><p><strong>DUAL_STACK</strong>: IPv4 and IPv6</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Only standard pay-as-you-go GA instances support the DUAL_STACK option.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The Internet line type in the acceleration region. Valid values:</p>
         * <ul>
         * <li><p><strong>BGP</strong>: BGP (Multi-ISP) lines.</p>
         * </li>
         * <li><p><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is required for GA instances that use the pay-by-data-transfer metering method.</p>
         * </li>
         * <li><p>The supported line types vary based on the acceleration region.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("IspType")
        public String ispType;

        public static ModifyOfficeSiteAcceleratorRequestAccelerateRegion build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfficeSiteAcceleratorRequestAccelerateRegion self = new ModifyOfficeSiteAcceleratorRequestAccelerateRegion();
            return TeaModel.build(map, self);
        }

        public ModifyOfficeSiteAcceleratorRequestAccelerateRegion setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public ModifyOfficeSiteAcceleratorRequestAccelerateRegion setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ModifyOfficeSiteAcceleratorRequestAccelerateRegion setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ModifyOfficeSiteAcceleratorRequestAccelerateRegion setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

    }

}
