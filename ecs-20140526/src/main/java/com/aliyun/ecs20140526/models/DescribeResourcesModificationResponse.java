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

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources self = new DescribeResourcesModificationResponseAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcesModificationResponseAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeResourcesModificationResponseAvailableZonesAvailableZone> availableZone;

        public static DescribeResourcesModificationResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseAvailableZones self = new DescribeResourcesModificationResponseAvailableZones();
            return TeaModel.build(map, self);
        }

    }

}
