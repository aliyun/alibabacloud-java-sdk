// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPointExchangeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("OrderByMethod")
    public String orderByMethod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 积分兑换规则列表
    @NameInMap("PointExchangeRuleDTOList")
    public java.util.List<ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList> pointExchangeRuleDTOList;

    @NameInMap("RecordsPerPage")
    public Integer recordsPerPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalRecords")
    public Integer totalRecords;

    public static ListPointExchangeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPointExchangeRulesResponseBody self = new ListPointExchangeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPointExchangeRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPointExchangeRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPointExchangeRulesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListPointExchangeRulesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListPointExchangeRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPointExchangeRulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPointExchangeRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPointExchangeRulesResponseBody setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListPointExchangeRulesResponseBody setOrderByMethod(String orderByMethod) {
        this.orderByMethod = orderByMethod;
        return this;
    }
    public String getOrderByMethod() {
        return this.orderByMethod;
    }

    public ListPointExchangeRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPointExchangeRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPointExchangeRulesResponseBody setPointExchangeRuleDTOList(java.util.List<ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList> pointExchangeRuleDTOList) {
        this.pointExchangeRuleDTOList = pointExchangeRuleDTOList;
        return this;
    }
    public java.util.List<ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList> getPointExchangeRuleDTOList() {
        return this.pointExchangeRuleDTOList;
    }

    public ListPointExchangeRulesResponseBody setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
        return this;
    }
    public Integer getRecordsPerPage() {
        return this.recordsPerPage;
    }

    public ListPointExchangeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPointExchangeRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPointExchangeRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPointExchangeRulesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public ListPointExchangeRulesResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static class ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList extends TeaModel {
        @NameInMap("CouponTemplateIdList")
        public java.util.List<String> couponTemplateIdList;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PointAmount")
        public Long pointAmount;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList self = new ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList();
            return TeaModel.build(map, self);
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setCouponTemplateIdList(java.util.List<String> couponTemplateIdList) {
            this.couponTemplateIdList = couponTemplateIdList;
            return this;
        }
        public java.util.List<String> getCouponTemplateIdList() {
            return this.couponTemplateIdList;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setPointAmount(Long pointAmount) {
            this.pointAmount = pointAmount;
            return this;
        }
        public Long getPointAmount() {
            return this.pointAmount;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListPointExchangeRulesResponseBodyPointExchangeRuleDTOList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
