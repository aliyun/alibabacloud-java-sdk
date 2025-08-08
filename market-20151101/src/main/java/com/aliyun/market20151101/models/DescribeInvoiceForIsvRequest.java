// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInvoiceForIsvRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2025-01-31 23:59:59</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>4072040****</p>
     */
    @NameInMap("InvoiceId")
    public Long invoiceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    @NameInMap("Type")
    public Long type;

    /**
     * <strong>example:</strong>
     * <p>174452687724****</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DescribeInvoiceForIsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvoiceForIsvRequest self = new DescribeInvoiceForIsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvoiceForIsvRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public DescribeInvoiceForIsvRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public DescribeInvoiceForIsvRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public DescribeInvoiceForIsvRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvoiceForIsvRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvoiceForIsvRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeInvoiceForIsvRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInvoiceForIsvRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DescribeInvoiceForIsvRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public DescribeInvoiceForIsvRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
