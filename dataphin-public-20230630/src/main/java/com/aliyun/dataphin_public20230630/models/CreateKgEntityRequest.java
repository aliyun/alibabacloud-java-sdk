// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateKgEntityRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateKgEntityRequestCreateCommand createCommand;

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

    public static CreateKgEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKgEntityRequest self = new CreateKgEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateKgEntityRequest setCreateCommand(CreateKgEntityRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateKgEntityRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateKgEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateKgEntityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateKgEntityRequestCreateCommandPropertyList extends TeaModel {
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

        public static CreateKgEntityRequestCreateCommandPropertyList build(java.util.Map<String, ?> map) throws Exception {
            CreateKgEntityRequestCreateCommandPropertyList self = new CreateKgEntityRequestCreateCommandPropertyList();
            return TeaModel.build(map, self);
        }

        public CreateKgEntityRequestCreateCommandPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateKgEntityRequestCreateCommandPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateKgEntityRequestCreateCommand extends TeaModel {
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
        public java.util.List<CreateKgEntityRequestCreateCommandPropertyList> propertyList;

        public static CreateKgEntityRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateKgEntityRequestCreateCommand self = new CreateKgEntityRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateKgEntityRequestCreateCommand setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public CreateKgEntityRequestCreateCommand setPropertyList(java.util.List<CreateKgEntityRequestCreateCommandPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<CreateKgEntityRequestCreateCommandPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
