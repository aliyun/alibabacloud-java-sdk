// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableZones")
    @Validation(required = true)
    public DescribeResourcesModificationResponseAvailableZones availableZones;

    public static DescribeResourcesModificationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationResponse self = new DescribeResourcesModificationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesModificationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcesModificationResponse setAvailableZones(DescribeResourcesModificationResponseAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeResourcesModificationResponseAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusCategory")
        @Validation(required = true)
        public String statusCategory;

        @NameInMap("Min")
        @Validation(required = true)
        public Integer min;

        @NameInMap("Max")
        @Validation(required = true)
        public Integer max;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources setSupportedResource(java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("SupportedResources")
        @Validation(required = true)
        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource setSupportedResources(DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources getSupportedResources() {
            return this.supportedResources;
        }

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources setAvailableResource(java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZone extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusCategory")
        @Validation(required = true)
        public String statusCategory;

        @NameInMap("AvailableResources")
        @Validation(required = true)
        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources availableResources;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZone self = new DescribeResourcesModificationResponseAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZone setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZone setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseAvailableZonesAvailableZone setAvailableResources(DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

    }

    public static class DescribeResourcesModificationResponseAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZone> availableZone;

        public static DescribeResourcesModificationResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZones self = new DescribeResourcesModificationResponseAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseAvailableZones setAvailableZone(java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
