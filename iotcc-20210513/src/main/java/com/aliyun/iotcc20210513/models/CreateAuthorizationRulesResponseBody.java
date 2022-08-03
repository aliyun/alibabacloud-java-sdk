// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    public java.util.List<String> authorizationRuleIds;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRulesResponseBody self = new CreateAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRulesResponseBody setAuthorizationRuleIds(java.util.List<String> authorizationRuleIds) {
        this.authorizationRuleIds = authorizationRuleIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
    }

    public CreateAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
