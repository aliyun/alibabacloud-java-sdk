// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTaskDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static QueryTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailResponseBody self = new QueryTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskDetailResponseBody setData(QueryTaskDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskDetailResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryTaskDetailResponseBodyDataList extends TeaModel {
        @NameInMap("Ani")
        public String ani;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("Dnis")
        public String dnis;

        @NameInMap("EndReason")
        public Integer endReason;

        @NameInMap("ExtAttrs")
        public String extAttrs;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("OutboundNum")
        public Integer outboundNum;

        @NameInMap("OutboundTaskId")
        public Long outboundTaskId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RetryTime")
        public String retryTime;

        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("ServicerName")
        public String servicerName;

        @NameInMap("SkillGroup")
        public Integer skillGroup;

        @NameInMap("Status")
        public Integer status;

        public static QueryTaskDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailResponseBodyDataList self = new QueryTaskDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailResponseBodyDataList setAni(String ani) {
            this.ani = ani;
            return this;
        }
        public String getAni() {
            return this.ani;
        }

        public QueryTaskDetailResponseBodyDataList setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryTaskDetailResponseBodyDataList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryTaskDetailResponseBodyDataList setDnis(String dnis) {
            this.dnis = dnis;
            return this;
        }
        public String getDnis() {
            return this.dnis;
        }

        public QueryTaskDetailResponseBodyDataList setEndReason(Integer endReason) {
            this.endReason = endReason;
            return this;
        }
        public Integer getEndReason() {
            return this.endReason;
        }

        public QueryTaskDetailResponseBodyDataList setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public QueryTaskDetailResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTaskDetailResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTaskDetailResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryTaskDetailResponseBodyDataList setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryTaskDetailResponseBodyDataList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryTaskDetailResponseBodyDataList setOutboundNum(Integer outboundNum) {
            this.outboundNum = outboundNum;
            return this;
        }
        public Integer getOutboundNum() {
            return this.outboundNum;
        }

        public QueryTaskDetailResponseBodyDataList setOutboundTaskId(Long outboundTaskId) {
            this.outboundTaskId = outboundTaskId;
            return this;
        }
        public Long getOutboundTaskId() {
            return this.outboundTaskId;
        }

        public QueryTaskDetailResponseBodyDataList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTaskDetailResponseBodyDataList setRetryTime(String retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public String getRetryTime() {
            return this.retryTime;
        }

        public QueryTaskDetailResponseBodyDataList setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryTaskDetailResponseBodyDataList setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public QueryTaskDetailResponseBodyDataList setSkillGroup(Integer skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public Integer getSkillGroup() {
            return this.skillGroup;
        }

        public QueryTaskDetailResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryTaskDetailResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public String currentPage;

        @NameInMap("List")
        public java.util.List<QueryTaskDetailResponseBodyDataList> list;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalResults")
        public String totalResults;

        public static QueryTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskDetailResponseBodyData self = new QueryTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskDetailResponseBodyData setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public String getCurrentPage() {
            return this.currentPage;
        }

        public QueryTaskDetailResponseBodyData setList(java.util.List<QueryTaskDetailResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTaskDetailResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryTaskDetailResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryTaskDetailResponseBodyData setTotalResults(String totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public String getTotalResults() {
            return this.totalResults;
        }

    }

}
