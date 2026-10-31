// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateRectifyFlowResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("Data")
    public CreateRectifyFlowResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRectifyFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRectifyFlowResponseBody self = new CreateRectifyFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRectifyFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRectifyFlowResponseBody setData(CreateRectifyFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRectifyFlowResponseBodyData getData() {
        return this.data;
    }

    public CreateRectifyFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateRectifyFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRectifyFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRectifyFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRectifyFlowResponseBodyData extends TeaModel {
        /**
         * <p>The actual number of deduplicated issues successfully included in this operation. Skipped issues and historical issues of the original process are excluded. Issues brought in by scope expansion are included.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProcessedIssueCount")
        public Long processedIssueCount;

        /**
         * <p>The list of process IDs for this operation.</p>
         */
        @NameInMap("RectifyIds")
        public java.util.List<Long> rectifyIds;

        public static CreateRectifyFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRectifyFlowResponseBodyData self = new CreateRectifyFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRectifyFlowResponseBodyData setProcessedIssueCount(Long processedIssueCount) {
            this.processedIssueCount = processedIssueCount;
            return this;
        }
        public Long getProcessedIssueCount() {
            return this.processedIssueCount;
        }

        public CreateRectifyFlowResponseBodyData setRectifyIds(java.util.List<Long> rectifyIds) {
            this.rectifyIds = rectifyIds;
            return this;
        }
        public java.util.List<Long> getRectifyIds() {
            return this.rectifyIds;
        }

    }

}
