// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetBiddingDocInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBiddingDocInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBiddingDocInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingDocInfoResponseBody self = new GetBiddingDocInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBiddingDocInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBiddingDocInfoResponseBody setData(GetBiddingDocInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBiddingDocInfoResponseBodyData getData() {
        return this.data;
    }

    public GetBiddingDocInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBiddingDocInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBiddingDocInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBiddingDocInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBiddingDocInfoResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>markdown
         * html</p>
         */
        @NameInMap("ContentFormat")
        public String contentFormat;

        /**
         * <strong>example:</strong>
         * <p>outline
         * bidding</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>0-waiting、1-running、2-success、3-pause、4-fail</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>analysis
         * writing</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("TenderDocUrl")
        public String tenderDocUrl;

        /**
         * <strong>example:</strong>
         * <p>pdf
         * docx</p>
         */
        @NameInMap("TenderFileType")
        public String tenderFileType;

        public static GetBiddingDocInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBiddingDocInfoResponseBodyData self = new GetBiddingDocInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBiddingDocInfoResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetBiddingDocInfoResponseBodyData setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public GetBiddingDocInfoResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetBiddingDocInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetBiddingDocInfoResponseBodyData setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public GetBiddingDocInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetBiddingDocInfoResponseBodyData setTenderDocUrl(String tenderDocUrl) {
            this.tenderDocUrl = tenderDocUrl;
            return this;
        }
        public String getTenderDocUrl() {
            return this.tenderDocUrl;
        }

        public GetBiddingDocInfoResponseBodyData setTenderFileType(String tenderFileType) {
            this.tenderFileType = tenderFileType;
            return this;
        }
        public String getTenderFileType() {
            return this.tenderFileType;
        }

    }

}
