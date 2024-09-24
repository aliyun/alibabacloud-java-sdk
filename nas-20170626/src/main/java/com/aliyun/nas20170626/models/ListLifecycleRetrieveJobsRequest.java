// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListLifecycleRetrieveJobsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the data retrieval task. Valid values:</p>
     * <ul>
     * <li>active: The task is running.</li>
     * <li>canceled: The task is canceled.</li>
     * <li>completed: The task is completed.</li>
     * <li>failed: The task has failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The storage class.</p>
     * <ul>
     * <li>InfrequentAccess: the Infrequent Access (IA) storage class.</li>
     * <li>Archive: the Archive storage class.</li>
     * </ul>
     * <blockquote>
     * <p> If the StorageType parameter is not specified, data retrieval tasks of all types are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
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
