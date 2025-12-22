// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateVideoCreationTaskRequest extends TeaModel {
    @NameInMap("creationInstruction")
    public CreateVideoCreationTaskRequestCreationInstruction creationInstruction;

    @NameInMap("fileInfo")
    public CreateVideoCreationTaskRequestFileInfo fileInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("imageDetectionTaskId")
    public String imageDetectionTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateVideoCreationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCreationTaskRequest self = new CreateVideoCreationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoCreationTaskRequest setCreationInstruction(CreateVideoCreationTaskRequestCreationInstruction creationInstruction) {
        this.creationInstruction = creationInstruction;
        return this;
    }
    public CreateVideoCreationTaskRequestCreationInstruction getCreationInstruction() {
        return this.creationInstruction;
    }

    public CreateVideoCreationTaskRequest setFileInfo(CreateVideoCreationTaskRequestFileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public CreateVideoCreationTaskRequestFileInfo getFileInfo() {
        return this.fileInfo;
    }

    public CreateVideoCreationTaskRequest setImageDetectionTaskId(String imageDetectionTaskId) {
        this.imageDetectionTaskId = imageDetectionTaskId;
        return this;
    }
    public String getImageDetectionTaskId() {
        return this.imageDetectionTaskId;
    }

    public CreateVideoCreationTaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoCreationTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateVideoCreationTaskRequestCreationInstruction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("templateId")
        public String templateId;

        public static CreateVideoCreationTaskRequestCreationInstruction build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoCreationTaskRequestCreationInstruction self = new CreateVideoCreationTaskRequestCreationInstruction();
            return TeaModel.build(map, self);
        }

        public CreateVideoCreationTaskRequestCreationInstruction setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateVideoCreationTaskRequestCreationInstruction setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateVideoCreationTaskRequestFileInfo extends TeaModel {
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

        public static CreateVideoCreationTaskRequestFileInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoCreationTaskRequestFileInfo self = new CreateVideoCreationTaskRequestFileInfo();
            return TeaModel.build(map, self);
        }

        public CreateVideoCreationTaskRequestFileInfo setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateVideoCreationTaskRequestFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoCreationTaskRequestFileInfo setFileTraceId(String fileTraceId) {
            this.fileTraceId = fileTraceId;
            return this;
        }
        public String getFileTraceId() {
            return this.fileTraceId;
        }

        public CreateVideoCreationTaskRequestFileInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

}
