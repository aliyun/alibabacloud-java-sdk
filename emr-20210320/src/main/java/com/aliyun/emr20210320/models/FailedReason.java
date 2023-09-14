// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class FailedReason extends TeaModel {
    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FailedReason build(java.util.Map<String, ?> map) throws Exception {
        FailedReason self = new FailedReason();
        return TeaModel.build(map, self);
    }

    public FailedReason setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FailedReason setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FailedReason setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
