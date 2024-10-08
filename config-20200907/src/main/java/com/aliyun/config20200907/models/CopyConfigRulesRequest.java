// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyConfigRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the destination account groups into which the rules are replicated. Separate multiple account group IDs with commas (,).</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the compliance packages are replicated into the same account group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca-4b4e626622af005d****</p>
     */
    @NameInMap("DesAggregatorIds")
    public String desAggregatorIds;

    /**
     * <p>The ID of the account group to which the rules belong.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-24db626622af0060****</p>
     */
    @NameInMap("SrcAggregatorId")
    public String srcAggregatorId;

    /**
     * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-4b57626622af0065****,cr-47c1626622af0050****</p>
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
