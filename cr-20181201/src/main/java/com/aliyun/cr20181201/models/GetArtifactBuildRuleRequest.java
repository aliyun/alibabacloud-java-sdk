// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildRuleRequest extends TeaModel {
    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("BuildRuleId")
    public String buildRuleId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScopeId")
    public String scopeId;

    @NameInMap("ScopeType")
    public String scopeType;

    public static GetArtifactBuildRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildRuleRequest self = new GetArtifactBuildRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildRuleRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetArtifactBuildRuleRequest setBuildRuleId(String buildRuleId) {
        this.buildRuleId = buildRuleId;
        return this;
    }
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    public GetArtifactBuildRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactBuildRuleRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public GetArtifactBuildRuleRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
