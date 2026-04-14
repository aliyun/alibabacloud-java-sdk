// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C7070EC3-DF66-58BA-A1DD-A8574FF53143</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>format_version: IaCService/2021-08-06\ndescription: create ALB\nupstream_input:\n  - name: stack_network\n ...</p>
         */
        @NameInMap("componentContent")
        public String componentContent;

        /**
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
        @NameInMap("config")
        public GetStackResponseBodyStackConfig config;

        /**
         * <strong>example:</strong>
         * <p>2025-07-24T02:58:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("currentConfigVersion")
        public String currentConfigVersion;

        /**
         * <strong>example:</strong>
         * <p>the description of stack</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>TestIacRole</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqxxxxxx</p>
         */
        @NameInMap("stackId")
        public String stackId;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>SetUpdated</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        /**
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
