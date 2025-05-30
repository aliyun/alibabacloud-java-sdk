// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the zones and their supported resources.</p>
     */
    @NameInMap("Zones")
    public DescribeZonesResponseBodyZones zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(DescribeZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        public java.util.List<String> dedicatedHostType;

        public static DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes self = new DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes setDedicatedHostType(java.util.List<String> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<String> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableDiskCategories extends TeaModel {
        @NameInMap("DiskCategories")
        public java.util.List<String> diskCategories;

        public static DescribeZonesResponseBodyZonesZoneAvailableDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableDiskCategories self = new DescribeZonesResponseBodyZonesZoneAvailableDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableDiskCategories setDiskCategories(java.util.List<String> diskCategories) {
            this.diskCategories = diskCategories;
            return this;
        }
        public java.util.List<String> getDiskCategories() {
            return this.diskCategories;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes extends TeaModel {
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        public static DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes self = new DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourceCreation extends TeaModel {
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourceCreation build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourceCreation self = new DescribeZonesResponseBodyZonesZoneAvailableResourceCreation();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourceCreation setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories extends TeaModel {
        @NameInMap("supportedDataDiskCategory")
        public java.util.List<String> supportedDataDiskCategory;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories setSupportedDataDiskCategory(java.util.List<String> supportedDataDiskCategory) {
            this.supportedDataDiskCategory = supportedDataDiskCategory;
            return this;
        }
        public java.util.List<String> getSupportedDataDiskCategory() {
            return this.supportedDataDiskCategory;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations extends TeaModel {
        @NameInMap("supportedInstanceGeneration")
        public java.util.List<String> supportedInstanceGeneration;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations setSupportedInstanceGeneration(java.util.List<String> supportedInstanceGeneration) {
            this.supportedInstanceGeneration = supportedInstanceGeneration;
            return this;
        }
        public java.util.List<String> getSupportedInstanceGeneration() {
            return this.supportedInstanceGeneration;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies extends TeaModel {
        @NameInMap("supportedInstanceTypeFamily")
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes extends TeaModel {
        @NameInMap("supportedInstanceType")
        public java.util.List<String> supportedInstanceType;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes setSupportedInstanceType(java.util.List<String> supportedInstanceType) {
            this.supportedInstanceType = supportedInstanceType;
            return this;
        }
        public java.util.List<String> getSupportedInstanceType() {
            return this.supportedInstanceType;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes extends TeaModel {
        @NameInMap("supportedNetworkCategory")
        public java.util.List<String> supportedNetworkCategory;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes setSupportedNetworkCategory(java.util.List<String> supportedNetworkCategory) {
            this.supportedNetworkCategory = supportedNetworkCategory;
            return this;
        }
        public java.util.List<String> getSupportedNetworkCategory() {
            return this.supportedNetworkCategory;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories extends TeaModel {
        @NameInMap("supportedSystemDiskCategory")
        public java.util.List<String> supportedSystemDiskCategory;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories setSupportedSystemDiskCategory(java.util.List<String> supportedSystemDiskCategory) {
            this.supportedSystemDiskCategory = supportedSystemDiskCategory;
            return this;
        }
        public java.util.List<String> getSupportedSystemDiskCategory() {
            return this.supportedSystemDiskCategory;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo extends TeaModel {
        /**
         * <p>The categories of data disks that can be created.</p>
         */
        @NameInMap("DataDiskCategories")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories dataDiskCategories;

        /**
         * <p>The supported generations of instance families.</p>
         */
        @NameInMap("InstanceGenerations")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations instanceGenerations;

        /**
         * <p>The supported instance families.</p>
         */
        @NameInMap("InstanceTypeFamilies")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies instanceTypeFamilies;

        /**
         * <p>The supported instance types.</p>
         */
        @NameInMap("InstanceTypes")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes instanceTypes;

        /**
         * <p>Indicates whether the instance is I/O optimized.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        /**
         * <p>The supported network types.</p>
         */
        @NameInMap("NetworkTypes")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes networkTypes;

        /**
         * <p>The categories of system disks that can be created.</p>
         */
        @NameInMap("SystemDiskCategories")
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories systemDiskCategories;

        public static DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo self = new DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setDataDiskCategories(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories dataDiskCategories) {
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoDataDiskCategories getDataDiskCategories() {
            return this.dataDiskCategories;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setInstanceGenerations(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceGenerations getInstanceGenerations() {
            return this.instanceGenerations;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setInstanceTypeFamilies(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setInstanceTypes(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoInstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setNetworkTypes(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoNetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo setSystemDiskCategories(DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableResources extends TeaModel {
        @NameInMap("ResourcesInfo")
        public java.util.List<DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo> resourcesInfo;

        public static DescribeZonesResponseBodyZonesZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableResources self = new DescribeZonesResponseBodyZonesZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableResources setResourcesInfo(java.util.List<DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo> resourcesInfo) {
            this.resourcesInfo = resourcesInfo;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZoneAvailableResourcesResourcesInfo> getResourcesInfo() {
            return this.resourcesInfo;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories extends TeaModel {
        @NameInMap("VolumeCategories")
        public java.util.List<String> volumeCategories;

        public static DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories self = new DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories setVolumeCategories(java.util.List<String> volumeCategories) {
            this.volumeCategories = volumeCategories;
            return this;
        }
        public java.util.List<String> getVolumeCategories() {
            return this.volumeCategories;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations extends TeaModel {
        @NameInMap("DedicatedHostGeneration")
        public java.util.List<String> dedicatedHostGeneration;

        public static DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations self = new DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations setDedicatedHostGeneration(java.util.List<String> dedicatedHostGeneration) {
            this.dedicatedHostGeneration = dedicatedHostGeneration;
            return this;
        }
        public java.util.List<String> getDedicatedHostGeneration() {
            return this.dedicatedHostGeneration;
        }

    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <p>The supported dedicated host types.</p>
         */
        @NameInMap("AvailableDedicatedHostTypes")
        public DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes availableDedicatedHostTypes;

        /**
         * <p>The categories of cloud disks that can be created. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_essd: ESSD</li>
         * </ul>
         */
        @NameInMap("AvailableDiskCategories")
        public DescribeZonesResponseBodyZonesZoneAvailableDiskCategories availableDiskCategories;

        /**
         * <p>The supported instance types.</p>
         */
        @NameInMap("AvailableInstanceTypes")
        public DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes availableInstanceTypes;

        /**
         * <p>The types of resources that can be created. Valid values:</p>
         * <ul>
         * <li>VSwitch: vSwitch</li>
         * <li>IoOptimized: I/O optimized instance</li>
         * <li>Instance: instance</li>
         * <li>DedicatedHost: dedicated host</li>
         * <li>disk: cloud disk</li>
         * </ul>
         */
        @NameInMap("AvailableResourceCreation")
        public DescribeZonesResponseBodyZonesZoneAvailableResourceCreation availableResourceCreation;

        /**
         * <p>Details about the resources that can be created in the zone.</p>
         */
        @NameInMap("AvailableResources")
        public DescribeZonesResponseBodyZonesZoneAvailableResources availableResources;

        /**
         * <p>The supported Shared Block Storage device categories.</p>
         */
        @NameInMap("AvailableVolumeCategories")
        public DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories availableVolumeCategories;

        /**
         * <p>The supported generations of dedicated hosts.</p>
         */
        @NameInMap("DedicatedHostGenerations")
        public DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations dedicatedHostGenerations;

        /**
         * <p>The name of the zone in the local language.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone G</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The type of the zone. Valid values:</p>
         * <ul>
         * <li>AvailabilityZone: zone for the Alibaba Cloud public cloud</li>
         * <li>CloudBoxZone: zone for CloudBox</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AvailabilityZone</p>
         */
        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setAvailableDedicatedHostTypes(DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes availableDedicatedHostTypes) {
            this.availableDedicatedHostTypes = availableDedicatedHostTypes;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableDedicatedHostTypes getAvailableDedicatedHostTypes() {
            return this.availableDedicatedHostTypes;
        }

        public DescribeZonesResponseBodyZonesZone setAvailableDiskCategories(DescribeZonesResponseBodyZonesZoneAvailableDiskCategories availableDiskCategories) {
            this.availableDiskCategories = availableDiskCategories;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableDiskCategories getAvailableDiskCategories() {
            return this.availableDiskCategories;
        }

        public DescribeZonesResponseBodyZonesZone setAvailableInstanceTypes(DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DescribeZonesResponseBodyZonesZone setAvailableResourceCreation(DescribeZonesResponseBodyZonesZoneAvailableResourceCreation availableResourceCreation) {
            this.availableResourceCreation = availableResourceCreation;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResourceCreation getAvailableResourceCreation() {
            return this.availableResourceCreation;
        }

        public DescribeZonesResponseBodyZonesZone setAvailableResources(DescribeZonesResponseBodyZonesZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public DescribeZonesResponseBodyZonesZone setAvailableVolumeCategories(DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories availableVolumeCategories) {
            this.availableVolumeCategories = availableVolumeCategories;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneAvailableVolumeCategories getAvailableVolumeCategories() {
            return this.availableVolumeCategories;
        }

        public DescribeZonesResponseBodyZonesZone setDedicatedHostGenerations(DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations dedicatedHostGenerations) {
            this.dedicatedHostGenerations = dedicatedHostGenerations;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneDedicatedHostGenerations getDedicatedHostGenerations() {
            return this.dedicatedHostGenerations;
        }

        public DescribeZonesResponseBodyZonesZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZonesZone setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeZonesResponseBodyZonesZone> zone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setZone(java.util.List<DescribeZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
