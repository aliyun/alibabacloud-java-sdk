// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppRevision")
    public String appRevision;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    @NameInMap("ExecuteOptions")
    public String executeOptionsShrink;

    @NameInMap("Inputs")
    public String inputs;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("OutputFolder")
    public String outputFolder;

    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("Role")
    public String role;

    @NameInMap("RunName")
    public String runName;

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

    public CreateRunShrinkRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateRunShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
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
