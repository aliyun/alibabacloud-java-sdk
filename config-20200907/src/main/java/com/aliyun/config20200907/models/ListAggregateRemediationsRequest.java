// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](https://help.aliyun.com/document_detail/264148.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ListAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsRequest self = new ListAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateRemediationsRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
