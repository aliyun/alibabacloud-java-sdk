// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordLibResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddKeywordLibResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID.</p>
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

    public static AddKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordLibResponseBody self = new AddKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKeywordLibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddKeywordLibResponseBody setData(AddKeywordLibResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKeywordLibResponseBodyData getData() {
        return this.data;
    }

    public AddKeywordLibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddKeywordLibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddKeywordLibResponseBodyDataKeywordsResult extends TeaModel {
        /**
         * <p>Internationalization key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("I18nKey")
        public String i18nKey;

        /**
         * <p>List of keywords that are too long or too short.</p>
         */
        @NameInMap("IllegalLengthKeywords")
        public java.util.List<String> illegalLengthKeywords;

        /**
         * <p>Invalid keyword count</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        /**
         * <p>List of invalid keywords</p>
         */
        @NameInMap("InvalidKeywords")
        public java.util.List<String> invalidKeywords;

        /**
         * <p>The id of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Duplicate keyword count</p>
         * 
         * <strong>example:</strong>
         * <p>118</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <p>List of duplicate keywords</p>
         */
        @NameInMap("RepeatKeywords")
        public java.util.List<String> repeatKeywords;

        /**
         * <p>Successful keyword count</p>
         * 
         * <strong>example:</strong>
         * <p>278</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The tips.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <p>The total number of keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>529</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static AddKeywordLibResponseBodyDataKeywordsResult build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordLibResponseBodyDataKeywordsResult self = new AddKeywordLibResponseBodyDataKeywordsResult();
            return TeaModel.build(map, self);
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setIllegalLengthKeywords(java.util.List<String> illegalLengthKeywords) {
            this.illegalLengthKeywords = illegalLengthKeywords;
            return this;
        }
        public java.util.List<String> getIllegalLengthKeywords() {
            return this.illegalLengthKeywords;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setInvalidKeywords(java.util.List<String> invalidKeywords) {
            this.invalidKeywords = invalidKeywords;
            return this;
        }
        public java.util.List<String> getInvalidKeywords() {
            return this.invalidKeywords;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setRepeatKeywords(java.util.List<String> repeatKeywords) {
            this.repeatKeywords = repeatKeywords;
            return this;
        }
        public java.util.List<String> getRepeatKeywords() {
            return this.repeatKeywords;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public AddKeywordLibResponseBodyDataKeywordsResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class AddKeywordLibResponseBodyData extends TeaModel {
        /**
         * <p>Result.</p>
         */
        @NameInMap("KeywordsResult")
        public AddKeywordLibResponseBodyDataKeywordsResult keywordsResult;

        /**
         * <p>The id of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AddKeywordLibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordLibResponseBodyData self = new AddKeywordLibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKeywordLibResponseBodyData setKeywordsResult(AddKeywordLibResponseBodyDataKeywordsResult keywordsResult) {
            this.keywordsResult = keywordsResult;
            return this;
        }
        public AddKeywordLibResponseBodyDataKeywordsResult getKeywordsResult() {
            return this.keywordsResult;
        }

        public AddKeywordLibResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordLibResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
