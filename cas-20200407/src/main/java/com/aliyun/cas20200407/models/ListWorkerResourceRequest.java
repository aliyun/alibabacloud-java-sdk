// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWorkerResourceRequest extends TeaModel {
    @NameInMap("CloudProduct")
    public String cloudProduct;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("ShowSize")
    public Integer showSize;

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
