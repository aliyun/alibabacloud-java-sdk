// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateImageDetectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateImageDetectionTaskResponseBodyData data;

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

    public static CreateImageDetectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDetectionTaskResponseBody self = new CreateImageDetectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageDetectionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateImageDetectionTaskResponseBody setData(CreateImageDetectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageDetectionTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateImageDetectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageDetectionTaskResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public CreateImageDetectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateImageDetectionTaskResponseBodyDataFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fileTraceId")
        public String fileTraceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        public static CreateImageDetectionTaskResponseBodyDataFileInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateImageDetectionTaskResponseBodyDataFileInfo self = new CreateImageDetectionTaskResponseBodyDataFileInfo();
            return TeaModel.build(map, self);
        }

        public CreateImageDetectionTaskResponseBodyDataFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateImageDetectionTaskResponseBodyDataFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateImageDetectionTaskResponseBodyDataFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public CreateImageDetectionTaskResponseBodyDataFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

    public static class CreateImageDetectionTaskResponseBodyData extends TeaModel {
        @NameInMap("fileInfo")
        public CreateImageDetectionTaskResponseBodyDataFileInfo fileInfo;

        /**
         * <strong>example:</strong>
         * <p>a1112229</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>w4paqoezm2</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateImageDetectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateImageDetectionTaskResponseBodyData self = new CreateImageDetectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateImageDetectionTaskResponseBodyData setFileInfo(CreateImageDetectionTaskResponseBodyDataFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public CreateImageDetectionTaskResponseBodyDataFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public CreateImageDetectionTaskResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateImageDetectionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
