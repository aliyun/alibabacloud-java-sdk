// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteConfigRulesRequest extends TeaModel {
    /**
     * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/609222.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-9908626622af0035****</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DeleteConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRulesRequest self = new DeleteConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
