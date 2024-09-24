// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rb-15<strong><strong>ed-r-1625</strong></strong>2441</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Running: The job is running.</li>
     * <li>Defragmenting: The job is defragmenting data.</li>
     * <li>PartialSuccess: The job is partially completed.</li>
     * <li>Success: The job is completed.</li>
     * <li>Fail: The job failed.</li>
     * <li>Cancelled: The job is canceled.</li>
     * <li>all (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
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
