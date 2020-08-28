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

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource> supportedResource;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources self = new DescribeAvailableResourceResponseAvailableZonesAvailableZoneAvailableResources();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeAvailableResourceResponseAvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        @Validation(required = true)
        public java.util.List<DescribeAvailableResourceResponseAvailableZonesAvailableZone> availableZone;

        public static DescribeAvailableResourceResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseAvailableZones self = new DescribeAvailableResourceResponseAvailableZones();
            return TeaModel.build(map, self);
        }

    }

}
