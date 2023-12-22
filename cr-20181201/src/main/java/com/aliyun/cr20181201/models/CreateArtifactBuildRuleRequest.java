// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactBuildRuleRequest extends TeaModel {
    /**
     * <p>The type of the artifact.</p>
     * <br>
     * <p>*   `ACCELERATED_IMAGE`: accelerated images.</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Additional parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The ID of the effective range of the rule.</p>
     * <br>
     * <p>*   Set the value to the ID of the image repository.</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <p>The effective range of the rule. Valid values:</p>
     * <br>
     * <p>*   `REPOSITORY`</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static CreateArtifactBuildRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactBuildRuleRequest self = new CreateArtifactBuildRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactBuildRuleRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateArtifactBuildRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateArtifactBuildRuleRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public CreateArtifactBuildRuleRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public CreateArtifactBuildRuleRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
