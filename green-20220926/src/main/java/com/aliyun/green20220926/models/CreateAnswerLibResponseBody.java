// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAnswerLibResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alxxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAnswerLibResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>alAxbbxxxx-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateAnswerLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAnswerLibResponseBody self = new CreateAnswerLibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAnswerLibResponseBody setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public CreateAnswerLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAnswerLibResponseBody setResult(CreateAnswerLibResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAnswerLibResponseBodyResult getResult() {
        return this.result;
    }

    public CreateAnswerLibResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class CreateAnswerLibResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("I18nKey")
        public String i18nKey;

        @NameInMap("IllegalLengthSamples")
        public java.util.List<String> illegalLengthSamples;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        /**
         * <strong>example:</strong>
         * <p>alxxxx</p>
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

        @NameInMap("RepeatSamples")
        public java.util.List<String> repeatSamples;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>alAaaaxxx-xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CreateAnswerLibResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAnswerLibResponseBodyResult self = new CreateAnswerLibResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAnswerLibResponseBodyResult setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public CreateAnswerLibResponseBodyResult setIllegalLengthSamples(java.util.List<String> illegalLengthSamples) {
            this.illegalLengthSamples = illegalLengthSamples;
            return this;
        }
        public java.util.List<String> getIllegalLengthSamples() {
            return this.illegalLengthSamples;
        }

        public CreateAnswerLibResponseBodyResult setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public CreateAnswerLibResponseBodyResult setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public CreateAnswerLibResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateAnswerLibResponseBodyResult setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public CreateAnswerLibResponseBodyResult setRepeatSamples(java.util.List<String> repeatSamples) {
            this.repeatSamples = repeatSamples;
            return this;
        }
        public java.util.List<String> getRepeatSamples() {
            return this.repeatSamples;
        }

        public CreateAnswerLibResponseBodyResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public CreateAnswerLibResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateAnswerLibResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
