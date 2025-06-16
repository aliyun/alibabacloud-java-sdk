// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartAuditResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSmartAuditResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContextOffset")
        public Integer contextOffset;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ErrorLevel")
        public Integer errorLevel;

        /**
         * <strong>example:</strong>
         * <p>”xxx“</p>
         */
        @NameInMap("ErrorWord")
        public String errorWord;

        /**
         * <strong>example:</strong>
         * <p>ContentAccuracy</p>
         */
        @NameInMap("MajorCode")
        public String majorCode;

        @NameInMap("MajorCodeDesc")
        public String majorCodeDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>“xxx”</p>
         */
        @NameInMap("RightWord")
        public String rightWord;

        /**
         * <strong>example:</strong>
         * <p>PunctuationError</p>
         */
        @NameInMap("SubClassCode")
        public String subClassCode;

        @NameInMap("SubClassDesc")
        public String subClassDesc;

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

    }

    public static class GetSmartAuditResultResponseBodyData extends TeaModel {
        @NameInMap("ErrorItemDetails")
        public java.util.List<GetSmartAuditResultResponseBodyDataErrorItemDetails> errorItemDetails;

        /**
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

        public GetSmartAuditResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
