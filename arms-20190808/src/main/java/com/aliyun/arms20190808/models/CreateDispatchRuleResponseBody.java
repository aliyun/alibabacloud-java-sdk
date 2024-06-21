// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10413</p>
     */
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    /**
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
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
