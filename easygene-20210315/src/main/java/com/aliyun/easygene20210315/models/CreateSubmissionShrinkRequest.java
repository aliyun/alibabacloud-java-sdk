// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>TestToken</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("EntityNames")
    public String entityNamesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestEntityType</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/my-exe-dir/</p>
     */
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    /**
     * <strong>example:</strong>
     * <p>{ 	        &quot;CallCaching&quot;: false, 	        &quot;DeleteIntermediateResults&quot;: true, 	        &quot;FailureMode&quot;: &quot;NoNewCalls&quot;         }</p>
     */
    @NameInMap("ExecuteOptions")
    public String executeOptions;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Inputs")
    public String inputs;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/my-output-dir/</p>
     */
    @NameInMap("OutputFolder")
    public String outputFolder;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Revision")
    public String revision;

    /**
     * <strong>example:</strong>
     * <p>ProduceVersion</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestWorkspace</p>
     */
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
