// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveShrinkRequest extends TeaModel {
    @NameInMap("all_employe")
    public Boolean allEmploye;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("entities")
    public String entitiesShrink;

    @NameInMap("third_part_id")
    public String thirdPartId;

    @NameInMap("user_id")
    public String userId;

    public static InvoiceRuleSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleSaveShrinkRequest self = new InvoiceRuleSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleSaveShrinkRequest setAllEmploye(Boolean allEmploye) {
        this.allEmploye = allEmploye;
        return this;
    }
    public Boolean getAllEmploye() {
        return this.allEmploye;
    }

    public InvoiceRuleSaveShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public InvoiceRuleSaveShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

    public InvoiceRuleSaveShrinkRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    public InvoiceRuleSaveShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
