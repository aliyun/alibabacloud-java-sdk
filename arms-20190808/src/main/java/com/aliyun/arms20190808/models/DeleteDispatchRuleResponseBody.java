// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteDispatchRuleResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    // 
    // *   `true`: successful
    // *   `false`: failed
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
