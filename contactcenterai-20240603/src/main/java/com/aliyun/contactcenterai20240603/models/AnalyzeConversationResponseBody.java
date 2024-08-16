// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidUser.NotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorInfo")
    public String errorInfo;

    /**
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("finishReason")
    public String finishReason;

    /**
     * <strong>example:</strong>
     * <p>968A8634-FA2C-5381-9B3E-C552DED7E8BF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    @NameInMap("text")
    public String text;

    public static AnalyzeConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeConversationResponseBody self = new AnalyzeConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeConversationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AnalyzeConversationResponseBody setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

    public AnalyzeConversationResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public AnalyzeConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnalyzeConversationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AnalyzeConversationResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
