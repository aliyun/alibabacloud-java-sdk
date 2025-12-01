// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBuyerDomainTradeRecordsRequest extends TeaModel {
    @NameInMap("BizIdList")
    public java.util.List<String> bizIdList;

    @NameInMap("DomainNameList")
    public java.util.List<String> domainNameList;

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
    public java.util.List<String> statusList;

    @NameInMap("SuffixList")
    public java.util.List<String> suffixList;

    @NameInMap("TradeTypeList")
    public java.util.List<String> tradeTypeList;

    public static QueryBuyerDomainTradeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyerDomainTradeRecordsRequest self = new QueryBuyerDomainTradeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuyerDomainTradeRecordsRequest setBizIdList(java.util.List<String> bizIdList) {
        this.bizIdList = bizIdList;
        return this;
    }
    public java.util.List<String> getBizIdList() {
        return this.bizIdList;
    }

    public QueryBuyerDomainTradeRecordsRequest setDomainNameList(java.util.List<String> domainNameList) {
        this.domainNameList = domainNameList;
        return this;
    }
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    public QueryBuyerDomainTradeRecordsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryBuyerDomainTradeRecordsRequest setEndPrice(Float endPrice) {
        this.endPrice = endPrice;
        return this;
    }
    public Float getEndPrice() {
        return this.endPrice;
    }

    public QueryBuyerDomainTradeRecordsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBuyerDomainTradeRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuyerDomainTradeRecordsRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public QueryBuyerDomainTradeRecordsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryBuyerDomainTradeRecordsRequest setStartPrice(Float startPrice) {
        this.startPrice = startPrice;
        return this;
    }
    public Float getStartPrice() {
        return this.startPrice;
    }

    public QueryBuyerDomainTradeRecordsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public QueryBuyerDomainTradeRecordsRequest setSuffixList(java.util.List<String> suffixList) {
        this.suffixList = suffixList;
        return this;
    }
    public java.util.List<String> getSuffixList() {
        return this.suffixList;
    }

    public QueryBuyerDomainTradeRecordsRequest setTradeTypeList(java.util.List<String> tradeTypeList) {
        this.tradeTypeList = tradeTypeList;
        return this;
    }
    public java.util.List<String> getTradeTypeList() {
        return this.tradeTypeList;
    }

}
