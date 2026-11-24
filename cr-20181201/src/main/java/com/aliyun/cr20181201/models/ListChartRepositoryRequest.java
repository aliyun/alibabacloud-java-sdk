// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartRepositoryRequest extends TeaModel {
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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The status of the chart repository. Valid values:</p>
     * <ul>
     * <li><p><code>NORMAL</code>: The chart repository is in the Normal state.</p>
     * </li>
     * <li><p><code>DELETING</code>: The chart repository is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RepoStatus")
    public String repoStatus;

    public static ListChartRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChartRepositoryRequest self = new ListChartRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public ListChartRepositoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListChartRepositoryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartRepositoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartRepositoryRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListChartRepositoryRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public ListChartRepositoryRequest setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }
    public String getRepoStatus() {
        return this.repoStatus;
    }

}
