// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7070EC3-DF66-58BA-A1DD-A8574FF53143</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The stack information.</p>
     */
    @NameInMap("stack")
    public GetStackResponseBodyStack stack;

    public static GetStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponseBody self = new GetStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackResponseBody setStack(GetStackResponseBodyStack stack) {
        this.stack = stack;
        return this;
    }
    public GetStackResponseBodyStack getStack() {
        return this.stack;
    }

    public static class GetStackResponseBodyStackConfig extends TeaModel {
        /**
         * <p>The component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>format_version: IaCService/2021-08-06\ndescription: create ALB\nupstream_input:\n  - name: stack_network\n ...</p>
         */
        @NameInMap("componentContent")
        public String componentContent;

        /**
         * <p>The deployment configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>format_version: IaCService/2021-08-06\ndescription: create ALB \nvariable:\n  - name: region\n    type: string\n ...</p>
         */
        @NameInMap("deploymentContent")
        public String deploymentContent;

        public static GetStackResponseBodyStackConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyStackConfig self = new GetStackResponseBodyStackConfig();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyStackConfig setComponentContent(String componentContent) {
            this.componentContent = componentContent;
            return this;
        }
        public String getComponentContent() {
            return this.componentContent;
        }

        public GetStackResponseBodyStackConfig setDeploymentContent(String deploymentContent) {
            this.deploymentContent = deploymentContent;
            return this;
        }
        public String getDeploymentContent() {
            return this.deploymentContent;
        }

    }

    public static class GetStackResponseBodyStack extends TeaModel {
        /**
         * <p>The stack configuration.</p>
         */
        @NameInMap("config")
        public GetStackResponseBodyStackConfig config;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-24T02:58:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The current configuration version number, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("currentConfigVersion")
        public String currentConfigVersion;

        /**
         * <p>The description of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>the description of stack</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The stack name.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The RAM role assumed by the system to perform resource change operations during stack deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIacRole</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        /**
         * <p>The configuration source of the stack. Valid values:</p>
         * <ul>
         * <li>OSS: a template stored in Object Storage Service (OSS).</li>
         * <li>IAC_SERVICE_MODULE: a template created in the automation service console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path value of the configuration source. The value cannot exceed 1000 characters.</p>
         * <ul>
         * <li>If the source is OSS, the value is in the format of oss::<file link>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
         * <li>If the source is IAC_SERVICE_MODULE, the value is a template ID. Example: mod-xxxxx.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The unique identifier of the stack, which is generated after the stack is created.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqxxxxxx</p>
         */
        @NameInMap("stackId")
        public String stackId;

        /**
         * <p>The stack status.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Name</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Creating</td>
         * <td>The stack is being created.</td>
         * </tr>
         * <tr>
         * <td>Created</td>
         * <td>The stack is created.</td>
         * </tr>
         * <tr>
         * <td>Waiting</td>
         * <td>The stack is waiting for deployment.</td>
         * </tr>
         * <tr>
         * <td>Deploying</td>
         * <td>The stack is being deployed.</td>
         * </tr>
         * <tr>
         * <td>Deployed</td>
         * <td>The stack is deployed.</td>
         * </tr>
         * <tr>
         * <td>Errored</td>
         * <td>The deployment failed.</td>
         * </tr>
         * <tr>
         * <td>Deleting</td>
         * <td>The stack is being deleted.</td>
         * </tr>
         * <tr>
         * <td>Deleted</td>
         * <td>The stack is deleted.</td>
         * </tr>
         * <tr>
         * <td>DeleteFailed</td>
         * <td>The deletion failed.</td>
         * </tr>
         * <tr>
         * <td>DetectTriggered</td>
         * <td>Drift detection is triggered.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The deployment trigger method of the stack. This field is not publicly available.</p>
         * <ul>
         * <li>SetUpdated: triggered by file changes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SetUpdated</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
         * <p>The directory where the deployment and component configuration files of the stack are located. Set this parameter to / for the root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("workingDirectory")
        public String workingDirectory;

        public static GetStackResponseBodyStack build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseBodyStack self = new GetStackResponseBodyStack();
            return TeaModel.build(map, self);
        }

        public GetStackResponseBodyStack setConfig(GetStackResponseBodyStackConfig config) {
            this.config = config;
            return this;
        }
        public GetStackResponseBodyStackConfig getConfig() {
            return this.config;
        }

        public GetStackResponseBodyStack setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStackResponseBodyStack setCurrentConfigVersion(String currentConfigVersion) {
            this.currentConfigVersion = currentConfigVersion;
            return this;
        }
        public String getCurrentConfigVersion() {
            return this.currentConfigVersion;
        }

        public GetStackResponseBodyStack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackResponseBodyStack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStackResponseBodyStack setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetStackResponseBodyStack setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetStackResponseBodyStack setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetStackResponseBodyStack setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetStackResponseBodyStack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackResponseBodyStack setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public GetStackResponseBodyStack setWorkingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public String getWorkingDirectory() {
            return this.workingDirectory;
        }

    }

}
