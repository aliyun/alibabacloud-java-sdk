// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateGroupDnsAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupDnsAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDnsAuthorizationRuleResponseBody self = new UpdateGroupDnsAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDnsAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
