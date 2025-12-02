// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordImportResultResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public GetKeywordImportResultResponseBodyData data;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKeywordImportResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordImportResultResponseBody self = new GetKeywordImportResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeywordImportResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetKeywordImportResultResponseBody setData(GetKeywordImportResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKeywordImportResultResponseBodyData getData() {
        return this.data;
    }

    public GetKeywordImportResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetKeywordImportResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKeywordImportResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKeywordImportResultResponseBodyData extends TeaModel {
        /**
         * <p>Internationalization key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("I18nKey")
        public String i18nKey;

        /**
         * <p>List of keywords with illegal length (too long or too short).</p>
         */
        @NameInMap("IllegalLengthKeywords")
        public java.util.List<String> illegalLengthKeywords;

        /**
         * <p>Invalid count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        /**
         * <p>List of invalid keywords.</p>
         */
        @NameInMap("InvalidKeywords")
        public java.util.List<String> invalidKeywords;

        /**
         * <p>Keyword library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Task progress percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Repeat count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <p>List of repeated keywords.</p>
         */
        @NameInMap("RepeatKeywords")
        public java.util.List<String> repeatKeywords;

        /**
         * <p>Success count.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>Tips message.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetKeywordImportResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKeywordImportResultResponseBodyData self = new GetKeywordImportResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKeywordImportResultResponseBodyData setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public GetKeywordImportResultResponseBodyData setIllegalLengthKeywords(java.util.List<String> illegalLengthKeywords) {
            this.illegalLengthKeywords = illegalLengthKeywords;
            return this;
        }
        public java.util.List<String> getIllegalLengthKeywords() {
            return this.illegalLengthKeywords;
        }

        public GetKeywordImportResultResponseBodyData setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public GetKeywordImportResultResponseBodyData setInvalidKeywords(java.util.List<String> invalidKeywords) {
            this.invalidKeywords = invalidKeywords;
            return this;
        }
        public java.util.List<String> getInvalidKeywords() {
            return this.invalidKeywords;
        }

        public GetKeywordImportResultResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public GetKeywordImportResultResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetKeywordImportResultResponseBodyData setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public GetKeywordImportResultResponseBodyData setRepeatKeywords(java.util.List<String> repeatKeywords) {
            this.repeatKeywords = repeatKeywords;
            return this;
        }
        public java.util.List<String> getRepeatKeywords() {
            return this.repeatKeywords;
        }

        public GetKeywordImportResultResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetKeywordImportResultResponseBodyData setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public GetKeywordImportResultResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
