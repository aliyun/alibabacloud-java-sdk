// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveApiRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveApiRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiRuleResponseBody self = new RemoveApiRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveApiRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
