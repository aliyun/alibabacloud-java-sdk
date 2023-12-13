// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The information about the resource that you want to query.</p>
     */
    @NameInMap("DestinationResource")
    public DescribeAvailableResourceRequestDestinationResource destinationResource;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the ECS instance families.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~146965~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about the preemptible instances that you want to query.</p>
     */
    @NameInMap("SpotResource")
    public DescribeAvailableResourceRequestSpotResource spotResource;

    /**
     * <p>The zone ID of the ECS instance families.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that ECS instance families available in all zones in the specified region are queried.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setDestinationResource(DescribeAvailableResourceRequestDestinationResource destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public DescribeAvailableResourceRequestDestinationResource getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeAvailableResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailableResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailableResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableResourceRequest setSpotResource(DescribeAvailableResourceRequestSpotResource spotResource) {
        this.spotResource = spotResource;
        return this;
    }
    public DescribeAvailableResourceRequestSpotResource getSpotResource() {
        return this.spotResource;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeAvailableResourceRequestDestinationResource extends TeaModel {
        /**
         * <p>The type of the resource. Valid values:</p>
         * <br>
         * <p>*   InstanceTypeFamily: queries instance families. If you use this parameter value, you must also specify the Value parameter.</p>
         * <p>*   InstanceType: queries instance types. If you use this parameter value, you must also specify the Value, Cores, and Memory parameters.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of vCPUs. This parameter is available only when the Category parameter is set to InstanceType.</p>
         */
        @NameInMap("Cores")
        public Float cores;

        /**
         * <p>The size of the memory. Unit: GiB. This parameter is available only when the Category parameter is set to InstanceType.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>Instance families or instance types.</p>
         * <br>
         * <p>*   If you set Category to InstanceTypeFamily, you must set this parameter to instance families such as ecs.c5.</p>
         * <p>*   If you set Category to InstanceType, you must set this parameter to instance types such as ecs.c5.large.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAvailableResourceRequestDestinationResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceRequestDestinationResource self = new DescribeAvailableResourceRequestDestinationResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceRequestDestinationResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAvailableResourceRequestDestinationResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public DescribeAvailableResourceRequestDestinationResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeAvailableResourceRequestDestinationResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAvailableResourceRequestSpotResource extends TeaModel {
        /**
         * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. The value of 0 indicates no protection period.</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places. If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Double spotPriceLimit;

        /**
         * <p>The bidding policy for the elastic container instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The instance is created as a regular pay-as-you-go instance.</p>
         * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</p>
         * <br>
         * <p>Default value: NoSpot.</p>
         * <br>
         * <p>> If you set this parameter to SpotWithPriceLimit or SpotAsPriceGo to query preemptible instances, you must set Category to InstanceType. You must also use the Value parameter to specify instance types, or use the Cores and Memory parameters to specify the number of vCPUs and memory size.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static DescribeAvailableResourceRequestSpotResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceRequestSpotResource self = new DescribeAvailableResourceRequestSpotResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceRequestSpotResource setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeAvailableResourceRequestSpotResource setSpotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Double getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeAvailableResourceRequestSpotResource setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

}
