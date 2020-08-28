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

    public static class DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories extends TeaModel {
        // supportedSystemDiskCategory
        @NameInMap("supportedSystemDiskCategory")
        @Validation(required = true)
        public java.util.List<String> supportedSystemDiskCategory;

        public static DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories self = new DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfoSystemDiskCategories();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeZonesResponseZonesZoneAvailableResources extends TeaModel {
        @NameInMap("ResourcesInfo")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZoneAvailableResourcesResourcesInfo> resourcesInfo;

        public static DescribeZonesResponseZonesZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZoneAvailableResources self = new DescribeZonesResponseZonesZoneAvailableResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeZonesResponseZones extends TeaModel {
        @NameInMap("Zone")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZone> zone;

        public static DescribeZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZones self = new DescribeZonesResponseZones();
            return TeaModel.build(map, self);
        }

    }

}
