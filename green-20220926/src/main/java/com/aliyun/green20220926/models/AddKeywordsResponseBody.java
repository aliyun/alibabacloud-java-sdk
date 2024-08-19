// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddKeywordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddKeywordsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKeywordsResponseBody self = new AddKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKeywordsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddKeywordsResponseBody setData(AddKeywordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKeywordsResponseBodyData getData() {
        return this.data;
    }

    public AddKeywordsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddKeywordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddKeywordsResponseBodyDataKeywordsResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("I18nKey")
        public String i18nKey;

        @NameInMap("IllegalLengthKeywords")
        public java.util.List<String> illegalLengthKeywords;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        @NameInMap("InvalidKeywords")
        public java.util.List<String> invalidKeywords;

        /**
         * <strong>example:</strong>
         * <p>customxx_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        @NameInMap("RepeatKeywords")
        public java.util.List<String> repeatKeywords;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static AddKeywordsResponseBodyDataKeywordsResult build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordsResponseBodyDataKeywordsResult self = new AddKeywordsResponseBodyDataKeywordsResult();
            return TeaModel.build(map, self);
        }

        public AddKeywordsResponseBodyDataKeywordsResult setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setIllegalLengthKeywords(java.util.List<String> illegalLengthKeywords) {
            this.illegalLengthKeywords = illegalLengthKeywords;
            return this;
        }
        public java.util.List<String> getIllegalLengthKeywords() {
            return this.illegalLengthKeywords;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setInvalidKeywords(java.util.List<String> invalidKeywords) {
            this.invalidKeywords = invalidKeywords;
            return this;
        }
        public java.util.List<String> getInvalidKeywords() {
            return this.invalidKeywords;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setRepeatKeywords(java.util.List<String> repeatKeywords) {
            this.repeatKeywords = repeatKeywords;
            return this;
        }
        public java.util.List<String> getRepeatKeywords() {
            return this.repeatKeywords;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public AddKeywordsResponseBodyDataKeywordsResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class AddKeywordsResponseBodyData extends TeaModel {
        @NameInMap("KeywordsResult")
        public AddKeywordsResponseBodyDataKeywordsResult keywordsResult;

        /**
         * <strong>example:</strong>
         * <p>customxx_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AddKeywordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKeywordsResponseBodyData self = new AddKeywordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKeywordsResponseBodyData setKeywordsResult(AddKeywordsResponseBodyDataKeywordsResult keywordsResult) {
            this.keywordsResult = keywordsResult;
            return this;
        }
        public AddKeywordsResponseBodyDataKeywordsResult getKeywordsResult() {
            return this.keywordsResult;
        }

        public AddKeywordsResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddKeywordsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
