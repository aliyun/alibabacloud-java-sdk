// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveRequest extends TeaModel {
    @NameInMap("all_employe")
    public Boolean allEmploye;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("entities")
    public java.util.List<InvoiceRuleSaveRequestEntities> entities;

    @NameInMap("third_part_id")
    public String thirdPartId;

    @NameInMap("user_id")
    public String userId;

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

    public InvoiceRuleSaveRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public InvoiceRuleSaveRequest setEntities(java.util.List<InvoiceRuleSaveRequestEntities> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<InvoiceRuleSaveRequestEntities> getEntities() {
        return this.entities;
    }

    public InvoiceRuleSaveRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InvoiceRuleSaveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class InvoiceRuleSaveRequestEntities extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

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
