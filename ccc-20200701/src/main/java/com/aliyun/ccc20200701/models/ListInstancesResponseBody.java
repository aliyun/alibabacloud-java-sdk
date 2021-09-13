// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class ListInstancesResponseBodyDataListAdminList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Email")
        public String email;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleId")
        public String roleId;

        public static ListInstancesResponseBodyDataListAdminList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataListAdminList self = new ListInstancesResponseBodyDataListAdminList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataListAdminList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListInstancesResponseBodyDataListAdminList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListInstancesResponseBodyDataListAdminList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListInstancesResponseBodyDataListAdminList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListInstancesResponseBodyDataListAdminList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public ListInstancesResponseBodyDataListAdminList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListInstancesResponseBodyDataListAdminList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyDataListAdminList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListInstancesResponseBodyDataListAdminList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataListAdminList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class ListInstancesResponseBodyDataListNumberList extends TeaModel {
        @NameInMap("Number")
        public String number;

        public static ListInstancesResponseBodyDataListNumberList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataListNumberList self = new ListInstancesResponseBodyDataListNumberList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataListNumberList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class ListInstancesResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("Name")
        public String name;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public String id;

        @NameInMap("AdminList")
        public java.util.List<ListInstancesResponseBodyDataListAdminList> adminList;

        @NameInMap("NumberList")
        public java.util.List<ListInstancesResponseBodyDataListNumberList> numberList;

        public static ListInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataList self = new ListInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataList setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public ListInstancesResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListInstancesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListInstancesResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesResponseBodyDataList setAdminList(java.util.List<ListInstancesResponseBodyDataListAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListAdminList> getAdminList() {
            return this.adminList;
        }

        public ListInstancesResponseBodyDataList setNumberList(java.util.List<ListInstancesResponseBodyDataListNumberList> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListNumberList> getNumberList() {
            return this.numberList;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListInstancesResponseBodyDataList> list;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListInstancesResponseBodyData setList(java.util.List<ListInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
