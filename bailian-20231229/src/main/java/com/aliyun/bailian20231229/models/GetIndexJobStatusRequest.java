// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexJobStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20230718xxxx-146c93bf</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetIndexJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexJobStatusRequest self = new GetIndexJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexJobStatusRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public GetIndexJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetIndexJobStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetIndexJobStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
