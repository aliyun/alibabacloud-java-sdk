// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateWorkFlowByJsonRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public CreateWorkFlowByJsonRequestContext context;

    /**
     * <p>The JSON script command for creating a workflow.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateWorkFlowByJsonRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateWorkFlowByJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkFlowByJsonRequest self = new CreateWorkFlowByJsonRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkFlowByJsonRequest setContext(CreateWorkFlowByJsonRequestContext context) {
        this.context = context;
        return this;
    }
    public CreateWorkFlowByJsonRequestContext getContext() {
        return this.context;
    }

    public CreateWorkFlowByJsonRequest setCreateCommand(CreateWorkFlowByJsonRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateWorkFlowByJsonRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateWorkFlowByJsonRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateWorkFlowByJsonRequestContext extends TeaModel {
        /**
         * <p>The current operating environment. Valid values:</p>
         * <ul>
         * <li>DEV: the development environment.</li>
         * <li>PROD: the production environment.</li>
         * </ul>
         * <p>The current version supports only BASIC mode, so set this parameter to PROD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the workflow node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>789</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static CreateWorkFlowByJsonRequestContext build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkFlowByJsonRequestContext self = new CreateWorkFlowByJsonRequestContext();
            return TeaModel.build(map, self);
        }

        public CreateWorkFlowByJsonRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreateWorkFlowByJsonRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateWorkFlowByJsonRequestCreateCommand extends TeaModel {
        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cooment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The folder to which the node belongs. If this parameter is left empty, the root folder is used.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The schedule configuration. This parameter is required for periodic nodes. The value is a JSON string. Refer to the utility class: com.alibaba.dataphin.pipeline.common.facade.openapi.model.OAScheduleConfig#toJsonString method.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cronExpression&quot;:&quot;0 0 0 * * ?&quot;}</p>
         */
        @NameInMap("ScheduleConfig")
        public String scheduleConfig;

        /**
         * <p>Specifies whether to submit the node. Default value: true.</p>
         */
        @NameInMap("Submit")
        public Boolean submit;

        /**
         * <p>The name of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workflow_name</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <ul>
         * <li>1: periodic scheduling.</li>
         * <li>3: manual scheduling.</li>
         * <li>5: real-time node.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5372881</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        /**
         * <p>The workflow JSON.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pipelineDTO&quot;:{&quot;hops&quot;:[],&quot;steps&quot;:[{&quot;name&quot;:&quot;xxx&quot;,&quot;x&quot;:305,&quot;y&quot;:144,&quot;id&quot;:&quot;c404a7c6-8a75-4ed8-b348-0785423ad859&quot;,&quot;webConfig&quot;:{},&quot;type&quot;:&quot;text&quot;,&quot;key&quot;:&quot;special_character_removal&quot;,&quot;pluginConfig&quot;:{&quot;neuronParameters&quot;:{},&quot;neuronInput&quot;:{},&quot;neuronOutput&quot;:{},&quot;setting&quot;:{}}}]}}</p>
         */
        @NameInMap("WorkFlowJson")
        public String workFlowJson;

        public static CreateWorkFlowByJsonRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkFlowByJsonRequestCreateCommand self = new CreateWorkFlowByJsonRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateWorkFlowByJsonRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setScheduleConfig(String scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setSubmit(Boolean submit) {
            this.submit = submit;
            return this;
        }
        public Boolean getSubmit() {
            return this.submit;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public CreateWorkFlowByJsonRequestCreateCommand setWorkFlowJson(String workFlowJson) {
            this.workFlowJson = workFlowJson;
            return this;
        }
        public String getWorkFlowJson() {
            return this.workFlowJson;
        }

    }

}
