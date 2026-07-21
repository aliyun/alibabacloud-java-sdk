// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringRequest extends TeaModel {
    /**
     * <p>The access policy during the remote assistance procedure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL_CONTROL</p>
     */
    @NameInMap("CoordinatePolicyType")
    public String coordinatePolicyType;

    /**
     * <p>The ID of the end user who initiates the coordination flow. This parameter is not required if the request is initiated by an administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The initiator type.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN_INITIATE</p>
     */
    @NameInMap("InitiatorType")
    public String initiatorType;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of cloud computers that need to accept remote assistance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceCandidates")
    public java.util.List<ApplyCoordinationForMonitoringRequestResourceCandidates> resourceCandidates;

    /**
     * <p>The UUID (unique identifier) of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3E14A18BD4D088504B9F8A8751AB****</p>
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
         * <p>The Alibaba Cloud account ID of the cloud computer administrator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130247021517****</p>
         */
        @NameInMap("OwnerAliUid")
        public Long ownerAliUid;

        /**
         * <p>The username of the current user of the cloud computer.</p>
         * <blockquote>
         * <p>This field is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerEndUserId")
        public String ownerEndUserId;

        /**
         * <p>The cloud computer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-08zhejm3h7ilr****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The cloud computer name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The properties of the cloud computer.</p>
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
