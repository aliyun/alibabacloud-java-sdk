// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryIntlFixedPriceOrderListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>T2024061115213700****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Status")
    public Long status;

    public static QueryIntlFixedPriceOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlFixedPriceOrderListRequest self = new QueryIntlFixedPriceOrderListRequest();
        return TeaModel.build(map, self);
    }

    public QueryIntlFixedPriceOrderListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryIntlFixedPriceOrderListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIntlFixedPriceOrderListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIntlFixedPriceOrderListRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
