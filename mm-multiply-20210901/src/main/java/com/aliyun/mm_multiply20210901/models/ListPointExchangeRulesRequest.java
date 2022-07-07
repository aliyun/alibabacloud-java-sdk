// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPointExchangeRulesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("OrderByMethod")
    public String orderByMethod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 关键词：规则名/备注/积分
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    // 开始时间
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static ListPointExchangeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPointExchangeRulesRequest self = new ListPointExchangeRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListPointExchangeRulesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListPointExchangeRulesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListPointExchangeRulesRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListPointExchangeRulesRequest setOrderByMethod(String orderByMethod) {
        this.orderByMethod = orderByMethod;
        return this;
    }
    public String getOrderByMethod() {
        return this.orderByMethod;
    }

    public ListPointExchangeRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPointExchangeRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPointExchangeRulesRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public ListPointExchangeRulesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListPointExchangeRulesRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public ListPointExchangeRulesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
