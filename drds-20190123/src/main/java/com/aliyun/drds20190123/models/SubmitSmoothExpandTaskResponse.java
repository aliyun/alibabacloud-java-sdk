// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static SubmitSmoothExpandTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandTaskResponse self = new SubmitSmoothExpandTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmoothExpandTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
