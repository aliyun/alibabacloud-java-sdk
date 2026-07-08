// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDeepWriteTaskRequest extends TeaModel {
    /**
     * <p>The agent orchestration options.</p>
     */
    @NameInMap("AgentOrchestration")
    public SubmitDeepWriteTaskRequestAgentOrchestration agentOrchestration;

    /**
     * <p>A list of attachments.</p>
     */
    @NameInMap("Files")
    public java.util.List<SubmitDeepWriteTaskRequestFiles> files;

    /**
     * <p>The user\&quot;s question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>北京2025年新能源汽车发展趋势</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>请根据北京新能源汽车在汽车品牌、新车发布、能源等方面进行分析</p>
     */
    @NameInMap("Instructions")
    public String instructions;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">The workspace ID.</a></p>
     * 
     * <strong>example:</strong>
     * <p>llm-1setzb9xb8m11vrc</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitDeepWriteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeepWriteTaskRequest self = new SubmitDeepWriteTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDeepWriteTaskRequest setAgentOrchestration(SubmitDeepWriteTaskRequestAgentOrchestration agentOrchestration) {
        this.agentOrchestration = agentOrchestration;
        return this;
    }
    public SubmitDeepWriteTaskRequestAgentOrchestration getAgentOrchestration() {
        return this.agentOrchestration;
    }

    public SubmitDeepWriteTaskRequest setFiles(java.util.List<SubmitDeepWriteTaskRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<SubmitDeepWriteTaskRequestFiles> getFiles() {
        return this.files;
    }

    public SubmitDeepWriteTaskRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitDeepWriteTaskRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public SubmitDeepWriteTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent extends TeaModel {
        /**
         * <p>Specifies whether to enable retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataAnalystAgent</p>
         */
        @NameInMap("Name")
        public String name;

        public static SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent self = new SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataCollectorAgent</p>
         */
        @NameInMap("Name")
        public String name;

        public static SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent self = new SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent extends TeaModel {
        /**
         * <p>Specifies whether to enable citations.</p>
         */
        @NameInMap("EnableCitation")
        public Boolean enableCitation;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>ReporterAgent</p>
         */
        @NameInMap("Name")
        public String name;

        public static SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent self = new SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SubmitDeepWriteTaskRequestAgentOrchestration extends TeaModel {
        /**
         * <p>The data analysis agent.</p>
         */
        @NameInMap("DataAnalystAgent")
        public SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent dataAnalystAgent;

        /**
         * <p>The data collection agent.</p>
         */
        @NameInMap("DataCollectorAgent")
        public SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent dataCollectorAgent;

        /**
         * <p>The reporter agent.</p>
         */
        @NameInMap("ReporterAgent")
        public SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent reporterAgent;

        public static SubmitDeepWriteTaskRequestAgentOrchestration build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskRequestAgentOrchestration self = new SubmitDeepWriteTaskRequestAgentOrchestration();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskRequestAgentOrchestration setDataAnalystAgent(SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent dataAnalystAgent) {
            this.dataAnalystAgent = dataAnalystAgent;
            return this;
        }
        public SubmitDeepWriteTaskRequestAgentOrchestrationDataAnalystAgent getDataAnalystAgent() {
            return this.dataAnalystAgent;
        }

        public SubmitDeepWriteTaskRequestAgentOrchestration setDataCollectorAgent(SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent dataCollectorAgent) {
            this.dataCollectorAgent = dataCollectorAgent;
            return this;
        }
        public SubmitDeepWriteTaskRequestAgentOrchestrationDataCollectorAgent getDataCollectorAgent() {
            return this.dataCollectorAgent;
        }

        public SubmitDeepWriteTaskRequestAgentOrchestration setReporterAgent(SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent reporterAgent) {
            this.reporterAgent = reporterAgent;
            return this;
        }
        public SubmitDeepWriteTaskRequestAgentOrchestrationReporterAgent getReporterAgent() {
            return this.reporterAgent;
        }

    }

    public static class SubmitDeepWriteTaskRequestFiles extends TeaModel {
        /**
         * <p>A description of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>附件的说明</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <p>The Object Storage Service (OSS) address of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/aimiaobi-poc/aimiaobi/deep-write-upload/1_1/xxx.txt</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <p>The name of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>附件的名称</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static SubmitDeepWriteTaskRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskRequestFiles self = new SubmitDeepWriteTaskRequestFiles();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskRequestFiles setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public SubmitDeepWriteTaskRequestFiles setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public SubmitDeepWriteTaskRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
