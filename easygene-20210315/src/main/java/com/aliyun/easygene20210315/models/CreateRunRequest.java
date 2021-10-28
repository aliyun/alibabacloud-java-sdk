// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunRequest extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用版本号
    @NameInMap("AppRevision")
    public String appRevision;

    // 任务幂等token
    @NameInMap("ClientToken")
    public String clientToken;

    // 默认运行时
    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    // 任务描述
    @NameInMap("Description")
    public String description;

    // 任务执行目录
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    // 任务配置
    @NameInMap("ExecuteOptions")
    public CreateRunRequestExecuteOptions executeOptions;

    // 任务输入
    @NameInMap("Inputs")
    public String inputs;

    // 任务标签
    @NameInMap("Labels")
    public String labels;

    // 任务输出拷贝目录
    @NameInMap("OutputFolder")
    public String outputFolder;

    // 任务名称
    @NameInMap("RunName")
    public String runName;

    // 工作空间名字
    @NameInMap("Workspace")
    public String workspace;

    public static CreateRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRunRequest self = new CreateRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateRunRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRunRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public CreateRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRunRequest setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public CreateRunRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRunRequest setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public CreateRunRequest setExecuteOptions(CreateRunRequestExecuteOptions executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }
    public CreateRunRequestExecuteOptions getExecuteOptions() {
        return this.executeOptions;
    }

    public CreateRunRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public CreateRunRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateRunRequest setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public CreateRunRequest setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public CreateRunRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateRunRequestExecuteOptions extends TeaModel {
        // 使用缓存
        @NameInMap("CallCaching")
        public Boolean callCaching;

        // 删除中间结果
        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        // 失败模式
        @NameInMap("FailureMode")
        public String failureMode;

        // 使用相对输出路径
        @NameInMap("UseRelativeOutputPaths")
        public Boolean useRelativeOutputPaths;

        public static CreateRunRequestExecuteOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateRunRequestExecuteOptions self = new CreateRunRequestExecuteOptions();
            return TeaModel.build(map, self);
        }

        public CreateRunRequestExecuteOptions setCallCaching(Boolean callCaching) {
            this.callCaching = callCaching;
            return this;
        }
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        public CreateRunRequestExecuteOptions setDeleteIntermediateResults(Boolean deleteIntermediateResults) {
            this.deleteIntermediateResults = deleteIntermediateResults;
            return this;
        }
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        public CreateRunRequestExecuteOptions setFailureMode(String failureMode) {
            this.failureMode = failureMode;
            return this;
        }
        public String getFailureMode() {
            return this.failureMode;
        }

        public CreateRunRequestExecuteOptions setUseRelativeOutputPaths(Boolean useRelativeOutputPaths) {
            this.useRelativeOutputPaths = useRelativeOutputPaths;
            return this;
        }
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

    }

}
