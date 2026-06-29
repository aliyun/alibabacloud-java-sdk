// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeRequest extends TeaModel {
    /**
     * <p>The command to create a pipeline. Both offline and real-time pipelines are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreatePipelineNodeCommand")
    public CreatePipelineNodeRequestCreatePipelineNodeCommand createPipelineNodeCommand;

    /**
     * <p>The tenant ID.</p>
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
         * <p>The file description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The full path of the parent directory of the file. If this parameter is left empty, the root path (/) is used.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The file name.</p>
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
         * <p>The task file information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileInfo")
        public CreatePipelineNodeRequestCreatePipelineNodeCommandFileInfo fileInfo;

        /**
         * <p>The node type. Valid values: NORMAL, MANUAL, and REAL_TIME.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_TIME</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The pipeline name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_pipeline</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The pipeline type. Valid values: OFFLINE_PIPELINE and REAL_TIME_PIPELINE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_TIME_PIPELINE</p>
         */
        @NameInMap("PipelineType")
        public String pipelineType;

        /**
         * <p>The project ID.</p>
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
