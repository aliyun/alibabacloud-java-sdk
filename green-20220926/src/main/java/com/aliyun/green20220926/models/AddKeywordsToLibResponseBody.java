// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsToLibResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddKeywordsToLibResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddKeywordsToLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsToLibResponseBody self = new AddKeywordsToLibResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKeywordsToLibResponseBody setData(AddKeywordsToLibResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKeywordsToLibResponseBodyData getData() {
        return this.data;
    }

    public AddKeywordsToLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddKeywordsToLibResponseBodyDataKeywordsResult extends TeaModel {
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
         * <p>Invalid keyword count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The progress percentage of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Duplicate keyword count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <p>List of duplicate keywords</p>
         */
        @NameInMap("RepeatKeywords")
        public java.util.List<String> repeatKeywords;

        /**
         * <p>The success count of keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total count of keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static AddKeywordsToLibResponseBodyDataKeywordsResult build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordsToLibResponseBodyDataKeywordsResult self = new AddKeywordsToLibResponseBodyDataKeywordsResult();
            return TeaModel.build(map, self);
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setIllegalLengthKeywords(java.util.List<String> illegalLengthKeywords) {
            this.illegalLengthKeywords = illegalLengthKeywords;
            return this;
        }
        public java.util.List<String> getIllegalLengthKeywords() {
            return this.illegalLengthKeywords;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setInvalidKeywords(java.util.List<String> invalidKeywords) {
            this.invalidKeywords = invalidKeywords;
            return this;
        }
        public java.util.List<String> getInvalidKeywords() {
            return this.invalidKeywords;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setRepeatKeywords(java.util.List<String> repeatKeywords) {
            this.repeatKeywords = repeatKeywords;
            return this;
        }
        public java.util.List<String> getRepeatKeywords() {
            return this.repeatKeywords;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public AddKeywordsToLibResponseBodyDataKeywordsResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class AddKeywordsToLibResponseBodyData extends TeaModel {
        /**
         * <p>Result.</p>
         */
        @NameInMap("KeywordsResult")
        public AddKeywordsToLibResponseBodyDataKeywordsResult keywordsResult;

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

        public static AddKeywordsToLibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordsToLibResponseBodyData self = new AddKeywordsToLibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKeywordsToLibResponseBodyData setKeywordsResult(AddKeywordsToLibResponseBodyDataKeywordsResult keywordsResult) {
            this.keywordsResult = keywordsResult;
            return this;
        }
        public AddKeywordsToLibResponseBodyDataKeywordsResult getKeywordsResult() {
            return this.keywordsResult;
        }

        public AddKeywordsToLibResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordsToLibResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
