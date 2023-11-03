// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactBuildRuleShrinkRequest extends TeaModel {
    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("ScopeId")
    public String scopeId;

    @NameInMap("ScopeType")
    public String scopeType;

    public static CreateArtifactBuildRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactBuildRuleShrinkRequest self = new CreateArtifactBuildRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactBuildRuleShrinkRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateArtifactBuildRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateArtifactBuildRuleShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateArtifactBuildRuleShrinkRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public CreateArtifactBuildRuleShrinkRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
