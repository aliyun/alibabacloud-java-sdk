// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0D797DC3-FF04-5C21-81EB-92C7799512E3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateTaskPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskPolicyResponseBody self = new UpdateTaskPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
