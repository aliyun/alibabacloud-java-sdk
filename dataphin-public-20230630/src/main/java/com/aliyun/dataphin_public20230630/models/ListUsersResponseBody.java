// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The request error code. OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code of the backend response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListUsersResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72F479F0-EE9F-5511-85C1-3AF3B7668E25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setPageResult(ListUsersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListUsersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUsersResponseBodyPageResultUserListDeptList extends TeaModel {
        /**
         * <p>The sub-department list.</p>
         */
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        /**
         * <p>The full path of the department.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Company/R&amp;D Department</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dept-001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The department name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parent department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dept-root</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The parent department list.</p>
         */
        @NameInMap("Parents")
        public java.util.List<java.util.Map<String, ?>> parents;

        public static ListUsersResponseBodyPageResultUserListDeptList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyPageResultUserListDeptList self = new ListUsersResponseBodyPageResultUserListDeptList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyPageResultUserListDeptList setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public ListUsersResponseBodyPageResultUserListDeptList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListUsersResponseBodyPageResultUserListDeptList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseBodyPageResultUserListDeptList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseBodyPageResultUserListDeptList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListUsersResponseBodyPageResultUserListDeptList setParents(java.util.List<java.util.Map<String, ?>> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getParents() {
            return this.parents;
        }

    }

    public static class ListUsersResponseBodyPageResultUserList extends TeaModel {
        /**
         * <p>The logon name of the original account.</p>
         * 
         * <strong>example:</strong>
         * <p>example-account</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the user is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The department list.</p>
         */
        @NameInMap("DeptList")
        public java.util.List<ListUsersResponseBodyPageResultUserListDeptList> deptList;

        /**
         * <p>The DingTalk number.</p>
         * 
         * <strong>example:</strong>
         * <p>example-ding-number</p>
         */
        @NameInMap("DingNumber")
        public String dingNumber;

        /**
         * <p>The display name of the original account.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample User</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The display name of the original account without the status suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample User</p>
         */
        @NameInMap("DisplayNameWithoutStatus")
        public String displayNameWithoutStatus;

        /**
         * <p>Indicates whether the IP whitelist is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableWhiteIp")
        public Boolean enableWhiteIp;

        /**
         * <p>The Lark bot.</p>
         * 
         * <strong>example:</strong>
         * <p>example-feishu-robot</p>
         */
        @NameInMap("FeiShuRobot")
        public String feiShuRobot;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13800000000</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The user name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The nickname of the original account.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Nickname</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The user ID of the tenant owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The real name of the original account.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("RealName")
        public String realName;

        /**
         * <p>The original account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The original account type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The WeCom bot.</p>
         * 
         * <strong>example:</strong>
         * <p>example-wechat-robot</p>
         */
        @NameInMap("WeChatRobot")
        public String weChatRobot;

        /**
         * <p>The IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.1</p>
         */
        @NameInMap("WhiteIp")
        public String whiteIp;

        public static ListUsersResponseBodyPageResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyPageResultUserList self = new ListUsersResponseBodyPageResultUserList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyPageResultUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListUsersResponseBodyPageResultUserList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListUsersResponseBodyPageResultUserList setDeptList(java.util.List<ListUsersResponseBodyPageResultUserListDeptList> deptList) {
            this.deptList = deptList;
            return this;
        }
        public java.util.List<ListUsersResponseBodyPageResultUserListDeptList> getDeptList() {
            return this.deptList;
        }

        public ListUsersResponseBodyPageResultUserList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public ListUsersResponseBodyPageResultUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyPageResultUserList setDisplayNameWithoutStatus(String displayNameWithoutStatus) {
            this.displayNameWithoutStatus = displayNameWithoutStatus;
            return this;
        }
        public String getDisplayNameWithoutStatus() {
            return this.displayNameWithoutStatus;
        }

        public ListUsersResponseBodyPageResultUserList setEnableWhiteIp(Boolean enableWhiteIp) {
            this.enableWhiteIp = enableWhiteIp;
            return this;
        }
        public Boolean getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        public ListUsersResponseBodyPageResultUserList setFeiShuRobot(String feiShuRobot) {
            this.feiShuRobot = feiShuRobot;
            return this;
        }
        public String getFeiShuRobot() {
            return this.feiShuRobot;
        }

        public ListUsersResponseBodyPageResultUserList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListUsersResponseBodyPageResultUserList setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListUsersResponseBodyPageResultUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseBodyPageResultUserList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public ListUsersResponseBodyPageResultUserList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListUsersResponseBodyPageResultUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersResponseBodyPageResultUserList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListUsersResponseBodyPageResultUserList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListUsersResponseBodyPageResultUserList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListUsersResponseBodyPageResultUserList setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListUsersResponseBodyPageResultUserList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUsersResponseBodyPageResultUserList setWeChatRobot(String weChatRobot) {
            this.weChatRobot = weChatRobot;
            return this;
        }
        public String getWeChatRobot() {
            return this.weChatRobot;
        }

        public ListUsersResponseBodyPageResultUserList setWhiteIp(String whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public String getWhiteIp() {
            return this.whiteIp;
        }

    }

    public static class ListUsersResponseBodyPageResult extends TeaModel {
        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The user list.</p>
         */
        @NameInMap("UserList")
        public java.util.List<ListUsersResponseBodyPageResultUserList> userList;

        public static ListUsersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyPageResult self = new ListUsersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUsersResponseBodyPageResult setUserList(java.util.List<ListUsersResponseBodyPageResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListUsersResponseBodyPageResultUserList> getUserList() {
            return this.userList;
        }

    }

}
