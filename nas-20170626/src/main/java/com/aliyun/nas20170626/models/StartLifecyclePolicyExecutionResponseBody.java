// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StartLifecyclePolicyExecutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>70EACC9C-D07A-4A34-ADA4-77506C42****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartLifecyclePolicyExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLifecyclePolicyExecutionResponseBody self = new StartLifecyclePolicyExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLifecyclePolicyExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartLifecyclePolicyExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
