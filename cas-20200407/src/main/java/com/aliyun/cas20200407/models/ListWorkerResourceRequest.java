// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWorkerResourceRequest extends TeaModel {
    /**
     * <p>The cloud service in the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>NLB</p>
     */
    @NameInMap("CloudProduct")
    public String cloudProduct;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the deployment task. You can call the <a href="https://help.aliyun.com/document_detail/2712234.html">CreateDeploymentJob</a> operation to obtain the ID of a deployment task from the <strong>ID</strong> parameter. You can also call the <a href="https://help.aliyun.com/document_detail/2712223.html">ListDeploymentJob</a> operation to obtain the ID of a deployment task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The number of entries per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The status of the worker task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>rollback</p>
     * </li>
     * <li><p>rollback_error</p>
     * </li>
     * <li><p>success</p>
     * </li>
     * <li><p>rollback_success</p>
     * </li>
     * <li><p>pending</p>
     * </li>
     * <li><p>scheduling</p>
     * </li>
     * <li><p>processing</p>
     * </li>
     * <li><p>error</p>
     * </li>
     * <li><p>editing</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>editing</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListWorkerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerResourceRequest self = new ListWorkerResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkerResourceRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public ListWorkerResourceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListWorkerResourceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListWorkerResourceRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListWorkerResourceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
