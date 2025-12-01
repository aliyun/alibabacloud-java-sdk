// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBuyerDomainTradeRecordsShrinkRequest extends TeaModel {
    @NameInMap("BizIdList")
    public String bizIdListShrink;

    @NameInMap("DomainNameList")
    public String domainNameListShrink;

    /**
     * <strong>example:</strong>
     * <p>2025-07-07 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EndPrice")
    public Float endPrice;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;payTime\&quot;:\&quot;desc\&quot;}</p>
     */
    @NameInMap("Sorter")
    public String sorter;

    /**
     * <strong>example:</strong>
     * <p>2024-05-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartPrice")
    public Float startPrice;

    @NameInMap("StatusList")
    public String statusListShrink;

    @NameInMap("SuffixList")
    public String suffixListShrink;

    @NameInMap("TradeTypeList")
    public String tradeTypeListShrink;

    public static QueryBuyerDomainTradeRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyerDomainTradeRecordsShrinkRequest self = new QueryBuyerDomainTradeRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setBizIdListShrink(String bizIdListShrink) {
        this.bizIdListShrink = bizIdListShrink;
        return this;
    }
    public String getBizIdListShrink() {
        return this.bizIdListShrink;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setDomainNameListShrink(String domainNameListShrink) {
        this.domainNameListShrink = domainNameListShrink;
        return this;
    }
    public String getDomainNameListShrink() {
        return this.domainNameListShrink;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setEndPrice(Float endPrice) {
        this.endPrice = endPrice;
        return this;
    }
    public Float getEndPrice() {
        return this.endPrice;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setStartPrice(Float startPrice) {
        this.startPrice = startPrice;
        return this;
    }
    public Float getStartPrice() {
        return this.startPrice;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setSuffixListShrink(String suffixListShrink) {
        this.suffixListShrink = suffixListShrink;
        return this;
    }
    public String getSuffixListShrink() {
        return this.suffixListShrink;
    }

    public QueryBuyerDomainTradeRecordsShrinkRequest setTradeTypeListShrink(String tradeTypeListShrink) {
        this.tradeTypeListShrink = tradeTypeListShrink;
        return this;
    }
    public String getTradeTypeListShrink() {
        return this.tradeTypeListShrink;
    }

}
