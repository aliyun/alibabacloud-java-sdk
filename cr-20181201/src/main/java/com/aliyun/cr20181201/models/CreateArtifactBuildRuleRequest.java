// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactBuildRuleRequest extends TeaModel {
    /**
     * <p>The type of the accelerated image. Valid values:</p>
     * <ul>
     * <li><code>ACCELERATED_IMAGE</code>: accelerated image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-cxreylqvcyje****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The additional parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The ID of the scope in which the rule takes effect. Valid values:</p>
     * <ul>
     * <li>The ID of the image repository.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-pmajihou6cg0****</p>
     */
    @NameInMap("ScopeId")
    public String scopeId;

    /**
     * <p>The scope in which the rule takes effect. Valid values:</p>
     * <ul>
     * <li><code>REPOSITORY</code>: repository level.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPOSITORY</p>
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
