// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableZones")
    public DescribeAvailableResourceResponseBodyAvailableZones availableZones;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponseBody setAvailableZones(DescribeAvailableResourceResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public String value;

        @NameInMap("Max")
        public Integer max;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("Min")
        public Integer min;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources setSupportedResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SupportedResources")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setSupportedResources(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources getSupportedResources() {
            return this.supportedResources;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources setAvailableResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AvailableResources")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setAvailableResources(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZones self = new DescribeAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setAvailableZone(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
