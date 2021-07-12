// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    public static CreateAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleResponseBody self = new CreateAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuthorizationRuleResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

}
