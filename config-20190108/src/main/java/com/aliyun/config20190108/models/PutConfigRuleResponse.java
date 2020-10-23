// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutConfigRuleResponse extends TeaModel {
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    public String configRuleId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static PutConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutConfigRuleResponse self = new PutConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public PutConfigRuleResponse setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public PutConfigRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
