// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeSiteAcceleratorRequest extends TeaModel {
    /**
     * <p>The list of acceleration region information for the access points.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccelerateRegion")
    public java.util.List<CreateOfficeSiteAcceleratorRequestAccelerateRegion> accelerateRegion;

    /**
     * <p>The name of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testGA</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+dir-259382****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-3mtuc28rx95lx****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateOfficeSiteAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeSiteAcceleratorRequest self = new CreateOfficeSiteAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeSiteAcceleratorRequest setAccelerateRegion(java.util.List<CreateOfficeSiteAcceleratorRequestAccelerateRegion> accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }
    public java.util.List<CreateOfficeSiteAcceleratorRequestAccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    public CreateOfficeSiteAcceleratorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOfficeSiteAcceleratorRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateOfficeSiteAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOfficeSiteAcceleratorRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class CreateOfficeSiteAcceleratorRequestAccelerateRegion extends TeaModel {
        /**
         * <p>The ID of the acceleration region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth allocated to the acceleration region. Unit: Mbit/s.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The IP address protocol used to connect to the GA service.</p>
         * <blockquote>
         * <p>The <code>DUAL_STACK</code> type is supported only by standard pay-as-you-go GA instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The public network line type of the acceleration region.</p>
         * <blockquote>
         * <ul>
         * <li>Configure this parameter for GA instances that use the <strong>pay-by-data-transfer</strong> billing method.</li>
         * <li>The supported public network line types vary by acceleration region.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("IspType")
        public String ispType;

        public static CreateOfficeSiteAcceleratorRequestAccelerateRegion build(java.util.Map<String, ?> map) throws Exception {
            CreateOfficeSiteAcceleratorRequestAccelerateRegion self = new CreateOfficeSiteAcceleratorRequestAccelerateRegion();
            return TeaModel.build(map, self);
        }

        public CreateOfficeSiteAcceleratorRequestAccelerateRegion setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public CreateOfficeSiteAcceleratorRequestAccelerateRegion setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateOfficeSiteAcceleratorRequestAccelerateRegion setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public CreateOfficeSiteAcceleratorRequestAccelerateRegion setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

    }

}
