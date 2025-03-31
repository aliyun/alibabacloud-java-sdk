// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>repo-for-test</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>crr-tquyps22md8p****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <strong>example:</strong>
     * <p>dsp/domain-microapp</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <strong>example:</strong>
     * <p>ejiayou-other</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test repo</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
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
