// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildRuleRequest extends TeaModel {
    /**
     * <p>The type of the accelerated image. Valid values:</p>
     * <ul>
     * <li><code>ACCELERATED_IMAGE</code>: generates an accelerated image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The build rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crabr-o2670wqz2n70****</p>
     */
    @NameInMap("BuildRuleId")
    public String buildRuleId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the scope in which the rule takes effect. Valid values:</p>
     * <ul>
     * <li>ScopeId: the image repository ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>crr-8dz3aedjqlmk****</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <p>The scope of the rule. Valid values:</p>
     * <ul>
     * <li><code>REPOSITORY</code>: repository level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REPOSITORY</p>
     */
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
