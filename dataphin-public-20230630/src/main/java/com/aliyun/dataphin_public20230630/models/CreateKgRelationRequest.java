// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateKgRelationRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateKgRelationRequestCreateCommand createCommand;

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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateKgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKgRelationRequest self = new CreateKgRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateKgRelationRequest setCreateCommand(CreateKgRelationRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateKgRelationRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateKgRelationRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateKgRelationRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public CreateKgRelationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateKgRelationRequestCreateCommandPropertyList extends TeaModel {
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

        public static CreateKgRelationRequestCreateCommandPropertyList build(java.util.Map<String, ?> map) throws Exception {
            CreateKgRelationRequestCreateCommandPropertyList self = new CreateKgRelationRequestCreateCommandPropertyList();
            return TeaModel.build(map, self);
        }

        public CreateKgRelationRequestCreateCommandPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateKgRelationRequestCreateCommandPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateKgRelationRequestCreateCommand extends TeaModel {
        /**
         * <p>The relationship record property list.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<CreateKgRelationRequestCreateCommandPropertyList> propertyList;

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
         * <p>The source entity record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf81f</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <p>The target entity record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e1d4559a4db044158305e2d89bccf82f</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static CreateKgRelationRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateKgRelationRequestCreateCommand self = new CreateKgRelationRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateKgRelationRequestCreateCommand setPropertyList(java.util.List<CreateKgRelationRequestCreateCommandPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<CreateKgRelationRequestCreateCommandPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public CreateKgRelationRequestCreateCommand setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public CreateKgRelationRequestCreateCommand setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public CreateKgRelationRequestCreateCommand setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

}
