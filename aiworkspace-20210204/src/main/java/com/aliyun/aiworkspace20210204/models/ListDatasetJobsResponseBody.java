// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobsResponseBody extends TeaModel {
    /**
     * <p>The jobs in the dataset.</p>
     */
    @NameInMap("DatasetJobs")
    public java.util.List<DatasetJob> datasetJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D7B2E70-F770-505B-A672-09F1D8F2EC1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of jobs.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDatasetJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobsResponseBody self = new ListDatasetJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobsResponseBody setDatasetJobs(java.util.List<DatasetJob> datasetJobs) {
        this.datasetJobs = datasetJobs;
        return this;
    }
    public java.util.List<DatasetJob> getDatasetJobs() {
        return this.datasetJobs;
    }

    public ListDatasetJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
