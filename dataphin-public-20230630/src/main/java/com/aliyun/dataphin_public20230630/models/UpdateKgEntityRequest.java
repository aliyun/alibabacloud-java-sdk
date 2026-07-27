// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateKgEntityRequest extends TeaModel {
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
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateKgEntityRequestUpdateCommand updateCommand;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateKgEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKgEntityRequest self = new UpdateKgEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKgEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateKgEntityRequest setUpdateCommand(UpdateKgEntityRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateKgEntityRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public UpdateKgEntityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateKgEntityRequestUpdateCommandPropertyList extends TeaModel {
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

        public static UpdateKgEntityRequestUpdateCommandPropertyList build(java.util.Map<String, ?> map) throws Exception {
            UpdateKgEntityRequestUpdateCommandPropertyList self = new UpdateKgEntityRequestUpdateCommandPropertyList();
            return TeaModel.build(map, self);
        }

        public UpdateKgEntityRequestUpdateCommandPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateKgEntityRequestUpdateCommandPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateKgEntityRequestUpdateCommand extends TeaModel {
        /**
         * <p>The entity record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity type code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity record property list.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<UpdateKgEntityRequestUpdateCommandPropertyList> propertyList;

        public static UpdateKgEntityRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateKgEntityRequestUpdateCommand self = new UpdateKgEntityRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateKgEntityRequestUpdateCommand setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateKgEntityRequestUpdateCommand setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public UpdateKgEntityRequestUpdateCommand setPropertyList(java.util.List<UpdateKgEntityRequestUpdateCommandPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<UpdateKgEntityRequestUpdateCommandPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
