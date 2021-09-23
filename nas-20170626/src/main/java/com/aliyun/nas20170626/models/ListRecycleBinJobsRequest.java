// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycleBinJobsRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public ListRecycleBinJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRecycleBinJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRecycleBinJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
