// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInvoiceForIsvRequest extends TeaModel {
    /**
     * <p>The end time. The time 23:59:59 is appended to the date by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start time. The time 00:00:00 is appended to the date by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-31 23:59:59</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The invoice application ID. This corresponds to the Result.Id field in the response of the DescribeInvoiceForIsv operation.</p>
     * 
     * <strong>example:</strong>
     * <p>4072040****</p>
     */
    @NameInMap("InvoiceId")
    public Long invoiceId;

    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 50. Default value: 10. (This parameter is not enabled.)</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token returned by this call. (This parameter is not enabled.)</p>
     * 
     * <strong>example:</strong>
     * <p>3v3mzZN1QdVsTPNiT0OkD9v+MeV8LSqSQDSuTTVFCUMMWShmnj/LXRMScqm242bB</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The number of instances per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The current invoice status. Valid values:</p>
     * <ul>
     * <li>0: processing</li>
     * <li>1: completed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The invoice type. If this parameter is left empty, all types are queried by default. Valid values:</p>
     * <ul>
     * <li>2: general digital electronic invoice</li>
     * <li>3: special digital electronic invoice</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Long type;

    /**
     * <p>The Alibaba Cloud user ID of the customer.</p>
     * 
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
