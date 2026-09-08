// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
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

    public static class ListInstancesResponseBodyDataListAdminList extends TeaModel {
        /**
         * <p>The administrator\&quot;s name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试坐席</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Mailbox.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Agent logon name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The agent\&quot;s personal phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The role ID, in the format: role\@instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin@ccc-test</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>Role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

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

        public ListInstancesResponseBodyDataListAdminList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListInstancesResponseBodyDataListAdminList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListInstancesResponseBodyDataListAdminList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataListAdminList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListInstancesResponseBodyDataListAdminList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListInstancesResponseBodyDataListAdminList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListInstancesResponseBodyDataListAdminList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListInstancesResponseBodyDataListAdminList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyDataListAdminList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ListInstancesResponseBodyDataListNumberList extends TeaModel {
        /**
         * <p>The number.</p>
         * 
         * <strong>example:</strong>
         * <p>0830011****</p>
         */
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
        /**
         * <p>Administrator list.</p>
         */
        @NameInMap("AdminList")
        public java.util.List<ListInstancesResponseBodyDataListAdminList> adminList;

        /**
         * <p>The Alibaba Cloud account ID to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>157123456789****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The URL of the Cloud Contact Center instance, used to access the homepage of the Cloud Call Center instance. It is composed of the specific Cloud Call Center URL followed by the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2.aliyun.com/#/workbench/ccc-test">https://ccc-v2.aliyun.com/#/workbench/ccc-test</a></p>
         */
        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        /**
         * <p>The creation time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1624679747000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试实例。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name of the instance, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试实例</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of numbers.</p>
         */
        @NameInMap("NumberList")
        public java.util.List<ListInstancesResponseBodyDataListNumberList> numberList;

        /**
         * <p>Instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataList self = new ListInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataList setAdminList(java.util.List<ListInstancesResponseBodyDataListAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListAdminList> getAdminList() {
            return this.adminList;
        }

        public ListInstancesResponseBodyDataList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListInstancesResponseBodyDataList setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public ListInstancesResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public ListInstancesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyDataList setNumberList(java.util.List<ListInstancesResponseBodyDataListNumberList> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataListNumberList> getNumberList() {
            return this.numberList;
        }

        public ListInstancesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>List.</p>
         */
        @NameInMap("List")
        public java.util.List<ListInstancesResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setList(java.util.List<ListInstancesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataList> getList() {
            return this.list;
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

    }

}
