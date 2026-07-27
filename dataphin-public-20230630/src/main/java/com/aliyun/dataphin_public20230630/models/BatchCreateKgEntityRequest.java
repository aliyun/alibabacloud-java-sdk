// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgEntityRequest extends TeaModel {
    /**
     * <p>The create instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public BatchCreateKgEntityRequestCreateCommand createCommand;

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

    public static BatchCreateKgEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgEntityRequest self = new BatchCreateKgEntityRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgEntityRequest setCreateCommand(BatchCreateKgEntityRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public BatchCreateKgEntityRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public BatchCreateKgEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public BatchCreateKgEntityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class BatchCreateKgEntityRequestCreateCommandEntityListPropertyList extends TeaModel {
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

        public static BatchCreateKgEntityRequestCreateCommandEntityListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgEntityRequestCreateCommandEntityListPropertyList self = new BatchCreateKgEntityRequestCreateCommandEntityListPropertyList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgEntityRequestCreateCommandEntityListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchCreateKgEntityRequestCreateCommandEntityListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchCreateKgEntityRequestCreateCommandEntityList extends TeaModel {
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
         * <p>The list of entity record properties.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<BatchCreateKgEntityRequestCreateCommandEntityListPropertyList> propertyList;

        public static BatchCreateKgEntityRequestCreateCommandEntityList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgEntityRequestCreateCommandEntityList self = new BatchCreateKgEntityRequestCreateCommandEntityList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgEntityRequestCreateCommandEntityList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public BatchCreateKgEntityRequestCreateCommandEntityList setPropertyList(java.util.List<BatchCreateKgEntityRequestCreateCommandEntityListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<BatchCreateKgEntityRequestCreateCommandEntityListPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

    public static class BatchCreateKgEntityRequestCreateCommand extends TeaModel {
        /**
         * <p>The list of entity records.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("EntityList")
        public java.util.List<BatchCreateKgEntityRequestCreateCommandEntityList> entityList;

        public static BatchCreateKgEntityRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgEntityRequestCreateCommand self = new BatchCreateKgEntityRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgEntityRequestCreateCommand setEntityList(java.util.List<BatchCreateKgEntityRequestCreateCommandEntityList> entityList) {
            this.entityList = entityList;
            return this;
        }
        public java.util.List<BatchCreateKgEntityRequestCreateCommandEntityList> getEntityList() {
            return this.entityList;
        }

    }

}
