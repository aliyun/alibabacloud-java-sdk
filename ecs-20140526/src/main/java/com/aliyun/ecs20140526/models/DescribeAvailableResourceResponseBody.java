// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AvailableZones")
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZones> availableZones;

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

    public DescribeAvailableResourceResponseBody setAvailableZones(java.util.List<DescribeAvailableResourceResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeAvailableResourceResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources extends TeaModel {
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

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SupportedResources")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources setSupportedResources(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> getSupportedResources() {
            return this.supportedResources;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AvailableResources")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources> availableResources;

        public static DescribeAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZones self = new DescribeAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZones setAvailableResources(java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableZonesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

    }

}
