// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The status of the job. Valid values:</p>
     * <br>
     * <p>*   Running: The job is running.</p>
     * <p>*   Defragmenting: The job is defragmenting data.</p>
     * <p>*   PartialSuccess: The job is partially completed.</p>
     * <p>*   Success: The job is completed.</p>
     * <p>*   Fail: The job failed.</p>
     * <p>*   Cancelled: The job is canceled.</p>
     * <p>*   All: all.Default value:All.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListRecycleBinJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecycleBinJobsRequest self = new ListRecycleBinJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecycleBinJobsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListRecycleBinJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListRecycleBinJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRecycleBinJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRecycleBinJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
