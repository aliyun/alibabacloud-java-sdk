// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListRequest extends TeaModel {
    /**
     * <p>The billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>202003</p>
     */
    @NameInMap("BillCycle")
    public String billCycle;

    /**
     * <p>The market types in invoices.</p>
     * <blockquote>
     * <p> By default, this parameter is left empty. If this parameter is left empty, all market types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    /**
     * <p>The maximum amount to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("EndAmount")
    public Long endAmount;

    /**
     * <p>The latest time when an order is paid Specify the time in the yyyy-mm-dd hh:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 15:00:00</p>
     */
    @NameInMap("EndBizTime")
    public String endBizTime;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-02 12:00:00</p>
     */
    @NameInMap("EndSearchTime")
    public String endSearchTime;

    /**
     * <p>The ID of the external order.</p>
     * 
     * <strong>example:</strong>
     * <p>2387432832696</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the sort. Valid values:</p>
     * <ul>
     * <li>1: Sort invoices by ID in descending order.</li>
     * <li>2: Sort invoices by invoice type in descending order, and then sort invoices of the same type by ID in descending order.</li>
     * <li>3: Sort invoices by invoice type in ascending order, and then sort invoices of the same type by ID in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    /**
     * <p>The minimum amount to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StartAmount")
    public Long startAmount;

    /**
     * <p>The earliest time when an order is paid. Specify the time in the yyyy-mm-dd hh:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 12:00:00</p>
     */
    @NameInMap("StartBizTime")
    public String startBizTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 12:00:00</p>
     */
    @NameInMap("StartSearchTime")
    public String startSearchTime;

    /**
     * <p>The type of orders to be queried. Valid values:</p>
     * <ul>
     * <li>1: the orders in which the invoiceable amount is negative.</li>
     * <li>2: the orders in which the invoiceable amount is positive.</li>
     * <li>3: the orders in which the invoiceable amount is not 0.</li>
     * <li>4: the orders in which the amount that has been invoiced is greater than 0.</li>
     * </ul>
     * <blockquote>
     * <p> By default, this parameter is left empty. If this parameter is left empty, all orders are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static QueryEvaluateListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListRequest self = new QueryEvaluateListRequest();
        return TeaModel.build(map, self);
    }

    public QueryEvaluateListRequest setBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }
    public String getBillCycle() {
        return this.billCycle;
    }

    public QueryEvaluateListRequest setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public QueryEvaluateListRequest setEndAmount(Long endAmount) {
        this.endAmount = endAmount;
        return this;
    }
    public Long getEndAmount() {
        return this.endAmount;
    }

    public QueryEvaluateListRequest setEndBizTime(String endBizTime) {
        this.endBizTime = endBizTime;
        return this;
    }
    public String getEndBizTime() {
        return this.endBizTime;
    }

    public QueryEvaluateListRequest setEndSearchTime(String endSearchTime) {
        this.endSearchTime = endSearchTime;
        return this;
    }
    public String getEndSearchTime() {
        return this.endSearchTime;
    }

    public QueryEvaluateListRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public QueryEvaluateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryEvaluateListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryEvaluateListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEvaluateListRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

    public QueryEvaluateListRequest setStartAmount(Long startAmount) {
        this.startAmount = startAmount;
        return this;
    }
    public Long getStartAmount() {
        return this.startAmount;
    }

    public QueryEvaluateListRequest setStartBizTime(String startBizTime) {
        this.startBizTime = startBizTime;
        return this;
    }
    public String getStartBizTime() {
        return this.startBizTime;
    }

    public QueryEvaluateListRequest setStartSearchTime(String startSearchTime) {
        this.startSearchTime = startSearchTime;
        return this;
    }
    public String getStartSearchTime() {
        return this.startSearchTime;
    }

    public QueryEvaluateListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
