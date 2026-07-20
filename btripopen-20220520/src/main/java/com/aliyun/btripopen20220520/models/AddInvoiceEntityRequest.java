// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityRequest extends TeaModel {
    /**
     * <p>The list of entities.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("entities")
    public java.util.List<AddInvoiceEntityRequestEntities> entities;

    /**
     * <p>The third-party invoice ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4854821</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static AddInvoiceEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInvoiceEntityRequest self = new AddInvoiceEntityRequest();
        return TeaModel.build(map, self);
    }

    public AddInvoiceEntityRequest setEntities(java.util.List<AddInvoiceEntityRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<AddInvoiceEntityRequestEntities> getEntities() {
        return this.entities;
    }

    public AddInvoiceEntityRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static class AddInvoiceEntityRequestEntities extends TeaModel {
        /**
         * <p>The entity ID, which can be an employee ID, department ID, role ID, or third-party department ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>The entity name, which can be an employee name, department name, role name, or third-party department name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("entity_name")
        public String entityName;

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>1: employee</li>
         * <li>2: department</li>
         * <li>3: role</li>
         * <li>4: third-party department</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static AddInvoiceEntityRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            AddInvoiceEntityRequestEntities self = new AddInvoiceEntityRequestEntities();
            return TeaModel.build(map, self);
        }

        public AddInvoiceEntityRequestEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public AddInvoiceEntityRequestEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public AddInvoiceEntityRequestEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
