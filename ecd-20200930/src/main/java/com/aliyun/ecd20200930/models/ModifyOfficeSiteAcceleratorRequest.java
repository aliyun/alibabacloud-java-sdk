// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAcceleratorRequest extends TeaModel {
    @NameInMap("AccelerateRegion")
    public java.util.List<ModifyOfficeSiteAcceleratorRequestAccelerateRegion> accelerateRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
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
