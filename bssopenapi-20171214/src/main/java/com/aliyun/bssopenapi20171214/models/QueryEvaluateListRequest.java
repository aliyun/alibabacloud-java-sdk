// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartAmount")
    public Long startAmount;

    @NameInMap("EndAmount")
    public Long endAmount;

    @NameInMap("StartBizTime")
    public String startBizTime;

    @NameInMap("EndBizTime")
    public String endBizTime;

    @NameInMap("SortType")
    public Integer sortType;

    @NameInMap("StartSearchTime")
    public String startSearchTime;

    @NameInMap("EndSearchTime")
    public String endSearchTime;

    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    public static QueryEvaluateListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListRequest self = new QueryEvaluateListRequest();
        return TeaModel.build(map, self);
    }

    public QueryEvaluateListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
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

    public QueryEvaluateListRequest setStartAmount(Long startAmount) {
        this.startAmount = startAmount;
        return this;
    }
    public Long getStartAmount() {
        return this.startAmount;
    }

    public QueryEvaluateListRequest setEndAmount(Long endAmount) {
        this.endAmount = endAmount;
        return this;
    }
    public Long getEndAmount() {
        return this.endAmount;
    }

    public QueryEvaluateListRequest setStartBizTime(String startBizTime) {
        this.startBizTime = startBizTime;
        return this;
    }
    public String getStartBizTime() {
        return this.startBizTime;
    }

    public QueryEvaluateListRequest setEndBizTime(String endBizTime) {
        this.endBizTime = endBizTime;
        return this;
    }
    public String getEndBizTime() {
        return this.endBizTime;
    }

    public QueryEvaluateListRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

    public QueryEvaluateListRequest setStartSearchTime(String startSearchTime) {
        this.startSearchTime = startSearchTime;
        return this;
    }
    public String getStartSearchTime() {
        return this.startSearchTime;
    }

    public QueryEvaluateListRequest setEndSearchTime(String endSearchTime) {
        this.endSearchTime = endSearchTime;
        return this;
    }
    public String getEndSearchTime() {
        return this.endSearchTime;
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

}
