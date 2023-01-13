// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationResponseBody extends TeaModel {
    /**
     * <p>Details about the available zones.</p>
     */
    @NameInMap("AvailableZones")
    public DescribeResourcesModificationResponseBodyAvailableZones availableZones;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourcesModificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationResponseBody self = new DescribeResourcesModificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesModificationResponseBody setAvailableZones(DescribeResourcesModificationResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeResourcesModificationResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeResourcesModificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
        /**
         * <p>The maximum resource specification value. This parameter is not returned if it has no value.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum resource specification value. This parameter is not returned if it has no value.</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The state of the resource. Valid values:</p>
         * <br>
         * <p>*   Available</p>
         * <p>*   SoldOut</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The category of resource based on stock status. Valid values:</p>
         * <br>
         * <p>*   WithStock: resources that are in sufficient stock</p>
         * <p>*   ClosedWithStock: resources that are ininsufficient stock</p>
         * <p>*   WithoutStock: resources that are out of stock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The resource specification unit. This parameter is not returned if it has no value.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The resource value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources setSupportedResource(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource extends TeaModel {
        /**
         * <p>Details about the resources.</p>
         */
        @NameInMap("SupportedResources")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        /**
         * <p>The type of resource. Valid values:</p>
         * <br>
         * <p>*   Zone</p>
         * <p>*   IoOptimized</p>
         * <p>*   InstanceType</p>
         * <p>*   SystemDisk</p>
         * <p>*   DataDisk</p>
         * <p>*   Network</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setSupportedResources(DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources getSupportedResources() {
            return this.supportedResources;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources setAvailableResource(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone extends TeaModel {
        /**
         * <p>Details about the resources available in the zone.</p>
         */
        @NameInMap("AvailableResources")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources;

        /**
         * <p>The region ID of the zone.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the resource. Valid values:</p>
         * <br>
         * <p>*   Available</p>
         * <p>*   SoldOut</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The category of resource based on stock status. Valid values:</p>
         * <br>
         * <p>*   WithStock: resources that are in sufficient stock</p>
         * <p>*   ClosedWithStock: resources that are in insufficient stock</p>
         * <p>*   WithoutStock: resources that are out of stock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone setAvailableResources(DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone> availableZone;

        public static DescribeResourcesModificationResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZones self = new DescribeResourcesModificationResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setAvailableZone(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
