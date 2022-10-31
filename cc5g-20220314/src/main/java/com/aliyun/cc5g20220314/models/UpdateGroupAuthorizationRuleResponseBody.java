// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateGroupAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupAuthorizationRuleResponseBody self = new UpdateGroupAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
