// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopProjectTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static StopProjectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopProjectTaskResponseBody self = new StopProjectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopProjectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopProjectTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
