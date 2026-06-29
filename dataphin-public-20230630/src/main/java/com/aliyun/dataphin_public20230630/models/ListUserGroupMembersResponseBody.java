// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserGroupMembersResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
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
    public ListUserGroupMembersResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUserGroupMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupMembersResponseBody self = new ListUserGroupMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGroupMembersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserGroupMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGroupMembersResponseBody setPageResult(ListUserGroupMembersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListUserGroupMembersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListUserGroupMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserGroupMembersResponseBodyPageResultMemberListCreator extends TeaModel {
        /**
         * <p>The account name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>12121111</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12121111</p>
         */
        @NameInMap("Id")
        public String id;

        public static ListUserGroupMembersResponseBodyPageResultMemberListCreator build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupMembersResponseBodyPageResultMemberListCreator self = new ListUserGroupMembersResponseBodyPageResultMemberListCreator();
            return TeaModel.build(map, self);
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListCreator setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListCreator setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListUserGroupMembersResponseBodyPageResultMemberListUserInfo extends TeaModel {
        /**
         * <p>The account name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>atest</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13232</p>
         */
        @NameInMap("Id")
        public String id;

        public static ListUserGroupMembersResponseBodyPageResultMemberListUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupMembersResponseBodyPageResultMemberListUserInfo self = new ListUserGroupMembersResponseBodyPageResultMemberListUserInfo();
            return TeaModel.build(map, self);
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListUserInfo setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListUserInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberListUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListUserGroupMembersResponseBodyPageResultMemberList extends TeaModel {
        /**
         * <p>The user who added the member.</p>
         */
        @NameInMap("Creator")
        public ListUserGroupMembersResponseBodyPageResultMemberListCreator creator;

        /**
         * <p>The time when the member was added to the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The user group member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2324211</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231111</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The user group member.</p>
         */
        @NameInMap("UserInfo")
        public ListUserGroupMembersResponseBodyPageResultMemberListUserInfo userInfo;

        /**
         * <p>The role of the member in the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURITY_ADMIN</p>
         */
        @NameInMap("UserRole")
        public String userRole;

        public static ListUserGroupMembersResponseBodyPageResultMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupMembersResponseBodyPageResultMemberList self = new ListUserGroupMembersResponseBodyPageResultMemberList();
            return TeaModel.build(map, self);
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setCreator(ListUserGroupMembersResponseBodyPageResultMemberListCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListUserGroupMembersResponseBodyPageResultMemberListCreator getCreator() {
            return this.creator;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setUserInfo(ListUserGroupMembersResponseBodyPageResultMemberListUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public ListUserGroupMembersResponseBodyPageResultMemberListUserInfo getUserInfo() {
            return this.userInfo;
        }

        public ListUserGroupMembersResponseBodyPageResultMemberList setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

    public static class ListUserGroupMembersResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paged list.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<ListUserGroupMembersResponseBodyPageResultMemberList> memberList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>217</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUserGroupMembersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupMembersResponseBodyPageResult self = new ListUserGroupMembersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListUserGroupMembersResponseBodyPageResult setMemberList(java.util.List<ListUserGroupMembersResponseBodyPageResultMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<ListUserGroupMembersResponseBodyPageResultMemberList> getMemberList() {
            return this.memberList;
        }

        public ListUserGroupMembersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
