// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitHotExpandTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandTaskResponseBody self = new SubmitHotExpandTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitHotExpandTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
