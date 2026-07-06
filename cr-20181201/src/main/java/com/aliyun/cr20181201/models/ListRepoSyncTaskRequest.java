// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncTaskRequest extends TeaModel {
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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The page size.</p>
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
     * <p>test</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the repository namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>ns</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The ID of the sync task. This ID is also the <code>SyncBatchTaskId</code> returned in the response, which identifies the image\&quot;s sync batch task.</p>
     * <blockquote>
     * <p>An image that matches multiple sync rules generates multiple sync tasks, each with the same <code>SyncBatchTaskId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9d8ac4f6-8138-4c15-a2e3-60624ad3****</p>
     */
    @NameInMap("SyncRecordId")
    public String syncRecordId;

    /**
     * <p>The image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx</p>
     */
    @NameInMap("Tag")
    public String tag;

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

    public ListRepoSyncTaskRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public ListRepoSyncTaskRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public ListRepoSyncTaskRequest setSyncRecordId(String syncRecordId) {
        this.syncRecordId = syncRecordId;
        return this;
    }
    public String getSyncRecordId() {
        return this.syncRecordId;
    }

    public ListRepoSyncTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
