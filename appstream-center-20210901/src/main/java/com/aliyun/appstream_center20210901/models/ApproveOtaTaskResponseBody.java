// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ApproveOtaTaskResponseBody extends TeaModel {
    /**
     * <p>The execution result. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OtaTask.Running</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. If the value of <code>Code</code> is <code>success</code>, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The task is running and cannot be sumitted.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveOtaTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveOtaTaskResponseBody self = new ApproveOtaTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveOtaTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApproveOtaTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApproveOtaTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
