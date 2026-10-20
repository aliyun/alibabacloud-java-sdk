// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexJobStatusRequest extends TeaModel {
    /**
     * <p>The knowledge base ID, which is the Data.Id returned by the CreateIndex operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The knowledge base job task ID, which is the Data.Id returned by the SubmitIndexJob or SubmitIndexAddDocumentsJob operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20230718xxxx-146c93bf</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Both the <strong>SubmitIndexJob</strong> and <strong>SubmitIndexAddDocumentsJob</strong> operations support batch file import. The fields returned by this operation include the overall status of the knowledge base job task (<code>Status</code>) and the import status of each file (<code>Document.Status</code>). If a large number of files are imported, you can use the <code>PageNumber</code> parameter for paging. The starting value is 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of file import tasks to return on each page during paging. Maximum value: unlimited. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
