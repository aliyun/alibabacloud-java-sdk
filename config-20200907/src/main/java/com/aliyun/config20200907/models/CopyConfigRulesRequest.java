// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyConfigRulesRequest extends TeaModel {
    @NameInMap("DesAggregatorIds")
    public String desAggregatorIds;

    @NameInMap("SrcAggregatorId")
    public String srcAggregatorId;

    @NameInMap("SrcConfigRuleIds")
    public String srcConfigRuleIds;

    public static CopyConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyConfigRulesRequest self = new CopyConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public CopyConfigRulesRequest setDesAggregatorIds(String desAggregatorIds) {
        this.desAggregatorIds = desAggregatorIds;
        return this;
    }
    public String getDesAggregatorIds() {
        return this.desAggregatorIds;
    }

    public CopyConfigRulesRequest setSrcAggregatorId(String srcAggregatorId) {
        this.srcAggregatorId = srcAggregatorId;
        return this;
    }
    public String getSrcAggregatorId() {
        return this.srcAggregatorId;
    }

    public CopyConfigRulesRequest setSrcConfigRuleIds(String srcConfigRuleIds) {
        this.srcConfigRuleIds = srcConfigRuleIds;
        return this;
    }
    public String getSrcConfigRuleIds() {
        return this.srcConfigRuleIds;
    }

}
