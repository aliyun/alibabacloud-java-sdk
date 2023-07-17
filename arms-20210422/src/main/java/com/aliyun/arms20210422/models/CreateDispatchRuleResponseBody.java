// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleResponseBody extends TeaModel {
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDispatchRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDispatchRuleResponseBody self = new CreateDispatchRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDispatchRuleResponseBody setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public CreateDispatchRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
