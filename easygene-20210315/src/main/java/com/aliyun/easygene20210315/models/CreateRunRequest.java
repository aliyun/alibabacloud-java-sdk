// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunRequest extends TeaModel {
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
    public CreateRunRequestExecuteOptions executeOptions;

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

    public CreateRunRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateRunRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
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
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("CallCaching")
        public Boolean callCaching;

        /**
         * <strong>example:</strong>
         * <p>Mount</p>
         */
        @NameInMap("DataLoader")
        public String dataLoader;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        /**
         * <strong>example:</strong>
         * <p>NoNewCalls</p>
         */
        @NameInMap("FailureMode")
        public String failureMode;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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

        public CreateRunRequestExecuteOptions setDataLoader(String dataLoader) {
            this.dataLoader = dataLoader;
            return this;
        }
        public String getDataLoader() {
            return this.dataLoader;
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
