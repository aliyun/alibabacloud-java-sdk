// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgRelationRequest extends TeaModel {
    /**
     * <p>The paged query filter conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListKgRelationRequestListQuery listQuery;

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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The relationship type code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BELONG_TO</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListKgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKgRelationRequest self = new ListKgRelationRequest();
        return TeaModel.build(map, self);
    }

    public ListKgRelationRequest setListQuery(ListKgRelationRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListKgRelationRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListKgRelationRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListKgRelationRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ListKgRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ListKgRelationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListKgRelationRequestListQuery extends TeaModel {
        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The source entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf81f</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <p>The target entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf82f</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static ListKgRelationRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListKgRelationRequestListQuery self = new ListKgRelationRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListKgRelationRequestListQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListKgRelationRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListKgRelationRequestListQuery setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public ListKgRelationRequestListQuery setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

}
