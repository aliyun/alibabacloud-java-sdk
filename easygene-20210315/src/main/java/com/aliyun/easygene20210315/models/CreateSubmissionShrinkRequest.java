// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    @NameInMap("EntityNames")
    public String entityNamesShrink;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    @NameInMap("ExecuteOptions")
    public String executeOptions;

    @NameInMap("Inputs")
    public String inputs;

    @NameInMap("OutputFolder")
    public String outputFolder;

    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateSubmissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubmissionShrinkRequest self = new CreateSubmissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubmissionShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSubmissionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubmissionShrinkRequest setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public CreateSubmissionShrinkRequest setEntityNamesShrink(String entityNamesShrink) {
        this.entityNamesShrink = entityNamesShrink;
        return this;
    }
    public String getEntityNamesShrink() {
        return this.entityNamesShrink;
    }

    public CreateSubmissionShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateSubmissionShrinkRequest setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public CreateSubmissionShrinkRequest setExecuteOptions(String executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }
    public String getExecuteOptions() {
        return this.executeOptions;
    }

    public CreateSubmissionShrinkRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public CreateSubmissionShrinkRequest setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public CreateSubmissionShrinkRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public CreateSubmissionShrinkRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public CreateSubmissionShrinkRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateSubmissionShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
