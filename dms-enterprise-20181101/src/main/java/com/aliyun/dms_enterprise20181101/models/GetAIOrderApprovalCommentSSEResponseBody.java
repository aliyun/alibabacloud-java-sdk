// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAIOrderApprovalCommentSSEResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Output")
    public GetAIOrderApprovalCommentSSEResponseBodyOutput output;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAIOrderApprovalCommentSSEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIOrderApprovalCommentSSEResponseBody self = new GetAIOrderApprovalCommentSSEResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIOrderApprovalCommentSSEResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAIOrderApprovalCommentSSEResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAIOrderApprovalCommentSSEResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIOrderApprovalCommentSSEResponseBody setOutput(GetAIOrderApprovalCommentSSEResponseBodyOutput output) {
        this.output = output;
        return this;
    }
    public GetAIOrderApprovalCommentSSEResponseBodyOutput getOutput() {
        return this.output;
    }

    public GetAIOrderApprovalCommentSSEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIOrderApprovalCommentSSEResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAIOrderApprovalCommentSSEResponseBodyOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;approvalStatus&quot;:&quot;建议拒绝&quot;,&quot;approvalSuggestion&quot;:&quot;xxx&quot;,&quot;sessionId&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        public static GetAIOrderApprovalCommentSSEResponseBodyOutput build(java.util.Map<String, ?> map) throws Exception {
            GetAIOrderApprovalCommentSSEResponseBodyOutput self = new GetAIOrderApprovalCommentSSEResponseBodyOutput();
            return TeaModel.build(map, self);
        }

        public GetAIOrderApprovalCommentSSEResponseBodyOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
