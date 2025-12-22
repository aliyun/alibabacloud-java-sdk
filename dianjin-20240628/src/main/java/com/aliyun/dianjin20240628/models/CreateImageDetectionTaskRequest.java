// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateImageDetectionTaskRequest extends TeaModel {
    @NameInMap("fileInfo")
    public CreateImageDetectionTaskRequestFileInfo fileInfo;

    /**
     * <strong>example:</strong>
     * <p>fileUrl</p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sfkhwjf</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateImageDetectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDetectionTaskRequest self = new CreateImageDetectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageDetectionTaskRequest setFileInfo(CreateImageDetectionTaskRequestFileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public CreateImageDetectionTaskRequestFileInfo getFileInfo() {
        return this.fileInfo;
    }

    public CreateImageDetectionTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateImageDetectionTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageDetectionTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateImageDetectionTaskRequestFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wanx-demo-1.png</p>
         */
        @NameInMap("fileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>wanx-demo-1.png</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>fileTraceId</p>
         */
        @NameInMap("fileTraceId")
        public String fileTraceId;

        /**
         * <strong>example:</strong>
         * <p>wanx-demo-1.png</p>
         */
        @NameInMap("ossKey")
        public String ossKey;

        public static CreateImageDetectionTaskRequestFileInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateImageDetectionTaskRequestFileInfo self = new CreateImageDetectionTaskRequestFileInfo();
            return TeaModel.build(map, self);
        }

        public CreateImageDetectionTaskRequestFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateImageDetectionTaskRequestFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateImageDetectionTaskRequestFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public CreateImageDetectionTaskRequestFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

}
