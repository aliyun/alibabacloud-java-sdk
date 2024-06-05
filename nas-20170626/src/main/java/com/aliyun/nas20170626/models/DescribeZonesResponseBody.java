// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried zones.</p>
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

    public static class DescribeZonesResponseBodyZonesZoneCapacity extends TeaModel {
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        public static DescribeZonesResponseBodyZonesZoneCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneCapacity self = new DescribeZonesResponseBodyZonesZoneCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneCapacity setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * <br>
         * <p>*   If the FileSystemType parameter is set to standard, the protocol type is nfs or smb.</p>
         * <p>*   If the FileSystemType parameter is set to extreme, the protocol type is nfs.</p>
         * <p>*   If the FileSystemType parameter is set to cpfs, the protocol type is cpfs.</p>
         * <br>
         * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The storage type.</p>
         * <br>
         * <p>*   If the FileSystemType parameter is set to standard, the storage type is Performance or Capacity.</p>
         * <p>*   If the FileSystemType parameter is set to extreme, the storage type is standard or advance.</p>
         * <p>*   If the FileSystemType parameter is set to cpfs, the storage type is advance_100 (100 MB/s/TiB baseline) or advance_200 (200 MB/s/TiB baseline).</p>
         * <br>
         * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType self = new DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType> instanceType;

        public static DescribeZonesResponseBodyZonesZoneInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneInstanceTypes self = new DescribeZonesResponseBodyZonesZoneInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneInstanceTypes setInstanceType(java.util.List<DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZoneInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeZonesResponseBodyZonesZonePerformance extends TeaModel {
        @NameInMap("Protocol")
        public java.util.List<String> protocol;

        public static DescribeZonesResponseBodyZonesZonePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZonePerformance self = new DescribeZonesResponseBodyZonesZonePerformance();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZonePerformance setProtocol(java.util.List<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <p>This parameter is reserved. You can ignore this parameter.</p>
         */
        @NameInMap("Capacity")
        public DescribeZonesResponseBodyZonesZoneCapacity capacity;

        /**
         * <p>The details about file system types.</p>
         */
        @NameInMap("InstanceTypes")
        public DescribeZonesResponseBodyZonesZoneInstanceTypes instanceTypes;

        /**
         * <p>This parameter is reserved. You can ignore this parameter.</p>
         */
        @NameInMap("Performance")
        public DescribeZonesResponseBodyZonesZonePerformance performance;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setCapacity(DescribeZonesResponseBodyZonesZoneCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneCapacity getCapacity() {
            return this.capacity;
        }

        public DescribeZonesResponseBodyZonesZone setInstanceTypes(DescribeZonesResponseBodyZonesZoneInstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneInstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeZonesResponseBodyZonesZone setPerformance(DescribeZonesResponseBodyZonesZonePerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeZonesResponseBodyZonesZonePerformance getPerformance() {
            return this.performance;
        }

        public DescribeZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
