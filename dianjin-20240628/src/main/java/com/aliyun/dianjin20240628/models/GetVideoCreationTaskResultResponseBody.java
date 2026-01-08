// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetVideoCreationTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetVideoCreationTaskResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("retryAble")
    public Boolean retryAble;

    @NameInMap("success")
    public Boolean success;

    public static GetVideoCreationTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreationTaskResultResponseBody self = new GetVideoCreationTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoCreationTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoCreationTaskResultResponseBody setData(GetVideoCreationTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoCreationTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetVideoCreationTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoCreationTaskResultResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public GetVideoCreationTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoCreationTaskResultResponseBodyDataFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileTraceId")
        public String fileTraceId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        public static GetVideoCreationTaskResultResponseBodyDataFileInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyDataFileInfo self = new GetVideoCreationTaskResultResponseBodyDataFileInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyDataFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetVideoCreationTaskResultResponseBodyDataFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetVideoCreationTaskResultResponseBodyDataFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public GetVideoCreationTaskResultResponseBodyDataFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

    public static class GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("confidence")
        public Double confidence;

        @NameInMap("pass")
        public Boolean pass;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("reason")
        public String reason;

        public static GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails self = new GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails setConfidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }
        public Double getConfidence() {
            return this.confidence;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult extends TeaModel {
        @NameInMap("detectionDetails")
        public java.util.List<GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails> detectionDetails;

        @NameInMap("suggestions")
        public java.util.List<String> suggestions;

        public static GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult self = new GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult setDetectionDetails(java.util.List<GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails> detectionDetails) {
            this.detectionDetails = detectionDetails;
            return this;
        }
        public java.util.List<GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResultDetectionDetails> getDetectionDetails() {
            return this.detectionDetails;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }
        public java.util.List<String> getSuggestions() {
            return this.suggestions;
        }

    }

    public static class GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fileTraceId")
        public String fileTraceId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        public static GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo self = new GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

    public static class GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("detectionConclusion")
        public String detectionConclusion;

        @NameInMap("detectionResult")
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult detectionResult;

        @NameInMap("fileInfo")
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo fileInfo;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult self = new GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult setDetectionConclusion(String detectionConclusion) {
            this.detectionConclusion = detectionConclusion;
            return this;
        }
        public String getDetectionConclusion() {
            return this.detectionConclusion;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult setDetectionResult(GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultDetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult setFileInfo(GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResultFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class GetVideoCreationTaskResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("estimatedWaitTimeInSeconds")
        public Long estimatedWaitTimeInSeconds;

        @NameInMap("fileInfo")
        public GetVideoCreationTaskResultResponseBodyDataFileInfo fileInfo;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        @NameInMap("mediaDetectionTaskResult")
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult mediaDetectionTaskResult;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("videoUrl")
        public String videoUrl;

        public static GetVideoCreationTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoCreationTaskResultResponseBodyData self = new GetVideoCreationTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoCreationTaskResultResponseBodyData setEstimatedWaitTimeInSeconds(Long estimatedWaitTimeInSeconds) {
            this.estimatedWaitTimeInSeconds = estimatedWaitTimeInSeconds;
            return this;
        }
        public Long getEstimatedWaitTimeInSeconds() {
            return this.estimatedWaitTimeInSeconds;
        }

        public GetVideoCreationTaskResultResponseBodyData setFileInfo(GetVideoCreationTaskResultResponseBodyDataFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public GetVideoCreationTaskResultResponseBodyDataFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public GetVideoCreationTaskResultResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetVideoCreationTaskResultResponseBodyData setMediaDetectionTaskResult(GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult mediaDetectionTaskResult) {
            this.mediaDetectionTaskResult = mediaDetectionTaskResult;
            return this;
        }
        public GetVideoCreationTaskResultResponseBodyDataMediaDetectionTaskResult getMediaDetectionTaskResult() {
            return this.mediaDetectionTaskResult;
        }

        public GetVideoCreationTaskResultResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetVideoCreationTaskResultResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetVideoCreationTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoCreationTaskResultResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetVideoCreationTaskResultResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
