// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteDispatchRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>*   `true`: successful</p>
     * <p>*   `false`: failed</p>
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
