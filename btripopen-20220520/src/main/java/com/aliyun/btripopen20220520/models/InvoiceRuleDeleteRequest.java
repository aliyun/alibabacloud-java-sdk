// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleDeleteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entities")
    public java.util.List<InvoiceRuleDeleteRequestEntities> entities;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static InvoiceRuleDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleDeleteRequest self = new InvoiceRuleDeleteRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleDeleteRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public InvoiceRuleDeleteRequest setEntities(java.util.List<InvoiceRuleDeleteRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<InvoiceRuleDeleteRequestEntities> getEntities() {
        return this.entities;
    }

    public InvoiceRuleDeleteRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static class InvoiceRuleDeleteRequestEntities extends TeaModel {
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

        public static InvoiceRuleDeleteRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleDeleteRequestEntities self = new InvoiceRuleDeleteRequestEntities();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleDeleteRequestEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public InvoiceRuleDeleteRequestEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
