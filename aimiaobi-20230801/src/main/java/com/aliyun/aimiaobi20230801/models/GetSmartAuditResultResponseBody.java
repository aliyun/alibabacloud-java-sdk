// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartAuditResultResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The review result.</p>
     */
    @NameInMap("Data")
    public GetSmartAuditResultResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSmartAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAuditResultResponseBody self = new GetSmartAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartAuditResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmartAuditResultResponseBody setData(GetSmartAuditResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmartAuditResultResponseBodyData getData() {
        return this.data;
    }

    public GetSmartAuditResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSmartAuditResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmartAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartAuditResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSmartAuditResultResponseBodyDataErrorItemDetails extends TeaModel {
        /**
         * <p>The unique ID of the review item.</p>
         * 
         * <strong>example:</strong>
         * <p>审核项唯一标识。</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The original text segment.</p>
         * 
         * <strong>example:</strong>
         * <p>原文片段</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <p>The offset index of the incorrect word within the context.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContextOffset")
        public Integer contextOffset;

        /**
         * <p>The error level. 1: critical, 2: warning, 3: notice, 4: suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ErrorLevel")
        public Integer errorLevel;

        /**
         * <p>The incorrect word.</p>
         * 
         * <strong>example:</strong>
         * <p>”xxx“</p>
         */
        @NameInMap("ErrorWord")
        public String errorWord;

        /**
         * <p>The primary error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ContentAccuracy</p>
         */
        @NameInMap("MajorCode")
        public String majorCode;

        /**
         * <p>The description of the primary error.</p>
         * 
         * <strong>example:</strong>
         * <p>内容准确性</p>
         */
        @NameInMap("MajorCodeDesc")
        public String majorCodeDesc;

        /**
         * <p>The offset index of the incorrect word in the full text.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>中文双引号应成对正确使用，先左双引号，后右双引号</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The suggested correction.</p>
         * 
         * <strong>example:</strong>
         * <p>“xxx”</p>
         */
        @NameInMap("RightWord")
        public String rightWord;

        /**
         * <p>The sub-error code.</p>
         * 
         * <strong>example:</strong>
         * <p>PunctuationError</p>
         */
        @NameInMap("SubClassCode")
        public String subClassCode;

        /**
         * <p>The description of the sub-error.</p>
         * 
         * <strong>example:</strong>
         * <p>标点符号错误</p>
         */
        @NameInMap("SubClassDesc")
        public String subClassDesc;

        /**
         * <p>In an image review scenario, this is the public URL of the image that triggered the review.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxxx.jpg">http://www.example.com/xxxx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetSmartAuditResultResponseBodyDataErrorItemDetails build(java.util.Map<String, ?> map) throws Exception {
            GetSmartAuditResultResponseBodyDataErrorItemDetails self = new GetSmartAuditResultResponseBodyDataErrorItemDetails();
            return TeaModel.build(map, self);
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setContextOffset(Integer contextOffset) {
            this.contextOffset = contextOffset;
            return this;
        }
        public Integer getContextOffset() {
            return this.contextOffset;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setErrorLevel(Integer errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public Integer getErrorLevel() {
            return this.errorLevel;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setErrorWord(String errorWord) {
            this.errorWord = errorWord;
            return this;
        }
        public String getErrorWord() {
            return this.errorWord;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setMajorCode(String majorCode) {
            this.majorCode = majorCode;
            return this;
        }
        public String getMajorCode() {
            return this.majorCode;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setMajorCodeDesc(String majorCodeDesc) {
            this.majorCodeDesc = majorCodeDesc;
            return this;
        }
        public String getMajorCodeDesc() {
            return this.majorCodeDesc;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setRightWord(String rightWord) {
            this.rightWord = rightWord;
            return this;
        }
        public String getRightWord() {
            return this.rightWord;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setSubClassCode(String subClassCode) {
            this.subClassCode = subClassCode;
            return this;
        }
        public String getSubClassCode() {
            return this.subClassCode;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setSubClassDesc(String subClassDesc) {
            this.subClassDesc = subClassDesc;
            return this;
        }
        public String getSubClassDesc() {
            return this.subClassDesc;
        }

        public GetSmartAuditResultResponseBodyDataErrorItemDetails setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetSmartAuditResultResponseBodyData extends TeaModel {
        /**
         * <p>The list of review error details.</p>
         */
        @NameInMap("ErrorItemDetails")
        public java.util.List<GetSmartAuditResultResponseBodyDataErrorItemDetails> errorItemDetails;

        /**
         * <p>If the final status is not SUCCESSED, read this error message to identify the fault.</p>
         * 
         * <strong>example:</strong>
         * <p>审核被取消</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task execution status. Valid values: PENDING, RUNNING, SUCCESSED, SUSPENDED, FAILED, and CANCELLED.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetSmartAuditResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmartAuditResultResponseBodyData self = new GetSmartAuditResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmartAuditResultResponseBodyData setErrorItemDetails(java.util.List<GetSmartAuditResultResponseBodyDataErrorItemDetails> errorItemDetails) {
            this.errorItemDetails = errorItemDetails;
            return this;
        }
        public java.util.List<GetSmartAuditResultResponseBodyDataErrorItemDetails> getErrorItemDetails() {
            return this.errorItemDetails;
        }

        public GetSmartAuditResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSmartAuditResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
