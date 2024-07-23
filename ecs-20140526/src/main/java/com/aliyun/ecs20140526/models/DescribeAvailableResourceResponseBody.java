// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>Details about the zones in which resources are available.</p>
     */
    @NameInMap("AvailableZones")
    public DescribeAvailableResourceResponseBodyAvailableZones availableZones;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0041D94C-FB92-4C49-B115-259DA1C*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZones(DescribeAvailableResourceResponseBodyAvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
        /**
         * <p>The maximum disk capacity.</p>
         * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum disk capacity.</p>
         * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The status of the resource. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>SoldOut</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The resource category based on the stock level. Valid values:</p>
         * <ul>
         * <li>WithStock: Resources are in sufficient stock.</li>
         * <li>ClosedWithStock: Resources are in insufficient stock. We recommend that you use other resources that are in sufficient stock.</li>
         * <li>WithoutStock: Resources are out of stock and will be replenished. We recommend that you use other resources that are in sufficient stock.</li>
         * <li>ClosedWithoutStock: Resources are out of stock and will not be replenished. We recommend that you use other resources that are in sufficient stock.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The unit of the disk capacity.</p>
         * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.d1ne.xlarge</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        /**
         * <p>The information about the resources.</p>
         */
        @NameInMap("SupportedResources")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Zone: zone</li>
         * <li>IoOptimized: I/O optimized resource</li>
         * <li>InstanceType: instance type</li>
         * <li>SystemDisk: system disk</li>
         * <li>DataDisk: data disk</li>
         * <li>Network: network type</li>
         * <li>ddh: dedicated host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setSupportedResources(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources getSupportedResources() {
            return this.supportedResources;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        /**
         * <p>The resources that are available in the zone.</p>
         */
        @NameInMap("AvailableResources")
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of resources in the zone. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>SoldOut</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The resource category based on the stock level in the zone. Valid values:</p>
         * <ul>
         * <li>WithStock: Resources are in sufficient stock.</li>
         * <li>ClosedWithStock: Resources are in insufficient stock. We recommend that you use other resources that are in sufficient stock.</li>
         * <li>WithoutStock: Resources are out of stock and will be replenished. We recommend that you use other resources that are in sufficient stock.</li>
         * <li>ClosedWithoutStock: Resources are out of stock and will not be replenished. We recommend that you use other resources that are in sufficient stock.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone self = new DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setAvailableResources(DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZoneAvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeAvailableResourceResponseBodyAvailableZonesAvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
