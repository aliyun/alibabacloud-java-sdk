// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectDeploymentCandidatesRequest extends TeaModel {
    /**
     * <p>The change type.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("ChangeType")
    public String changeType;

    /**
     * <p>The start of the commit time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788739200000</p>
     */
    @NameInMap("CommitTimeFrom")
    public Long commitTimeFrom;

    /**
     * <p>The end of the commit time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788825599999</p>
     */
    @NameInMap("CommitTimeTo")
    public Long commitTimeTo;

    /**
     * <p>The committer.</p>
     * 
     * <strong>example:</strong>
     * <p>operator</p>
     */
    @NameInMap("CommitUser")
    public String commitUser;

    /**
     * <p>The cross-workspace deployment environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("DeploymentEnvironmentId")
    public Long deploymentEnvironmentId;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>object</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The candidate object ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The candidate object type.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCrossProjectDeploymentCandidatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectDeploymentCandidatesRequest self = new ListCrossProjectDeploymentCandidatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectDeploymentCandidatesRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public ListCrossProjectDeploymentCandidatesRequest setCommitTimeFrom(Long commitTimeFrom) {
        this.commitTimeFrom = commitTimeFrom;
        return this;
    }
    public Long getCommitTimeFrom() {
        return this.commitTimeFrom;
    }

    public ListCrossProjectDeploymentCandidatesRequest setCommitTimeTo(Long commitTimeTo) {
        this.commitTimeTo = commitTimeTo;
        return this;
    }
    public Long getCommitTimeTo() {
        return this.commitTimeTo;
    }

    public ListCrossProjectDeploymentCandidatesRequest setCommitUser(String commitUser) {
        this.commitUser = commitUser;
        return this;
    }
    public String getCommitUser() {
        return this.commitUser;
    }

    public ListCrossProjectDeploymentCandidatesRequest setDeploymentEnvironmentId(Long deploymentEnvironmentId) {
        this.deploymentEnvironmentId = deploymentEnvironmentId;
        return this;
    }
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    public ListCrossProjectDeploymentCandidatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCrossProjectDeploymentCandidatesRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListCrossProjectDeploymentCandidatesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListCrossProjectDeploymentCandidatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrossProjectDeploymentCandidatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrossProjectDeploymentCandidatesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
