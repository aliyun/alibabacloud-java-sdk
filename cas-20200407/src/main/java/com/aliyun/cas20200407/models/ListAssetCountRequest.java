// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListAssetCountRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The expiration date of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-13</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The date of certificate issuance.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07-13</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static ListAssetCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCountRequest self = new ListAssetCountRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetCountRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListAssetCountRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListAssetCountRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListAssetCountRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
