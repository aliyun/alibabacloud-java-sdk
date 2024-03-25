// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListLifecycleRetrieveJobsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the data retrieval task. Valid values:</p>
     * <br>
     * <p>*   active: The task is running.</p>
     * <p>*   canceled: The task is canceled.</p>
     * <p>*   completed: The task is completed.</p>
     * <p>*   failed: The task has failed.</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("StorageType")
    public String storageType;

    public static ListLifecycleRetrieveJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLifecycleRetrieveJobsRequest self = new ListLifecycleRetrieveJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListLifecycleRetrieveJobsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListLifecycleRetrieveJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLifecycleRetrieveJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLifecycleRetrieveJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListLifecycleRetrieveJobsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
