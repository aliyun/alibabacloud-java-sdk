// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamItemsRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("Items")
    public String items;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static CreateHotParamItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamItemsRequest self = new CreateHotParamItemsRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotParamItemsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public CreateHotParamItemsRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public CreateHotParamItemsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
