// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCrawlerWorkflowInstanceRequest extends TeaModel {
    @NameInMap("CrawlerId")
    public String crawlerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static ListCrawlerWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerWorkflowInstanceRequest self = new ListCrawlerWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListCrawlerWorkflowInstanceRequest setCrawlerId(String crawlerId) {
        this.crawlerId = crawlerId;
        return this;
    }
    public String getCrawlerId() {
        return this.crawlerId;
    }

    public ListCrawlerWorkflowInstanceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrawlerWorkflowInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrawlerWorkflowInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
