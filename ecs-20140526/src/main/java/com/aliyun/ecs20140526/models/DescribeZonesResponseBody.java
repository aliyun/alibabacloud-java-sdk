// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public java.util.List<DescribeZonesResponseBodyZones> zones;

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

    public DescribeZonesResponseBody setZones(java.util.List<DescribeZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesAvailableResources extends TeaModel {
        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("SystemDiskCategories")
        public java.util.List<String> systemDiskCategories;

        @NameInMap("InstanceGenerations")
        public java.util.List<String> instanceGenerations;

        @NameInMap("DataDiskCategories")
        public java.util.List<String> dataDiskCategories;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        @NameInMap("InstanceTypeFamilies")
        public java.util.List<String> instanceTypeFamilies;

        @NameInMap("NetworkTypes")
        public java.util.List<String> networkTypes;

        public static DescribeZonesResponseBodyZonesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesAvailableResources self = new DescribeZonesResponseBodyZonesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesAvailableResources setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }
        public java.util.List<String> getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setInstanceGenerations(java.util.List<String> instanceGenerations) {
            this.instanceGenerations = instanceGenerations;
            return this;
        }
        public java.util.List<String> getInstanceGenerations() {
            return this.instanceGenerations;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setDataDiskCategories(java.util.List<String> dataDiskCategories) {
            this.dataDiskCategories = dataDiskCategories;
            return this;
        }
        public java.util.List<String> getDataDiskCategories() {
            return this.dataDiskCategories;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setInstanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        public DescribeZonesResponseBodyZonesAvailableResources setNetworkTypes(java.util.List<String> networkTypes) {
            this.networkTypes = networkTypes;
            return this;
        }
        public java.util.List<String> getNetworkTypes() {
            return this.networkTypes;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("AvailableResourceCreation")
        public java.util.List<String> availableResourceCreation;

        @NameInMap("DedicatedHostGenerations")
        public java.util.List<String> dedicatedHostGenerations;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("AvailableInstanceTypes")
        public java.util.List<String> availableInstanceTypes;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AvailableDiskCategories")
        public java.util.List<String> availableDiskCategories;

        @NameInMap("AvailableDedicatedHostTypes")
        public java.util.List<String> availableDedicatedHostTypes;

        @NameInMap("AvailableVolumeCategories")
        public java.util.List<String> availableVolumeCategories;

        @NameInMap("AvailableResources")
        public java.util.List<DescribeZonesResponseBodyZonesAvailableResources> availableResources;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setAvailableResourceCreation(java.util.List<String> availableResourceCreation) {
            this.availableResourceCreation = availableResourceCreation;
            return this;
        }
        public java.util.List<String> getAvailableResourceCreation() {
            return this.availableResourceCreation;
        }

        public DescribeZonesResponseBodyZones setDedicatedHostGenerations(java.util.List<String> dedicatedHostGenerations) {
            this.dedicatedHostGenerations = dedicatedHostGenerations;
            return this;
        }
        public java.util.List<String> getDedicatedHostGenerations() {
            return this.dedicatedHostGenerations;
        }

        public DescribeZonesResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZones setAvailableInstanceTypes(java.util.List<String> availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public java.util.List<String> getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DescribeZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZones setAvailableDiskCategories(java.util.List<String> availableDiskCategories) {
            this.availableDiskCategories = availableDiskCategories;
            return this;
        }
        public java.util.List<String> getAvailableDiskCategories() {
            return this.availableDiskCategories;
        }

        public DescribeZonesResponseBodyZones setAvailableDedicatedHostTypes(java.util.List<String> availableDedicatedHostTypes) {
            this.availableDedicatedHostTypes = availableDedicatedHostTypes;
            return this;
        }
        public java.util.List<String> getAvailableDedicatedHostTypes() {
            return this.availableDedicatedHostTypes;
        }

        public DescribeZonesResponseBodyZones setAvailableVolumeCategories(java.util.List<String> availableVolumeCategories) {
            this.availableVolumeCategories = availableVolumeCategories;
            return this;
        }
        public java.util.List<String> getAvailableVolumeCategories() {
            return this.availableVolumeCategories;
        }

        public DescribeZonesResponseBodyZones setAvailableResources(java.util.List<DescribeZonesResponseBodyZonesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

    }

}
