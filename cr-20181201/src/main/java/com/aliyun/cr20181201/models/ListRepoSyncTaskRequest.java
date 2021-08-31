// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SyncRecordId")
    public String syncRecordId;

    public static ListRepoSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncTaskRequest self = new ListRepoSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoSyncTaskRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public ListRepoSyncTaskRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListRepoSyncTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListRepoSyncTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoSyncTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoSyncTaskRequest setSyncRecordId(String syncRecordId) {
        this.syncRecordId = syncRecordId;
        return this;
    }
    public String getSyncRecordId() {
        return this.syncRecordId;
    }

}
