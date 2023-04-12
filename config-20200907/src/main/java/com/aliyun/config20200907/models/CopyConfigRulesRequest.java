// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyConfigRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the destination account groups into which the rules are replicated. Separate multiple account group IDs with commas (,).</p>
     * <br>
     * <p>>  If you leave this parameter empty, the compliance packages are replicated under the same account group.</p>
     */
    @NameInMap("DesAggregatorIds")
    public String desAggregatorIds;

    /**
     * <p>The ID of the account group to which the rules belong.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("SrcAggregatorId")
    public String srcAggregatorId;

    /**
     * <p>The IDs of the rules. Separate multiple rule IDs with commas (,).</p>
     */
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
