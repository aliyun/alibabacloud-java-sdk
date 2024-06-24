// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entities")
    public java.util.List<DeleteInvoiceEntityRequestEntities> entities;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static DeleteInvoiceEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvoiceEntityRequest self = new DeleteInvoiceEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInvoiceEntityRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public DeleteInvoiceEntityRequest setEntities(java.util.List<DeleteInvoiceEntityRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<DeleteInvoiceEntityRequestEntities> getEntities() {
        return this.entities;
    }

    public DeleteInvoiceEntityRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static class DeleteInvoiceEntityRequestEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static DeleteInvoiceEntityRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            DeleteInvoiceEntityRequestEntities self = new DeleteInvoiceEntityRequestEntities();
            return TeaModel.build(map, self);
        }

        public DeleteInvoiceEntityRequestEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DeleteInvoiceEntityRequestEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
