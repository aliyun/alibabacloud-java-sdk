// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to query the ID of a rule, see [ListConfigRules](https://help.aliyun.com/document_detail/169607.html).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static GenerateConfigRulesReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRulesReportRequest self = new GenerateConfigRulesReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRulesReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateConfigRulesReportRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
