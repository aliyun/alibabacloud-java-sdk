// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTenantMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListTenantMembersResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTenantMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantMembersResponseBody self = new ListTenantMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantMembersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTenantMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantMembersResponseBody setPageResult(ListTenantMembersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListTenantMembersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListTenantMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTenantMembersResponseBodyPageResultUserListUserGroupList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>121313</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListTenantMembersResponseBodyPageResultUserListUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListTenantMembersResponseBodyPageResultUserListUserGroupList self = new ListTenantMembersResponseBodyPageResultUserListUserGroupList();
            return TeaModel.build(map, self);
        }

        public ListTenantMembersResponseBodyPageResultUserListUserGroupList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListTenantMembersResponseBodyPageResultUserListUserGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTenantMembersResponseBodyPageResultUserListUserGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTenantMembersResponseBodyPageResultUserListUserGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTenantMembersResponseBodyPageResultUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>dd123123</p>
         */
        @NameInMap("DingNumber")
        public String dingNumber;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayNameWithoutStatus")
        public String displayNameWithoutStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWhiteIp")
        public String enableWhiteIp;

        /**
         * <strong>example:</strong>
         * <p>1730000000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1730000000000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>132321</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@aliyun.com">123@aliyun.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <strong>example:</strong>
         * <p>13888888888</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("RoleList")
        public java.util.List<String> roleList;

        /**
         * <strong>example:</strong>
         * <p>213213232422222</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("UserGroupList")
        public java.util.List<ListTenantMembersResponseBodyPageResultUserListUserGroupList> userGroupList;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("WhiteIp")
        public String whiteIp;

        public static ListTenantMembersResponseBodyPageResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListTenantMembersResponseBodyPageResultUserList self = new ListTenantMembersResponseBodyPageResultUserList();
            return TeaModel.build(map, self);
        }

        public ListTenantMembersResponseBodyPageResultUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListTenantMembersResponseBodyPageResultUserList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public ListTenantMembersResponseBodyPageResultUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListTenantMembersResponseBodyPageResultUserList setDisplayNameWithoutStatus(String displayNameWithoutStatus) {
            this.displayNameWithoutStatus = displayNameWithoutStatus;
            return this;
        }
        public String getDisplayNameWithoutStatus() {
            return this.displayNameWithoutStatus;
        }

        public ListTenantMembersResponseBodyPageResultUserList setEnableWhiteIp(String enableWhiteIp) {
            this.enableWhiteIp = enableWhiteIp;
            return this;
        }
        public String getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        public ListTenantMembersResponseBodyPageResultUserList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTenantMembersResponseBodyPageResultUserList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTenantMembersResponseBodyPageResultUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTenantMembersResponseBodyPageResultUserList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public ListTenantMembersResponseBodyPageResultUserList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListTenantMembersResponseBodyPageResultUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTenantMembersResponseBodyPageResultUserList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListTenantMembersResponseBodyPageResultUserList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListTenantMembersResponseBodyPageResultUserList setRoleList(java.util.List<String> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<String> getRoleList() {
            return this.roleList;
        }

        public ListTenantMembersResponseBodyPageResultUserList setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListTenantMembersResponseBodyPageResultUserList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListTenantMembersResponseBodyPageResultUserList setUserGroupList(java.util.List<ListTenantMembersResponseBodyPageResultUserListUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<ListTenantMembersResponseBodyPageResultUserListUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

        public ListTenantMembersResponseBodyPageResultUserList setWhiteIp(String whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public String getWhiteIp() {
            return this.whiteIp;
        }

    }

    public static class ListTenantMembersResponseBodyPageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UserList")
        public java.util.List<ListTenantMembersResponseBodyPageResultUserList> userList;

        public static ListTenantMembersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListTenantMembersResponseBodyPageResult self = new ListTenantMembersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListTenantMembersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListTenantMembersResponseBodyPageResult setUserList(java.util.List<ListTenantMembersResponseBodyPageResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListTenantMembersResponseBodyPageResultUserList> getUserList() {
            return this.userList;
        }

    }

}
