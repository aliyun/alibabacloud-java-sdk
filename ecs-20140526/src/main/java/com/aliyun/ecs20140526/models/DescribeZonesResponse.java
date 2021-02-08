// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public DescribeZonesResponseZones zones;

    public static DescribeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponse self = new DescribeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponse setZones(DescribeZonesResponseZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories extends TeaModel {
        // supportedSystemDiskCategory
        @NameInMap("supportedSystemDiskCategory")
        @Validation(required = true)
        public java.util.List<String> supportedSystemDiskCategory;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories setSupportedSystemDiskCategory(java.util.List<String> supportedSystemDiskCategory) {
            this.supportedSystemDiskCategory = supportedSystemDiskCategory;
            return this;
        }
        public java.util.List<String> getSupportedSystemDiskCategory() {
            return this.supportedSystemDiskCategory;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories extends TeaModel {
        // supportedDataDiskCategory
        @NameInMap("supportedDataDiskCategory")
        @Validation(required = true)
        public java.util.List<String> supportedDataDiskCategory;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories setSupportedDataDiskCategory(java.util.List<String> supportedDataDiskCategory) {
            this.supportedDataDiskCategory = supportedDataDiskCategory;
            return this;
        }
        public java.util.List<String> getSupportedDataDiskCategory() {
            return this.supportedDataDiskCategory;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes extends TeaModel {
        // supportedNetworkCategory
        @NameInMap("supportedNetworkCategory")
        @Validation(required = true)
        public java.util.List<String> supportedNetworkCategory;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes setSupportedNetworkCategory(java.util.List<String> supportedNetworkCategory) {
            this.supportedNetworkCategory = supportedNetworkCategory;
            return this;
        }
        public java.util.List<String> getSupportedNetworkCategory() {
            return this.supportedNetworkCategory;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes extends TeaModel {
        // supportedInstanceType
        @NameInMap("supportedInstanceType")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceType;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes setSupportedInstanceType(java.util.List<String> supportedInstanceType) {
            this.supportedInstanceType = supportedInstanceType;
            return this;
        }
        public java.util.List<String> getSupportedInstanceType() {
            return this.supportedInstanceType;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies extends TeaModel {
        // supportedInstanceTypeFamily
        @NameInMap("supportedInstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations extends TeaModel {
        // supportedInstanceGeneration
        @NameInMap("supportedInstanceGeneration")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceGeneration;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations setSupportedInstanceGeneration(java.util.List<String> supportedInstanceGeneration) {
            this.supportedInstanceGeneration = supportedInstanceGeneration;
            return this;
        }
        public java.util.List<String> getSupportedInstanceGeneration() {
            return this.supportedInstanceGeneration;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo extends TeaModel {
        @NameInMap("IoOptimized")
        @Validation(required = true)
        public Boolean ioOptimized;

        @NameInMap("SystemDiskCategories")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories systemDiskCategories;

        @NameInMap("DataDiskCategories")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories dataDiskCategories;

        @NameInMap("NetworkTypes")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes networkTypes;

        @NameInMap("InstanceTypes")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes instanceTypes;

        @NameInMap("InstanceTypeFamilies")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies instanceTypeFamilies;

        @NameInMap("InstanceGenerations")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations instanceGenerations;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setSystemDiskCategories(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setDataDiskCategories(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories dataDiskCategories) {
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoDataDiskCategories getDataDiskCategories() {
            return this.dataDiskCategories;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setNetworkTypes(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoNetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setInstanceTypes(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setInstanceTypeFamilies(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo setInstanceGenerations(DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoInstanceGenerations getInstanceGenerations() {
            return this.instanceGenerations;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResources extends TeaModel {
        @NameInMap("ResourcesInfo")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo> resourcesInfo;

        public static DescribeZonesResponseZonesZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResources self = new DescribeZonesResponseZonesZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResources setResourcesInfo(java.util.List<DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo> resourcesInfo) {
            this.resourcesInfo = resourcesInfo;
            return this;
        }
        public java.util.List<DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo> getResourcesInfo() {
            return this.resourcesInfo;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableResourceCreation extends TeaModel {
        // ResourceTypes
        @NameInMap("ResourceTypes")
        @Validation(required = true)
        public java.util.List<String> resourceTypes;

        public static DescribeZonesResponseZonesZoneAvailableResourceCreation build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourceCreation self = new DescribeZonesResponseZonesZoneAvailableResourceCreation();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableResourceCreation setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableDiskCategories extends TeaModel {
        // DiskCategories
        @NameInMap("DiskCategories")
        @Validation(required = true)
        public java.util.List<String> diskCategories;

        public static DescribeZonesResponseZonesZoneAvailableDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableDiskCategories self = new DescribeZonesResponseZonesZoneAvailableDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableDiskCategories setDiskCategories(java.util.List<String> diskCategories) {
            this.diskCategories = diskCategories;
            return this;
        }
        public java.util.List<String> getDiskCategories() {
            return this.diskCategories;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableInstanceTypes extends TeaModel {
        // InstanceTypes
        @NameInMap("InstanceTypes")
        @Validation(required = true)
        public java.util.List<String> instanceTypes;

        public static DescribeZonesResponseZonesZoneAvailableInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableInstanceTypes self = new DescribeZonesResponseZonesZoneAvailableInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableInstanceTypes setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableVolumeCategories extends TeaModel {
        // VolumeCategories
        @NameInMap("VolumeCategories")
        @Validation(required = true)
        public java.util.List<String> volumeCategories;

        public static DescribeZonesResponseZonesZoneAvailableVolumeCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableVolumeCategories self = new DescribeZonesResponseZonesZoneAvailableVolumeCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableVolumeCategories setVolumeCategories(java.util.List<String> volumeCategories) {
            this.volumeCategories = volumeCategories;
            return this;
        }
        public java.util.List<String> getVolumeCategories() {
            return this.volumeCategories;
        }

    }

    public static class DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes extends TeaModel {
        // DedicatedHostType
        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public java.util.List<String> dedicatedHostType;

        public static DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes self = new DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes setDedicatedHostType(java.util.List<String> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<String> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

    public static class DescribeZonesResponseZonesZoneDedicatedHostGenerations extends TeaModel {
        // DedicatedHostGeneration
        @NameInMap("DedicatedHostGeneration")
        @Validation(required = true)
        public java.util.List<String> dedicatedHostGeneration;

        public static DescribeZonesResponseZonesZoneDedicatedHostGenerations build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneDedicatedHostGenerations self = new DescribeZonesResponseZonesZoneDedicatedHostGenerations();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZoneDedicatedHostGenerations setDedicatedHostGeneration(java.util.List<String> dedicatedHostGeneration) {
            this.dedicatedHostGeneration = dedicatedHostGeneration;
            return this;
        }
        public java.util.List<String> getDedicatedHostGeneration() {
            return this.dedicatedHostGeneration;
        }

    }

    public static class DescribeZonesResponseZonesZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        @NameInMap("AvailableResources")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResources availableResources;

        @NameInMap("AvailableResourceCreation")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableResourceCreation availableResourceCreation;

        @NameInMap("AvailableDiskCategories")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableDiskCategories availableDiskCategories;

        @NameInMap("AvailableInstanceTypes")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableInstanceTypes availableInstanceTypes;

        @NameInMap("AvailableVolumeCategories")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableVolumeCategories availableVolumeCategories;

        @NameInMap("AvailableDedicatedHostTypes")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes availableDedicatedHostTypes;

        @NameInMap("DedicatedHostGenerations")
        @Validation(required = true)
        public DescribeZonesResponseZonesZoneDedicatedHostGenerations dedicatedHostGenerations;

        public static DescribeZonesResponseZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZone self = new DescribeZonesResponseZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseZonesZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseZonesZone setAvailableResources(DescribeZonesResponseZonesZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public DescribeZonesResponseZonesZone setAvailableResourceCreation(DescribeZonesResponseZonesZoneAvailableResourceCreation availableResourceCreation) {
            this.availableResourceCreation = availableResourceCreation;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableResourceCreation getAvailableResourceCreation() {
            return this.availableResourceCreation;
        }

        public DescribeZonesResponseZonesZone setAvailableDiskCategories(DescribeZonesResponseZonesZoneAvailableDiskCategories availableDiskCategories) {
            this.availableDiskCategories = availableDiskCategories;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableDiskCategories getAvailableDiskCategories() {
            return this.availableDiskCategories;
        }

        public DescribeZonesResponseZonesZone setAvailableInstanceTypes(DescribeZonesResponseZonesZoneAvailableInstanceTypes availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DescribeZonesResponseZonesZone setAvailableVolumeCategories(DescribeZonesResponseZonesZoneAvailableVolumeCategories availableVolumeCategories) {
            this.availableVolumeCategories = availableVolumeCategories;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableVolumeCategories getAvailableVolumeCategories() {
            return this.availableVolumeCategories;
        }

        public DescribeZonesResponseZonesZone setAvailableDedicatedHostTypes(DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes availableDedicatedHostTypes) {
            this.availableDedicatedHostTypes = availableDedicatedHostTypes;
            return this;
        }
        public DescribeZonesResponseZonesZoneAvailableDedicatedHostTypes getAvailableDedicatedHostTypes() {
            return this.availableDedicatedHostTypes;
        }

        public DescribeZonesResponseZonesZone setDedicatedHostGenerations(DescribeZonesResponseZonesZoneDedicatedHostGenerations dedicatedHostGenerations) {
            this.dedicatedHostGenerations = dedicatedHostGenerations;
            return this;
        }
        public DescribeZonesResponseZonesZoneDedicatedHostGenerations getDedicatedHostGenerations() {
            return this.dedicatedHostGenerations;
        }

    }

    public static class DescribeZonesResponseZones extends TeaModel {
        @NameInMap("Zone")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZone> zone;

        public static DescribeZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZones self = new DescribeZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZones setZone(java.util.List<DescribeZonesResponseZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseZonesZone> getZone() {
            return this.zone;
        }

    }

}
