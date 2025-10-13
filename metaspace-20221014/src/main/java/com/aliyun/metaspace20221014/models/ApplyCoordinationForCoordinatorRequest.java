// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class ApplyCoordinationForCoordinatorRequest extends TeaModel {
    @NameInMap("CoordinationResourceCandidates")
    public java.util.List<ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates> coordinationResourceCandidates;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN_INITIATE</p>
     */
    @NameInMap("InitiatorType")
    public String initiatorType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-uuid-12345</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ApplyCoordinationForCoordinatorRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationForCoordinatorRequest self = new ApplyCoordinationForCoordinatorRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationForCoordinatorRequest setCoordinationResourceCandidates(java.util.List<ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates> coordinationResourceCandidates) {
        this.coordinationResourceCandidates = coordinationResourceCandidates;
        return this;
    }
    public java.util.List<ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates> getCoordinationResourceCandidates() {
        return this.coordinationResourceCandidates;
    }

    public ApplyCoordinationForCoordinatorRequest setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
        return this;
    }
    public String getInitiatorType() {
        return this.initiatorType;
    }

    public ApplyCoordinationForCoordinatorRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerEndUserId")
        public String ownerEndUserId;

        /**
         * <strong>example:</strong>
         * <p>41fd1254d8f7****</p>
         */
        @NameInMap("OwnerWyId")
        public String ownerWyId;

        /**
         * <strong>example:</strong>
         * <p>ai-ij4a6kd4bn2****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>test-resource</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates build(java.util.Map<String, ?> map) throws Exception {
            ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates self = new ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates();
            return TeaModel.build(map, self);
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setOwnerEndUserId(String ownerEndUserId) {
            this.ownerEndUserId = ownerEndUserId;
            return this;
        }
        public String getOwnerEndUserId() {
            return this.ownerEndUserId;
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setOwnerWyId(String ownerWyId) {
            this.ownerWyId = ownerWyId;
            return this;
        }
        public String getOwnerWyId() {
            return this.ownerWyId;
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ApplyCoordinationForCoordinatorRequestCoordinationResourceCandidates setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
