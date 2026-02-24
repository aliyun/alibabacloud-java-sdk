// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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
