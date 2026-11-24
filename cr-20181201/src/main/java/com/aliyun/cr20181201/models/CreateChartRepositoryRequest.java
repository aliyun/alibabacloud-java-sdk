// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChartRepositoryRequest extends TeaModel {
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
     * <p>The name of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo01</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace01</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The default type of the repository. Valid values:</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: public repository</p>
     * </li>
     * <li><p><code>PRIVATE</code>: private repository</p>
     * </li>
     * </ul>
     * <p>Specify either RepoType or Summary. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The summary of the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("Summary")
    public String summary;

    public static CreateChartRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChartRepositoryRequest self = new CreateChartRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateChartRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChartRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateChartRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public CreateChartRepositoryRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateChartRepositoryRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
