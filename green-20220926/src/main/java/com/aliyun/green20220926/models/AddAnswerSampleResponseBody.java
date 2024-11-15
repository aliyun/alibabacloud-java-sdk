// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAnswerSampleResponseBody extends TeaModel {
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
    public AddAnswerSampleResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>alAxbbxxxx-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static AddAnswerSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAnswerSampleResponseBody self = new AddAnswerSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAnswerSampleResponseBody setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public AddAnswerSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAnswerSampleResponseBody setResult(AddAnswerSampleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddAnswerSampleResponseBodyResult getResult() {
        return this.result;
    }

    public AddAnswerSampleResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AddAnswerSampleResponseBodyResult extends TeaModel {
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
         * <p>118</p>
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
         * <p>98</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        @NameInMap("RepeatSamples")
        public java.util.List<String> repeatSamples;

        /**
         * <strong>example:</strong>
         * <p>318</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>alAxbbxxxx-xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>534</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static AddAnswerSampleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddAnswerSampleResponseBodyResult self = new AddAnswerSampleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddAnswerSampleResponseBodyResult setI18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }
        public String getI18nKey() {
            return this.i18nKey;
        }

        public AddAnswerSampleResponseBodyResult setIllegalLengthSamples(java.util.List<String> illegalLengthSamples) {
            this.illegalLengthSamples = illegalLengthSamples;
            return this;
        }
        public java.util.List<String> getIllegalLengthSamples() {
            return this.illegalLengthSamples;
        }

        public AddAnswerSampleResponseBodyResult setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public AddAnswerSampleResponseBodyResult setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public AddAnswerSampleResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public AddAnswerSampleResponseBodyResult setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public AddAnswerSampleResponseBodyResult setRepeatSamples(java.util.List<String> repeatSamples) {
            this.repeatSamples = repeatSamples;
            return this;
        }
        public java.util.List<String> getRepeatSamples() {
            return this.repeatSamples;
        }

        public AddAnswerSampleResponseBodyResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public AddAnswerSampleResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public AddAnswerSampleResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
