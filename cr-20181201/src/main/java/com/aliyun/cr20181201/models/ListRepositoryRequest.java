// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryRequest extends TeaModel {
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
     * <p>The maximum number of entries to return.</p>
     * <p>Use this parameter together with NextToken. This parameter takes priority over PageNo and PageSize.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. If a next page exists, the service returns a NextToken value. Pass this value in the next request.</p>
     * <p>Use this parameter together with MaxResults. This parameter takes priority over PageNo and PageSize.</p>
     * 
     * <strong>example:</strong>
     * <p>*****V3MpHK1AP0pfERHZN5pu6lESTRpd5hnHNnmKOP/+w9F</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    @Deprecated
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The maximum value is 100. If the specified value exceeds 100, the system returns a parameter error or uses 100 as the actual maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>repo-test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The repository namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>repo-namespace-test</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The repository status. Valid values:</p>
     * <ul>
     * <li><p><code>NORMAL</code>: Normal.</p>
     * </li>
     * <li><p><code>DELETING</code>: Being deleted.</p>
     * </li>
     * <li><p><code>DELETED</code>: Deleted.</p>
     * </li>
     * <li><p><code>ALL</code>: All repository statuses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("RepoStatus")
    public String repoStatus;

    public static ListRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryRequest self = new ListRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepositoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRepositoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    @Deprecated
    public ListRepositoryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    @Deprecated
    public ListRepositoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public ListRepositoryRequest setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }
    public String getRepoStatus() {
        return this.repoStatus;
    }

}
