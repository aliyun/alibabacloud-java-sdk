// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableZones")
    @Validation(required = true)
    public DescribeAvailableResourceResponseAvailableZones availableZones;

    public static DescribeAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponse self = new DescribeAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableResourceResponse setAvailableZones(DescribeAvailableResourceResponseAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeAvailableResourceResponseAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
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

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources setSupportedResource(java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("SupportedResources")
        @Validation(required = true)
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource setSupportedResources(DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources getSupportedResources() {
            return this.supportedResources;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources setAvailableResource(java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZone extends TeaModel {
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
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources availableResources;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZone setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZone setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseAvailableZonesAvailableZone setAvailableResources(DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

    }

    public static class DescribeAvailableResourceResponseAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZones self = new DescribeAvailableResourceResponseAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseAvailableZones setAvailableZone(java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
