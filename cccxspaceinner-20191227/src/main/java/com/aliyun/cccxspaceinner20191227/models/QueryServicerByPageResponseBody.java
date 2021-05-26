// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryServicerByPageResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // data
    @NameInMap("Data")
    public QueryServicerByPageResponseBodyData data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QueryServicerByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByPageResponseBody self = new QueryServicerByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServicerByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryServicerByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServicerByPageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryServicerByPageResponseBody setData(QueryServicerByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryServicerByPageResponseBodyData getData() {
        return this.data;
    }

    public QueryServicerByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryServicerByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryServicerByPageResponseBodyDataResultsGroups extends TeaModel {
        // groupId
        @NameInMap("GroupId")
        public Long groupId;

        // skillType
        @NameInMap("SkillType")
        public Integer skillType;

        // departmentId
        @NameInMap("DepartmentId")
        public Long departmentId;

        // description
        @NameInMap("Description")
        public String description;

        // showName
        @NameInMap("ShowName")
        public String showName;

        // groupName
        @NameInMap("GroupName")
        public String groupName;

        // status
        @NameInMap("Status")
        public Integer status;

        // 是否支持工单
        @NameInMap("SupportCase")
        public Boolean supportCase;

        // 是否支持热线
        @NameInMap("SupportPhone")
        public Boolean supportPhone;

        // 是否支持在线
        @NameInMap("SupportIm")
        public Boolean supportIm;

        public static QueryServicerByPageResponseBodyDataResultsGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByPageResponseBodyDataResultsGroups self = new QueryServicerByPageResponseBodyDataResultsGroups();
            return TeaModel.build(map, self);
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setSkillType(Integer skillType) {
            this.skillType = skillType;
            return this;
        }
        public Integer getSkillType() {
            return this.skillType;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setSupportCase(Boolean supportCase) {
            this.supportCase = supportCase;
            return this;
        }
        public Boolean getSupportCase() {
            return this.supportCase;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setSupportPhone(Boolean supportPhone) {
            this.supportPhone = supportPhone;
            return this;
        }
        public Boolean getSupportPhone() {
            return this.supportPhone;
        }

        public QueryServicerByPageResponseBodyDataResultsGroups setSupportIm(Boolean supportIm) {
            this.supportIm = supportIm;
            return this;
        }
        public Boolean getSupportIm() {
            return this.supportIm;
        }

    }

    public static class QueryServicerByPageResponseBodyDataResults extends TeaModel {
        // servicerId
        @NameInMap("ServicerId")
        public Long servicerId;

        // servicerType
        @NameInMap("ServicerType")
        public Integer servicerType;

        // userStatus
        @NameInMap("UserStatus")
        public Integer userStatus;

        // userType
        @NameInMap("UserType")
        public Integer userType;

        // 部门id
        @NameInMap("DepartmentId")
        public Long departmentId;

        // 租户id
        @NameInMap("BuId")
        public Long buId;

        // 真实姓名
        @NameInMap("RealName")
        public String realName;

        // 对外展示名
        @NameInMap("ShowName")
        public String showName;

        // 技能组信息
        @NameInMap("Groups")
        public java.util.List<QueryServicerByPageResponseBodyDataResultsGroups> groups;

        public static QueryServicerByPageResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByPageResponseBodyDataResults self = new QueryServicerByPageResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryServicerByPageResponseBodyDataResults setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryServicerByPageResponseBodyDataResults setServicerType(Integer servicerType) {
            this.servicerType = servicerType;
            return this;
        }
        public Integer getServicerType() {
            return this.servicerType;
        }

        public QueryServicerByPageResponseBodyDataResults setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

        public QueryServicerByPageResponseBodyDataResults setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public QueryServicerByPageResponseBodyDataResults setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryServicerByPageResponseBodyDataResults setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryServicerByPageResponseBodyDataResults setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryServicerByPageResponseBodyDataResults setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryServicerByPageResponseBodyDataResults setGroups(java.util.List<QueryServicerByPageResponseBodyDataResultsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<QueryServicerByPageResponseBodyDataResultsGroups> getGroups() {
            return this.groups;
        }

    }

    public static class QueryServicerByPageResponseBodyData extends TeaModel {
        // 数据总量
        @NameInMap("Total")
        public Integer total;

        // 页面大小
        @NameInMap("Count")
        public Integer count;

        // 总页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 数据
        @NameInMap("Results")
        public java.util.List<QueryServicerByPageResponseBodyDataResults> results;

        // 页码
        @NameInMap("Page")
        public Long page;

        public static QueryServicerByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByPageResponseBodyData self = new QueryServicerByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryServicerByPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryServicerByPageResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryServicerByPageResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryServicerByPageResponseBodyData setResults(java.util.List<QueryServicerByPageResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryServicerByPageResponseBodyDataResults> getResults() {
            return this.results;
        }

        public QueryServicerByPageResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

    }

}
