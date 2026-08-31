// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateKgRelationRequest extends TeaModel {
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
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateKgRelationRequestUpdateCommand updateCommand;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateKgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKgRelationRequest self = new UpdateKgRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKgRelationRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateKgRelationRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateKgRelationRequest setUpdateCommand(UpdateKgRelationRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateKgRelationRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public UpdateKgRelationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateKgRelationRequestUpdateCommandPropertyList extends TeaModel {
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

        public static UpdateKgRelationRequestUpdateCommandPropertyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateKgRelationRequestUpdateCommandPropertyList self = new UpdateKgRelationRequestUpdateCommandPropertyList();
            return TeaModel.build(map, self);
        }

        public UpdateKgRelationRequestUpdateCommandPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateKgRelationRequestUpdateCommandPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateKgRelationRequestUpdateCommand extends TeaModel {
        /**
         * <p>The list of relationship record properties.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<UpdateKgRelationRequestUpdateCommandPropertyList> propertyList;

        /**
         * <p>The relationship record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The relationship type code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        public static UpdateKgRelationRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateKgRelationRequestUpdateCommand self = new UpdateKgRelationRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateKgRelationRequestUpdateCommand setPropertyList(java.util.List<UpdateKgRelationRequestUpdateCommandPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<UpdateKgRelationRequestUpdateCommandPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public UpdateKgRelationRequestUpdateCommand setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public UpdateKgRelationRequestUpdateCommand setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

}
