// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D3BAFE75-C670-52DB-9739-03133E5FC914</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleResponseBody self = new UpdateAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
