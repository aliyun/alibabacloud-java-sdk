// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AddGroupDnsAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ar5gg-12fnojjtkkre28t08j</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>D3BAFE75-C670-52DB-9739-03133E5FC914</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddGroupDnsAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGroupDnsAuthorizationRuleResponseBody self = new AddGroupDnsAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGroupDnsAuthorizationRuleResponseBody setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public AddGroupDnsAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
