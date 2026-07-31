// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobRunsRequest extends TeaModel {
    /**
     * <p>The job name. Use the Data.Name value from the CreateSemanticJob response or the Name value from a ListSemanticJobs list item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic-job-demo</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The page number, starting from 1. If this parameter is omitted or set to a value less than or equal to 0, page 1 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of run records per page. If this parameter is omitted or set to a value less than or equal to 0, the default value 50 is used. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSemanticJobRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobRunsRequest self = new ListSemanticJobRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobRunsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListSemanticJobRunsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSemanticJobRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
