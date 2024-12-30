// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreatePipelineNodeCommand")
    public CreatePipelineNodeRequestCreatePipelineNodeCommand createPipelineNodeCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreatePipelineNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeRequest self = new CreatePipelineNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeRequest setCreatePipelineNodeCommand(CreatePipelineNodeRequestCreatePipelineNodeCommand createPipelineNodeCommand) {
        this.createPipelineNodeCommand = createPipelineNodeCommand;
        return this;
    }
    public CreatePipelineNodeRequestCreatePipelineNodeCommand getCreatePipelineNodeCommand() {
        return this.createPipelineNodeCommand;
    }

    public CreatePipelineNodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_pipeline</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo self = new CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo();
            return TeaModel.build(map, self);
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class CreatePipelineNodeRequestCreatePipelineNodeCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileInfo")
        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo fileInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_TIME</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_pipeline</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_TIME_PIPELINE</p>
         */
        @NameInMap("PipelineType")
        public String pipelineType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7091124176569088</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreatePipelineNodeRequestCreatePipelineNodeCommand build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineNodeRequestCreatePipelineNodeCommand self = new CreatePipelineNodeRequestCreatePipelineNodeCommand();
            return TeaModel.build(map, self);
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommand setFileInfo(CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommand setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommand setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommand setPipelineType(String pipelineType) {
            this.pipelineType = pipelineType;
            return this;
        }
        public String getPipelineType() {
            return this.pipelineType;
        }

        public CreatePipelineNodeRequestCreatePipelineNodeCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
