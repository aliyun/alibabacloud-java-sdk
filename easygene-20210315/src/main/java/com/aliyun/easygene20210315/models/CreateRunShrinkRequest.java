// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunShrinkRequest extends TeaModel {
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
    public String executeOptionsShrink;

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

    public static CreateRunShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRunShrinkRequest self = new CreateRunShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRunShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRunShrinkRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public CreateRunShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRunShrinkRequest setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public CreateRunShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRunShrinkRequest setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public CreateRunShrinkRequest setExecuteOptionsShrink(String executeOptionsShrink) {
        this.executeOptionsShrink = executeOptionsShrink;
        return this;
    }
    public String getExecuteOptionsShrink() {
        return this.executeOptionsShrink;
    }

    public CreateRunShrinkRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public CreateRunShrinkRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateRunShrinkRequest setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public CreateRunShrinkRequest setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public CreateRunShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
