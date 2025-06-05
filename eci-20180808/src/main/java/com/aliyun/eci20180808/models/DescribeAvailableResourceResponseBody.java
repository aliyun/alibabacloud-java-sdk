// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>The zones in which the specified resources are available.</p>
     */
    @NameInMap("AvailableZones")
    public AvailableZones availableZones;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6829735A-FF76-58C6-AECB-27CBF135A7AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableZones(AvailableZones availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public AvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SupportedResource extends TeaModel {
        /**
         * <p>The category of resources based on stock status. Valid values:</p>
         * <ul>
         * <li>WithStock: Resources are in sufficient stock.</li>
         * <li>ClosedWithStock: Resources are insufficient. We recommend that you use instance types that are in sufficient stock.</li>
         * <li>WithoutStock: Resources are sold out and will be replenished. We recommend that you use instance types that are in sufficient stock.</li>
         * <li>ClosedWithoutStock: Resources are sold out and will not be replenished. We recommend that you use instance types that are in sufficient stock.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        @NameInMap("StatusCategory")
        public String statusCategory;

        /**
         * <p>The ECS instance types or instance families that are available in the zones.</p>
         * <ul>
         * <li>If the return value of the Type parameter is InstanceTypeFamily, this parameter indicates instance families that are returned.</li>
         * <li>If the return value of the Type parameter is InstanceType, this parameter indicates instance types that are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6</p>
         */
        @NameInMap("Value")
        public String value;

        public static SupportedResource build(java.util.Map<String, ?> map) throws Exception {
            SupportedResource self = new SupportedResource();
            return TeaModel.build(map, self);
        }

        public SupportedResource setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public SupportedResource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        public java.util.List<SupportedResource> supportedResource;

        public static SupportedResources build(java.util.Map<String, ?> map) throws Exception {
            SupportedResources self = new SupportedResources();
            return TeaModel.build(map, self);
        }

        public SupportedResources setSupportedResource(java.util.List<SupportedResource> supportedResource) {
            this.supportedResource = supportedResource;
            return this;
        }
        public java.util.List<SupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

    }

    public static class AvailableResource extends TeaModel {
        /**
         * <p>The information about the resources that are available in the zones.</p>
         */
        @NameInMap("SupportedResources")
        public SupportedResources supportedResources;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>InstanceTypeFamily: instance families.</li>
         * <li>InstanceType: instance types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceTypeFamily</p>
         */
        @NameInMap("Type")
        public String type;

        public static AvailableResource build(java.util.Map<String, ?> map) throws Exception {
            AvailableResource self = new AvailableResource();
            return TeaModel.build(map, self);
        }

        public AvailableResource setSupportedResources(SupportedResources supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public SupportedResources getSupportedResources() {
            return this.supportedResources;
        }

        public AvailableResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<AvailableResource> availableResource;

        public static AvailableResources build(java.util.Map<String, ?> map) throws Exception {
            AvailableResources self = new AvailableResources();
            return TeaModel.build(map, self);
        }

        public AvailableResources setAvailableResource(java.util.List<AvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

    public static class AvailableZone extends TeaModel {
        /**
         * <p>The resources that are available in the specified zone.</p>
         */
        @NameInMap("AvailableResources")
        public AvailableResources availableResources;

        /**
         * <p>The region ID of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static AvailableZone build(java.util.Map<String, ?> map) throws Exception {
            AvailableZone self = new AvailableZone();
            return TeaModel.build(map, self);
        }

        public AvailableZone setAvailableResources(AvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public AvailableZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AvailableZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class AvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        public java.util.List<AvailableZone> availableZone;

        public static AvailableZones build(java.util.Map<String, ?> map) throws Exception {
            AvailableZones self = new AvailableZones();
            return TeaModel.build(map, self);
        }

        public AvailableZones setAvailableZone(java.util.List<AvailableZone> availableZone) {
            this.availableZone = availableZone;
            return this;
        }
        public java.util.List<AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

    }

}
