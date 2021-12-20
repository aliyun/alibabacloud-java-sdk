// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupAuthorizationRuleResponseBody self = new DeleteGroupAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
