// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("entities")
    public java.util.List<AddInvoiceEntityRequestEntities> entities;

    /**
     * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_name")
        public String entityName;

        /**
         * <p>This parameter is required.</p>
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
