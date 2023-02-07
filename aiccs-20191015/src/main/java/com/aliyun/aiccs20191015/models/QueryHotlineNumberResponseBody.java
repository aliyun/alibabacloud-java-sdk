// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryHotlineNumberResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryHotlineNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineNumberResponseBody self = new QueryHotlineNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotlineNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotlineNumberResponseBody setData(QueryHotlineNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryHotlineNumberResponseBodyData getData() {
        return this.data;
    }

    public QueryHotlineNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotlineNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotlineNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        public static QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList self = new QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList();
            return TeaModel.build(map, self);
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList extends TeaModel {
        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("GroupDOList")
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList> groupDOList;

        public static QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList self = new QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList();
            return TeaModel.build(map, self);
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList setGroupDOList(java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList> groupDOList) {
            this.groupDOList = groupDOList;
            return this;
        }
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeListGroupDOList> getGroupDOList() {
            return this.groupDOList;
        }

    }

    public static class QueryHotlineNumberResponseBodyDataHotlineNumList extends TeaModel {
        @NameInMap("CalloutAllDepartment")
        public Boolean calloutAllDepartment;

        @NameInMap("CalloutRangeList")
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList> calloutRangeList;

        @NameInMap("Description")
        public String description;

        @NameInMap("EvaluationStatus")
        public Integer evaluationStatus;

        @NameInMap("FlowId")
        public Long flowId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("HotlineNumber")
        public String hotlineNumber;

        @NameInMap("InBoundEnabled")
        public Boolean inBoundEnabled;

        @NameInMap("Location")
        public String location;

        @NameInMap("OutboundEnabled")
        public Boolean outboundEnabled;

        @NameInMap("Sp")
        public String sp;

        public static QueryHotlineNumberResponseBodyDataHotlineNumList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineNumberResponseBodyDataHotlineNumList self = new QueryHotlineNumberResponseBodyDataHotlineNumList();
            return TeaModel.build(map, self);
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setCalloutAllDepartment(Boolean calloutAllDepartment) {
            this.calloutAllDepartment = calloutAllDepartment;
            return this;
        }
        public Boolean getCalloutAllDepartment() {
            return this.calloutAllDepartment;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setCalloutRangeList(java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList> calloutRangeList) {
            this.calloutRangeList = calloutRangeList;
            return this;
        }
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumListCalloutRangeList> getCalloutRangeList() {
            return this.calloutRangeList;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setEvaluationStatus(Integer evaluationStatus) {
            this.evaluationStatus = evaluationStatus;
            return this;
        }
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setHotlineNumber(String hotlineNumber) {
            this.hotlineNumber = hotlineNumber;
            return this;
        }
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setInBoundEnabled(Boolean inBoundEnabled) {
            this.inBoundEnabled = inBoundEnabled;
            return this;
        }
        public Boolean getInBoundEnabled() {
            return this.inBoundEnabled;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setOutboundEnabled(Boolean outboundEnabled) {
            this.outboundEnabled = outboundEnabled;
            return this;
        }
        public Boolean getOutboundEnabled() {
            return this.outboundEnabled;
        }

        public QueryHotlineNumberResponseBodyDataHotlineNumList setSp(String sp) {
            this.sp = sp;
            return this;
        }
        public String getSp() {
            return this.sp;
        }

    }

    public static class QueryHotlineNumberResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("HotlineNumList")
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumList> hotlineNumList;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryHotlineNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryHotlineNumberResponseBodyData self = new QueryHotlineNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryHotlineNumberResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHotlineNumberResponseBodyData setHotlineNumList(java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumList> hotlineNumList) {
            this.hotlineNumList = hotlineNumList;
            return this;
        }
        public java.util.List<QueryHotlineNumberResponseBodyDataHotlineNumList> getHotlineNumList() {
            return this.hotlineNumList;
        }

        public QueryHotlineNumberResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHotlineNumberResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
