// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteDispatchRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16AF921B-8187-489F-9913-43C808B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDispatchRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDispatchRuleResponseBody self = new DeleteDispatchRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDispatchRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDispatchRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
