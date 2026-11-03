// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateExperimentRequest extends TeaModel {
    /**
     * <p>The visibility of the experiment. It can be set to private (visible only to the creator and their Alibaba Cloud account) or public (visible to all users). This parameter is optional. Default value: private.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The default artifact output path for all nodes associated with the experiment. Only OSS paths are currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/test</p>
     */
    @NameInMap("ArtifactUri")
    public String artifactUri;

    /**
     * <p>The labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<LabelInfo> labels;

    /**
     * <p>The name of the experiment. The naming rules are as follows:</p>
     * <ul>
     * <li>Must start with a lowercase or uppercase letter.</li>
     * <li>Can contain lowercase and uppercase letters, digits, underscores (_), and hyphens (-).</li>
     * <li>Must be 1 to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRequest self = new CreateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateExperimentRequest setArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
    }
    public String getArtifactUri() {
        return this.artifactUri;
    }

    public CreateExperimentRequest setLabels(java.util.List<LabelInfo> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelInfo> getLabels() {
        return this.labels;
    }

    public CreateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
