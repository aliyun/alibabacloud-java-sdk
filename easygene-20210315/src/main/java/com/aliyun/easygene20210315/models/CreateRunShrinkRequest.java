// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentieon</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("AppRevision")
    public String appRevision;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2P1dvcmtzcGFjZT93cy1mMDE4OTgxNGU1ZTkK</p>
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
     * <strong>example:</strong>
     * <p>test run</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/exec/</p>
     */
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    /**
     * <strong>example:</strong>
     * <p>{ 	&quot;CallCaching&quot;: true,     &quot;FailureMode&quot;: &quot;NoNewCalls&quot; }</p>
     */
    @NameInMap("ExecuteOptions")
    public String executeOptionsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{         &quot;workflow1.task1.param1&quot;: &quot;helloooo.txt&quot;,         &quot;workflow1.task1.param2&quot;: &quot;abc&quot;,         &quot;workflow1.task2.param1&quot;: &quot;new_helloooo.txt&quot;,         &quot;workflow1.task2.param2&quot;: &quot;def&quot;     }</p>
     */
    @NameInMap("Inputs")
    public String inputs;

    /**
     * <strong>example:</strong>
     * <p>{&quot;env&quot;: &quot;test&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/output/</p>
     */
    @NameInMap("OutputFolder")
    public String outputFolder;

    /**
     * <strong>example:</strong>
     * <p>ProduceVersion</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    /**
     * <strong>example:</strong>
     * <p>TestRole</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>wgs_sentieon_hc_with_qc_NGPTS1900029301</p>
     */
    @NameInMap("RunName")
    public String runName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
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
