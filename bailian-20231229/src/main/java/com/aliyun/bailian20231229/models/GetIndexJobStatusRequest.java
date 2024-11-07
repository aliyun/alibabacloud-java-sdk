// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexJobStatusRequest extends TeaModel {
    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The knowledge base job ID, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> or <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20230718xxxx-146c93bf</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Both the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> and <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operations support batch import of documents. This operation returns both the overall <code>Status</code> of the job and the <code>Document.Status</code> of each document. If there are a large number of documents, you can use the <code>PageNumber</code> parameter to perform a paged query. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of document import jobs that are displayed on each page. No maximum value. Default value: 10.</p>
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
