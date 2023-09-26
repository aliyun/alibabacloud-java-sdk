// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class SetApiRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetApiRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetApiRuleResponseBody self = new SetApiRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetApiRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
