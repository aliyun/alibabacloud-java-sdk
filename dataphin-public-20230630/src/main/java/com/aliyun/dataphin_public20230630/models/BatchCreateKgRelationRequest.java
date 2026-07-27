// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgRelationRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public BatchCreateKgRelationRequestCreateCommand createCommand;

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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static BatchCreateKgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgRelationRequest self = new BatchCreateKgRelationRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgRelationRequest setCreateCommand(BatchCreateKgRelationRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public BatchCreateKgRelationRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public BatchCreateKgRelationRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public BatchCreateKgRelationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class BatchCreateKgRelationRequestCreateCommandRelationListPropertyList extends TeaModel {
        /**
         * <p>The property code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchCreateKgRelationRequestCreateCommandRelationListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgRelationRequestCreateCommandRelationListPropertyList self = new BatchCreateKgRelationRequestCreateCommandRelationListPropertyList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgRelationRequestCreateCommandRelationListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchCreateKgRelationRequestCreateCommandRelationListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchCreateKgRelationRequestCreateCommandRelationList extends TeaModel {
        /**
         * <p>The list of relationship record properties.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<BatchCreateKgRelationRequestCreateCommandRelationListPropertyList> propertyList;

        /**
         * <p>The relationship type code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The ID of the source entity record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf81f</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <p>The ID of the target entity record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf82f</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static BatchCreateKgRelationRequestCreateCommandRelationList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgRelationRequestCreateCommandRelationList self = new BatchCreateKgRelationRequestCreateCommandRelationList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgRelationRequestCreateCommandRelationList setPropertyList(java.util.List<BatchCreateKgRelationRequestCreateCommandRelationListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<BatchCreateKgRelationRequestCreateCommandRelationListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public BatchCreateKgRelationRequestCreateCommandRelationList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public BatchCreateKgRelationRequestCreateCommandRelationList setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public BatchCreateKgRelationRequestCreateCommandRelationList setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

    public static class BatchCreateKgRelationRequestCreateCommand extends TeaModel {
        /**
         * <p>The list of relationships.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<BatchCreateKgRelationRequestCreateCommandRelationList> relationList;

        public static BatchCreateKgRelationRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgRelationRequestCreateCommand self = new BatchCreateKgRelationRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgRelationRequestCreateCommand setRelationList(java.util.List<BatchCreateKgRelationRequestCreateCommandRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<BatchCreateKgRelationRequestCreateCommandRelationList> getRelationList() {
            return this.relationList;
        }

    }

}
