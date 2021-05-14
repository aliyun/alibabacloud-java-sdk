// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitHotExpandTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandTaskResponseBody self = new SubmitHotExpandTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitHotExpandTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
