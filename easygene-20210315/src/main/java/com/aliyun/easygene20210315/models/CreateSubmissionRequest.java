// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionRequest extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 任务幂等token
    @NameInMap("ClientToken")
    public String clientToken;

    // 默认运行时
    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    @NameInMap("EntityNames")
    public java.util.List<String> entityNames;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 任务执行目录
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    // 任务配置
    @NameInMap("ExecuteOptions")
    public String executeOptions;

    // 任务输入
    @NameInMap("Inputs")
    public String inputs;

    // 任务输出拷贝目录
    @NameInMap("OutputFolder")
    public String outputFolder;

    // 任务输出
    @NameInMap("Outputs")
    public String outputs;

    // 应用版本号
    @NameInMap("Revision")
    public String revision;

    // 工作空间名字
    @NameInMap("Workspace")
    public String workspace;

    public static CreateSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubmissionRequest self = new CreateSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubmissionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSubmissionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubmissionRequest setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public CreateSubmissionRequest setEntityNames(java.util.List<String> entityNames) {
        this.entityNames = entityNames;
        return this;
    }
    public java.util.List<String> getEntityNames() {
        return this.entityNames;
    }

    public CreateSubmissionRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateSubmissionRequest setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public CreateSubmissionRequest setExecuteOptions(String executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }
    public String getExecuteOptions() {
        return this.executeOptions;
    }

    public CreateSubmissionRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public CreateSubmissionRequest setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public CreateSubmissionRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public CreateSubmissionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public CreateSubmissionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
