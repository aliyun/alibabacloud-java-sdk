// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all_employe")
    public Boolean allEmploye;

    @NameInMap("entities")
    public java.util.List<InvoiceRuleSaveRequestEntities> entities;

    @NameInMap("scope")
    public Integer scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i123</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static InvoiceRuleSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleSaveRequest self = new InvoiceRuleSaveRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleSaveRequest setAllEmploye(Boolean allEmploye) {
        this.allEmploye = allEmploye;
        return this;
    }
    public Boolean getAllEmploye() {
        return this.allEmploye;
    }

    public InvoiceRuleSaveRequest setEntities(java.util.List<InvoiceRuleSaveRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<InvoiceRuleSaveRequestEntities> getEntities() {
        return this.entities;
    }

    public InvoiceRuleSaveRequest setScope(Integer scope) {
        this.scope = scope;
        return this;
    }
    public Integer getScope() {
        return this.scope;
    }

    public InvoiceRuleSaveRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public static class InvoiceRuleSaveRequestEntities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static InvoiceRuleSaveRequestEntities build(java.util.Map<String, ?> map) throws Exception {
            InvoiceRuleSaveRequestEntities self = new InvoiceRuleSaveRequestEntities();
            return TeaModel.build(map, self);
        }

        public InvoiceRuleSaveRequestEntities setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InvoiceRuleSaveRequestEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvoiceRuleSaveRequestEntities setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
