// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationResponseBody extends TeaModel {
    /**
     * <p>The information about the queried zones.</p>
     */
    @NameInMap("AvailableZones")
    public DescribeResourcesModificationResponseBodyAvailableZones availableZones;

    /**
     * <p>The request ID.</p>
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

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition extends TeaModel {
        /**
         * <p>The condition name. Valid value:</p>
         * <br>
         * <p>DiskCategory, which indicates a disk category change.</p>
         */
        @NameInMap("Key")
        public String key;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions extends TeaModel {
        @NameInMap("Condition")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition> condition;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions setCondition(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition> condition) {
            this.condition = condition;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditionsCondition> getCondition() {
            return this.condition;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource extends TeaModel {
        /**
         * <p>The conditions.</p>
         */
        @NameInMap("Conditions")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions conditions;

        /**
         * <p>The maximum disk capacity.</p>
         * <br>
         * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum disk capacity.</p>
         * <br>
         * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The stock state of the resource. Valid values:</p>
         * <br>
         * <p>*   Available</p>
         * <p>*   SoldOut</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The category of the resource based on stock status. Valid values:</p>
         * <br>
         * <p>*   WithStock: resources that are in sufficient stock</p>
         * <p>*   ClosedWithStock: resources that are in insufficient stock</p>
         * <p>*   WithoutStock: resources that are out of stock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The unit of the disk capacity.</p>
         * <br>
         * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setConditions(DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResourceConditions getConditions() {
            return this.conditions;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources extends TeaModel {
        @NameInMap("ConditionSupportedResource")
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource> conditionSupportedResource;

        public static DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources self = new DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources setConditionSupportedResource(java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource> conditionSupportedResource) {
            this.conditionSupportedResource = conditionSupportedResource;
            return this;
        }
        public java.util.List<DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResourcesConditionSupportedResource> getConditionSupportedResource() {
            return this.conditionSupportedResource;
        }

    }

    public static class DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResourcesSupportedResource extends TeaModel {
        /**
         * <p>The maximum disk capacity.</p>
         * <br>
         * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum disk capacity.</p>
         * <br>
         * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
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
         * <p>The category of the resource based on stock status. Valid values:</p>
         * <br>
         * <p>*   WithStock: resources that are in sufficient stock</p>
         * <p>*   ClosedWithStock: resources that are in insufficient stock</p>
         * <p>*   WithoutStock: resources that are out of stock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The unit of the disk capacity. This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The resource type.</p>
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
         * <p>The resource types that resources can be changed to after the resources meet specified conditions. If the conditions are met, you can change the current resource to a resource in the list.</p>
         */
        @NameInMap("ConditionSupportedResources")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources conditionSupportedResources;

        /**
         * <p>The information about the resources.</p>
         */
        @NameInMap("SupportedResources")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceSupportedResources supportedResources;

        /**
         * <p>The type of the resources. Valid values:</p>
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

        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResource setConditionSupportedResources(DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources conditionSupportedResources) {
            this.conditionSupportedResources = conditionSupportedResources;
            return this;
        }
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResourcesAvailableResourceConditionSupportedResources getConditionSupportedResources() {
            return this.conditionSupportedResources;
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
         * <p>The resources that are available in the zone.</p>
         */
        @NameInMap("AvailableResources")
        public DescribeResourcesModificationResponseBodyAvailableZonesAvailableZoneAvailableResources availableResources;

        /**
         * <p>The region ID.</p>
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
         * <p>The category of the resource based on stock status. Valid values:</p>
         * <br>
         * <p>*   WithStock: resources that are in sufficient stock</p>
         * <p>*   ClosedWithStock: resources that are in insufficient stock</p>
         * <p>*   WithoutStock: resources that are out of stock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The zone ID.</p>
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
