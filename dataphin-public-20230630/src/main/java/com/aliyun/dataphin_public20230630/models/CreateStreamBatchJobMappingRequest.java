// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStreamBatchJobMappingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamBatchJobMappingCreateCommand")
    public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand;

    public static CreateStreamBatchJobMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamBatchJobMappingRequest self = new CreateStreamBatchJobMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamBatchJobMappingRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateStreamBatchJobMappingRequest setStreamBatchJobMappingCreateCommand(CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand streamBatchJobMappingCreateCommand) {
        this.streamBatchJobMappingCreateCommand = streamBatchJobMappingCreateCommand;
        return this;
    }
    public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand getStreamBatchJobMappingCreateCommand() {
        return this.streamBatchJobMappingCreateCommand;
    }

    public static class CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61187014-a3ba-4cdd-8609-1f0aa3df4a3d</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>这是一段任务的描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/karel</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vvr-8.0.9-flink-1.17</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>karel_hover_3</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FLINK_SQL</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7081229106458752</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-queue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREJOB</p>
         */
        @NameInMap("VvpClusterType")
        public String vvpClusterType;

        public static CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand self = new CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateStreamBatchJobMappingRequestStreamBatchJobMappingCreateCommand setVvpClusterType(String vvpClusterType) {
            this.vvpClusterType = vvpClusterType;
            return this;
        }
        public String getVvpClusterType() {
            return this.vvpClusterType;
        }

    }

}
