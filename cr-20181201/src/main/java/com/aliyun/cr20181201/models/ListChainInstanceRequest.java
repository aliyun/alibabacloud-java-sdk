// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainInstanceRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set this parameter to **ListChainInstance**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time when the delivery chain started.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The name of the image repository.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time when the delivery chain is completed.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the delivery chain.</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    public static ListChainInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChainInstanceRequest self = new ListChainInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListChainInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListChainInstanceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChainInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChainInstanceRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListChainInstanceRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

}
