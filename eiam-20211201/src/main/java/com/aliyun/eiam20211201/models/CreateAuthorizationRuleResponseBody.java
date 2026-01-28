// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRuleResponseBody self = new CreateAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRuleResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public CreateAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
