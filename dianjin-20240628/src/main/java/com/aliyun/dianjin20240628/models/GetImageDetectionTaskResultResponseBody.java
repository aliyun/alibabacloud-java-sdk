// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetImageDetectionTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetImageDetectionTaskResultResponseBodyData data;

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

    public static GetImageDetectionTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageDetectionTaskResultResponseBody self = new GetImageDetectionTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageDetectionTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageDetectionTaskResultResponseBody setData(GetImageDetectionTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageDetectionTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetImageDetectionTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageDetectionTaskResultResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public GetImageDetectionTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
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

        public static GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails self = new GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails setConfidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }
        public Double getConfidence() {
            return this.confidence;
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyDataDetectionResult extends TeaModel {
        @NameInMap("detectionDetails")
        public java.util.List<GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails> detectionDetails;

        @NameInMap("suggestions")
        public java.util.List<String> suggestions;

        public static GetImageDetectionTaskResultResponseBodyDataDetectionResult build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyDataDetectionResult self = new GetImageDetectionTaskResultResponseBodyDataDetectionResult();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResult setDetectionDetails(java.util.List<GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails> detectionDetails) {
            this.detectionDetails = detectionDetails;
            return this;
        }
        public java.util.List<GetImageDetectionTaskResultResponseBodyDataDetectionResultDetectionDetails> getDetectionDetails() {
            return this.detectionDetails;
        }

        public GetImageDetectionTaskResultResponseBodyDataDetectionResult setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }
        public java.util.List<String> getSuggestions() {
            return this.suggestions;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyDataFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
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

        public static GetImageDetectionTaskResultResponseBodyDataFileInfo build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyDataFileInfo self = new GetImageDetectionTaskResultResponseBodyDataFileInfo();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyDataFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetImageDetectionTaskResultResponseBodyDataFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetImageDetectionTaskResultResponseBodyDataFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public GetImageDetectionTaskResultResponseBodyDataFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

    public static class GetImageDetectionTaskResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("detectionConclusion")
        public String detectionConclusion;

        @NameInMap("detectionResult")
        public GetImageDetectionTaskResultResponseBodyDataDetectionResult detectionResult;

        @NameInMap("fileInfo")
        public GetImageDetectionTaskResultResponseBodyDataFileInfo fileInfo;

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

        public static GetImageDetectionTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageDetectionTaskResultResponseBodyData self = new GetImageDetectionTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageDetectionTaskResultResponseBodyData setDetectionConclusion(String detectionConclusion) {
            this.detectionConclusion = detectionConclusion;
            return this;
        }
        public String getDetectionConclusion() {
            return this.detectionConclusion;
        }

        public GetImageDetectionTaskResultResponseBodyData setDetectionResult(GetImageDetectionTaskResultResponseBodyDataDetectionResult detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyDataDetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        public GetImageDetectionTaskResultResponseBodyData setFileInfo(GetImageDetectionTaskResultResponseBodyDataFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public GetImageDetectionTaskResultResponseBodyDataFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public GetImageDetectionTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetImageDetectionTaskResultResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
