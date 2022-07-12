// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForMonitoringRequest extends TeaModel {
    @NameInMap("CoordinatePolicyType")
    public String coordinatePolicyType;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("InitiatorType")
    public String initiatorType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceCandidates")
    public java.util.List<ApplyCoordinationForMonitoringRequestResourceCandidates> resourceCandidates;

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
        @NameInMap("OwnerAliUid")
        public Long ownerAliUid;

        @NameInMap("OwnerEndUserId")
        public String ownerEndUserId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceProperties")
        public String resourceProperties;

        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

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
