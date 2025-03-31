// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepositoryRequest extends TeaModel {
    /**
     * <p>The description of the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the instance.</p>
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
     * <p>repo1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace to which the image repository belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace01</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The type of the repository. Valid values:</p>
     * <ul>
     * <li><code>PUBLIC</code>: The repository is a public repository.</li>
     * <li><code>PRIVATE</code>: The repository is a private repository.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The summary about the repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>Specifies whether to enable the feature of image tag immutability. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the feature of image tag immutability.</li>
     * <li><code>false</code>: disables the feature of image tag immutability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TagImmutability")
    public Boolean tagImmutability;

    public static CreateRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryRequest self = new CreateRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public CreateRepositoryRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateRepositoryRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public CreateRepositoryRequest setTagImmutability(Boolean tagImmutability) {
        this.tagImmutability = tagImmutability;
        return this;
    }
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

}
