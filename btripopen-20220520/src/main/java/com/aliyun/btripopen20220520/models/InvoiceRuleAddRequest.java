// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleAddRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("entities")
    public java.util.List<InvoiceRuleAddRequestEntities> entities;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static InvoiceRuleAddRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleAddRequest self = new InvoiceRuleAddRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleAddRequest setEntities(java.util.List<InvoiceRuleAddRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<InvoiceRuleAddRequestEntities> getEntities() {
        return this.entities;
    }

    public InvoiceRuleAddRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static class InvoiceRuleAddRequestEntities extends TeaModel {
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

        public static InvoiceRuleAddRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleAddRequestEntities self = new InvoiceRuleAddRequestEntities();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleAddRequestEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public InvoiceRuleAddRequestEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public InvoiceRuleAddRequestEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
