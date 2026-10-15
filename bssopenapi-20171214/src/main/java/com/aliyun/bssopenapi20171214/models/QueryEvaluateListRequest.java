// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListRequest extends TeaModel {
    /**
     * <p>The billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>202502</p>
     */
    @NameInMap("BillCycle")
    public String billCycle;

    /**
     * <p>The list of invoicing entities to which the invoiceable objects belong.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    /**
     * <p>The maximum amount for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("EndAmount")
    public Long endAmount;

    /**
     * <p>The end of the time range to query based on the successful payment time. The format is yyyy-mm-dd hh:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-01 00:00:00</p>
     */
    @NameInMap("EndBizTime")
    public String endBizTime;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-01 00:00:00</p>
     */
    @NameInMap("EndSearchTime")
    public String endSearchTime;

    /**
     * <p>The order ID, bill ID, or contract ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2387432832696</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting type. Valid values:</p>
     * <ul>
     * <li><p>1: sorts the results by ID in descending order.</p>
     * </li>
     * <li><p>2: sorts the results by type in descending order, and then by ID in descending order.</p>
     * </li>
     * <li><p>3: sorts the results by type in ascending order, and then by ID in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    /**
     * <p>The minimum amount for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StartAmount")
    public Long startAmount;

    /**
     * <p>The beginning of the time range to query based on the successful payment time. The format is yyyy-mm-dd hh:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-01 00:00:00</p>
     */
    @NameInMap("StartBizTime")
    public String startBizTime;

    /**
     * <p>The start of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-01 00:00:00</p>
     */
    @NameInMap("StartSearchTime")
    public String startSearchTime;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li><p>1: queries objects with a negative invoiceable amount.</p>
     * </li>
     * <li><p>2: queries objects with a positive invoiceable amount.</p>
     * </li>
     * <li><p>3: queries all objects with a non-zero invoiceable amount.</p>
     * </li>
     * <li><p>4: queries objects with an invoiced amount greater than 0.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, all objects are queried.</p>
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
