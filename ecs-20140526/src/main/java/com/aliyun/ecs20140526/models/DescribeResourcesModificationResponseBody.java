// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableZones")
    public java.util.List<DescribeResourcesModificationResponseBodyAvailableZones> availableZones;

    public static DescribeResourcesModificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationResponseBody self = new DescribeResourcesModificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesModificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcesModificationResponseBody setAvailableZones(java.util.List<DescribeResourcesModificationResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeResourcesModificationResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources extends TeaModel {
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

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SupportedResources")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources setSupportedResources(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> getSupportedResources() {
            return this.supportedResources;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZones extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AvailableResources")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources> availableResources;

        public static DescribeResourcesModificationResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZones self = new DescribeResourcesModificationResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourcesModificationResponseBodyAvailableZones setAvailableResources(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

    }

}
