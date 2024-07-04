// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class FailedReason extends TeaModel {
    /**
     * <p>错误码。</p>
     * 
     * <strong>example:</strong>
     * <p>MissingParameter.InstanceType</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>错误信息。</p>
     * 
     * <strong>example:</strong>
     * <p>The instance type is required.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944abcd</p>
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
