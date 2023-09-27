// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactBuildRuleRequest extends TeaModel {
    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScopeId")
    public String scopeId;

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
