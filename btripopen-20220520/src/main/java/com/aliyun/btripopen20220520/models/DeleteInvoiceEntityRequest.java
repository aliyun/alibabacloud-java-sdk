// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all applicable personnel. If del_all is set to true, all entities under the invoice header are deleted, and the entity list parameter is not validated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("del_all")
    public Boolean delAll;

    /**
     * <p>The entity list. This parameter is required when del_all is set to false or null.</p>
     */
    @NameInMap("entities")
    public java.util.List<DeleteInvoiceEntityRequestEntities> entities;

    /**
     * <p>The third-party invoice ID.</p>
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
         * <p>The entity ID, which can be a personnel ID, department ID, role ID, or third-party department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>The entity type. Valid values:</p>
         * <ul>
         * <li>1: employee</li>
         * <li>2: department</li>
         * <li>3: role</li>
         * <li>4: third-party department</li>
         * </ul>
         * 
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
