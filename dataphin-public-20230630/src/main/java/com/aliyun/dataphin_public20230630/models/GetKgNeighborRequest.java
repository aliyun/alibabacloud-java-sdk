// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgNeighborRequest extends TeaModel {
    /**
     * <p>The entity record data ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EntityDataId")
    public String entityDataId;

    /**
     * <p>The entity type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Student</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The entity record neighbor node query instruction.</p>
     */
    @NameInMap("NeighborsQuery")
    public GetKgNeighborRequestNeighborsQuery neighborsQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetKgNeighborRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKgNeighborRequest self = new GetKgNeighborRequest();
        return TeaModel.build(map, self);
    }

    public GetKgNeighborRequest setEntityDataId(String entityDataId) {
        this.entityDataId = entityDataId;
        return this;
    }
    public String getEntityDataId() {
        return this.entityDataId;
    }

    public GetKgNeighborRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetKgNeighborRequest setNeighborsQuery(GetKgNeighborRequestNeighborsQuery neighborsQuery) {
        this.neighborsQuery = neighborsQuery;
        return this;
    }
    public GetKgNeighborRequestNeighborsQuery getNeighborsQuery() {
        return this.neighborsQuery;
    }

    public GetKgNeighborRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetKgNeighborRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetKgNeighborRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetKgNeighborRequestNeighborsQuery extends TeaModel {
        /**
         * <p>The maximum depth of neighbor nodes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The direction type. Valid values:</p>
         * <ul>
         * <li>in: the current entity is the target node.</li>
         * <li>out: the current entity is the source node.</li>
         * <li>both: the current entity is both the source node and the target node.</li>
         * </ul>
         * <p>Default value: both.</p>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        @NameInMap("DirectionType")
        public String directionType;

        /**
         * <p>The list of relation types.</p>
         */
        @NameInMap("RelationTypes")
        public java.util.List<String> relationTypes;

        public static GetKgNeighborRequestNeighborsQuery build(java.util.Map<String, ?> map) throws Exception {
            GetKgNeighborRequestNeighborsQuery self = new GetKgNeighborRequestNeighborsQuery();
            return TeaModel.build(map, self);
        }

        public GetKgNeighborRequestNeighborsQuery setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public GetKgNeighborRequestNeighborsQuery setDirectionType(String directionType) {
            this.directionType = directionType;
            return this;
        }
        public String getDirectionType() {
            return this.directionType;
        }

        public GetKgNeighborRequestNeighborsQuery setRelationTypes(java.util.List<String> relationTypes) {
            this.relationTypes = relationTypes;
            return this;
        }
        public java.util.List<String> getRelationTypes() {
            return this.relationTypes;
        }

    }

}
