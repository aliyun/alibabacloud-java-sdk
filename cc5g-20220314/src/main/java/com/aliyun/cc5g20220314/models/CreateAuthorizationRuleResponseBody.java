// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ar5g-12fnojjtkkre28t08j</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>61202DF5-668B-5EDA-8177-F2D71F4737C1</p>
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
