// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
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
    public ListUserGroupsResponseBodyPageResult pageResult;

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

    public static ListUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponseBody self = new ListUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGroupsResponseBody setPageResult(ListUserGroupsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListUserGroupsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserGroupsResponseBodyPageResultUserGroupListAdminList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>32313131</p>
         */
        @NameInMap("Id")
        public String id;

        public static ListUserGroupsResponseBodyPageResultUserGroupListAdminList build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyPageResultUserGroupListAdminList self = new ListUserGroupsResponseBodyPageResultUserGroupListAdminList();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyPageResultUserGroupListAdminList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupListAdminList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupListAdminList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListUserGroupsResponseBodyPageResultUserGroupList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("AdminList")
        public java.util.List<ListUserGroupsResponseBodyPageResultUserGroupListAdminList> adminList;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>31313232</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>SECURITY_ADMIN</p>
         */
        @NameInMap("MyRole")
        public String myRole;

        @NameInMap("Name")
        public String name;

        public static ListUserGroupsResponseBodyPageResultUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyPageResultUserGroupList self = new ListUserGroupsResponseBodyPageResultUserGroupList();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setAdminList(java.util.List<ListUserGroupsResponseBodyPageResultUserGroupListAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<ListUserGroupsResponseBodyPageResultUserGroupListAdminList> getAdminList() {
            return this.adminList;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setMyRole(String myRole) {
            this.myRole = myRole;
            return this;
        }
        public String getMyRole() {
            return this.myRole;
        }

        public ListUserGroupsResponseBodyPageResultUserGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUserGroupsResponseBodyPageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UserGroupList")
        public java.util.List<ListUserGroupsResponseBodyPageResultUserGroupList> userGroupList;

        public static ListUserGroupsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyPageResult self = new ListUserGroupsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUserGroupsResponseBodyPageResult setUserGroupList(java.util.List<ListUserGroupsResponseBodyPageResultUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<ListUserGroupsResponseBodyPageResultUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
