// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepositoryRequest extends TeaModel {
    /**
     * <p>The repository description.</p>
     * 
     * <strong>example:</strong>
     * <p>repo-for-test</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The repository ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-tquyps22md8p****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>dsp/domain-microapp</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the repository namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>ejiayou-other</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The repository type. Valid values:</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: public repository</p>
     * </li>
     * <li><p><code>PRIVATE</code>: private repository.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>The summary.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test repo</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>Specifies whether image tag immutability is enabled. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TagImmutability")
    public Boolean tagImmutability;

    public static UpdateRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryRequest self = new UpdateRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRepositoryRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public UpdateRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public UpdateRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public UpdateRepositoryRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public UpdateRepositoryRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public UpdateRepositoryRequest setTagImmutability(Boolean tagImmutability) {
        this.tagImmutability = tagImmutability;
        return this;
    }
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

}
