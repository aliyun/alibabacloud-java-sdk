// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("DestinationResource")
    @Validation(required = true)
    public String destinationResource;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    @NameInMap("NetworkCategory")
    public String networkCategory;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scope")
    public String scope;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailableResourceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeAvailableResourceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public DescribeAvailableResourceRequest setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public String getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeAvailableResourceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeAvailableResourceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeAvailableResourceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeAvailableResourceRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public DescribeAvailableResourceRequest setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public DescribeAvailableResourceRequest setNetworkCategory(String networkCategory) {
        this.networkCategory = networkCategory;
        return this;
    }
    public String getNetworkCategory() {
        return this.networkCategory;
    }

    public DescribeAvailableResourceRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeAvailableResourceRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeAvailableResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeAvailableResourceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
