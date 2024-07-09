// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringRequest extends TeaModel {
    /**
     * <p>The coordination policy.</p>
     * <p>Set the value to FULL_CONTROL.</p>
     * <ul>
     * <li><p>The value FULL_CONTROL specifies that the cloud desktop is shared and remote access to the cloud desktop is allowed.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL_CONTROL</p>
     */
    @NameInMap("CoordinatePolicyType")
    public String coordinatePolicyType;

    /**
     * <p>The ID of the end user who initiates the stream collaboration. If the initiator is the administrator, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The type of the initiator.</p>
     * <p>Set the value to ADMIN_INITIATE.</p>
     * <ul>
     * <li><p>The value ADMIN_INITIATE specifies that the administrator initiates the coordination request.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADMIN_INITIATE</p>
     */
    @NameInMap("InitiatorType")
    public String initiatorType;

    /**
     * <p>The region ID. You can call the <a href="https://next.api.aliyun.com/document/ecd/2020-09-30/DescribeRegions">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of cloud desktops that run the collaboration task at the same time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceCandidates")
    public java.util.List<ApplyCoordinationForMonitoringRequestResourceCandidates> resourceCandidates;

    /**
     * <p>The universally unique identifier (UUID) of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>62f2f1f252f04e0e9d8bc****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ApplyCoordinationForMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForMonitoringRequest self = new ApplyCoordinationForMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForMonitoringRequest setCoordinatePolicyType(String coordinatePolicyType) {
        this.coordinatePolicyType = coordinatePolicyType;
        return this;
    }
    public String getCoordinatePolicyType() {
        return this.coordinatePolicyType;
    }

    public ApplyCoordinationForMonitoringRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ApplyCoordinationForMonitoringRequest setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
        return this;
    }
    public String getInitiatorType() {
        return this.initiatorType;
    }

    public ApplyCoordinationForMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyCoordinationForMonitoringRequest setResourceCandidates(java.util.List<ApplyCoordinationForMonitoringRequestResourceCandidates> resourceCandidates) {
        this.resourceCandidates = resourceCandidates;
        return this;
    }
    public java.util.List<ApplyCoordinationForMonitoringRequestResourceCandidates> getResourceCandidates() {
        return this.resourceCandidates;
    }

    public ApplyCoordinationForMonitoringRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class ApplyCoordinationForMonitoringRequestResourceCandidates extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the current cloud desktop belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130247021517****</p>
         */
        @NameInMap("OwnerAliUid")
        public Long ownerAliUid;

        /**
         * <p>The ID of the current end user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerEndUserId")
        public String ownerEndUserId;

        /**
         * <p>The ID of the cloud desktop.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-08zhejm3h7ilr****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the cloud desktop.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDesktop</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The properties of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>TestProperty</p>
         */
        @NameInMap("ResourceProperties")
        public String resourceProperties;

        /**
         * <p>The region where the resource resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The resource type.</p>
         * <p>Set the value to CLOUD_DESKTOP.</p>
         * <ul>
         * <li><p>The value CLOUD_DESKTOP specifies that the resource is a cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ApplyCoordinationForMonitoringRequestResourceCandidates build(java.util.Map<String, ?> map) throws Exception {
            ApplyCoordinationForMonitoringRequestResourceCandidates self = new ApplyCoordinationForMonitoringRequestResourceCandidates();
            return TeaModel.build(map, self);
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setOwnerAliUid(Long ownerAliUid) {
            this.ownerAliUid = ownerAliUid;
            return this;
        }
        public Long getOwnerAliUid() {
            return this.ownerAliUid;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setOwnerEndUserId(String ownerEndUserId) {
            this.ownerEndUserId = ownerEndUserId;
            return this;
        }
        public String getOwnerEndUserId() {
            return this.ownerEndUserId;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setResourceProperties(String resourceProperties) {
            this.resourceProperties = resourceProperties;
            return this;
        }
        public String getResourceProperties() {
            return this.resourceProperties;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ApplyCoordinationForMonitoringRequestResourceCandidates setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
