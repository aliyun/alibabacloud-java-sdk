// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSmoothExpandTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandTaskResponseBody self = new SubmitSmoothExpandTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitSmoothExpandTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
