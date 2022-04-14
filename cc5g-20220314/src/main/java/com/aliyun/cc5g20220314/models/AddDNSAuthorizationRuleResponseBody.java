// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AddDNSAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddDNSAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDNSAuthorizationRuleResponseBody self = new AddDNSAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDNSAuthorizationRuleResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public AddDNSAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
