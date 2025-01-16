// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetTaskResultResponseBody extends TeaModel {
    @NameInMap("data")
    public GetTaskResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>968A8634-FA2C-5381-9B3E-C552DED7E8BF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static GetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponseBody self = new GetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponseBody setData(GetTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetTaskResultResponseBodyDataAsrResult extends TeaModel {
        @NameInMap("begin")
        public Long begin;

        @NameInMap("emotionValue")
        public Integer emotionValue;

        @NameInMap("end")
        public Long end;

        @NameInMap("role")
        public String role;

        @NameInMap("speechRate")
        public Integer speechRate;

        @NameInMap("words")
        public String words;

        public static GetTaskResultResponseBodyDataAsrResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyDataAsrResult self = new GetTaskResultResponseBodyDataAsrResult();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyDataAsrResult setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetTaskResultResponseBodyDataAsrResult setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public GetTaskResultResponseBodyDataAsrResult setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetTaskResultResponseBodyDataAsrResult setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetTaskResultResponseBodyDataAsrResult setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetTaskResultResponseBodyDataAsrResult setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

    public static class GetTaskResultResponseBodyData extends TeaModel {
        @NameInMap("asrResult")
        public java.util.List<GetTaskResultResponseBodyDataAsrResult> asrResult;

        @NameInMap("extra")
        public String extra;

        @NameInMap("taskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>20240905-********-93E9-5D45-B4EF-045743A34071</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        @NameInMap("text")
        public String text;

        public static GetTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyData self = new GetTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyData setAsrResult(java.util.List<GetTaskResultResponseBodyDataAsrResult> asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public java.util.List<GetTaskResultResponseBodyDataAsrResult> getAsrResult() {
            return this.asrResult;
        }

        public GetTaskResultResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetTaskResultResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public GetTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResultResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetTaskResultResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
