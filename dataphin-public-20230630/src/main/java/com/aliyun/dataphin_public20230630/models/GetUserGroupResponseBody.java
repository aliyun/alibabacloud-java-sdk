// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
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

    /**
     * <p>The user group details.</p>
     */
    @NameInMap("UserGroupInfo")
    public GetUserGroupResponseBodyUserGroupInfo userGroupInfo;

    public static GetUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupResponseBody self = new GetUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserGroupResponseBody setUserGroupInfo(GetUserGroupResponseBodyUserGroupInfo userGroupInfo) {
        this.userGroupInfo = userGroupInfo;
        return this;
    }
    public GetUserGroupResponseBodyUserGroupInfo getUserGroupInfo() {
        return this.userGroupInfo;
    }

    public static class GetUserGroupResponseBodyUserGroupInfoAdminList extends TeaModel {
        /**
         * <p>The account name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>131313</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetUserGroupResponseBodyUserGroupInfoAdminList build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroupInfoAdminList self = new GetUserGroupResponseBodyUserGroupInfoAdminList();
            return TeaModel.build(map, self);
        }

        public GetUserGroupResponseBodyUserGroupInfoAdminList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetUserGroupResponseBodyUserGroupInfoAdminList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserGroupResponseBodyUserGroupInfoAdminList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetUserGroupResponseBodyUserGroupInfo extends TeaModel {
        /**
         * <p>Indicates whether the user group is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The administrators of the user group.</p>
         */
        @NameInMap("AdminList")
        public java.util.List<GetUserGroupResponseBodyUserGroupInfoAdminList> adminList;

        /**
         * <p>The description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1313213</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The role of the current user in the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MyRole")
        public String myRole;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetUserGroupResponseBodyUserGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroupInfo self = new GetUserGroupResponseBodyUserGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetUserGroupResponseBodyUserGroupInfo setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetUserGroupResponseBodyUserGroupInfo setAdminList(java.util.List<GetUserGroupResponseBodyUserGroupInfoAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<GetUserGroupResponseBodyUserGroupInfoAdminList> getAdminList() {
            return this.adminList;
        }

        public GetUserGroupResponseBodyUserGroupInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserGroupResponseBodyUserGroupInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserGroupResponseBodyUserGroupInfo setMyRole(String myRole) {
            this.myRole = myRole;
            return this;
        }
        public String getMyRole() {
            return this.myRole;
        }

        public GetUserGroupResponseBodyUserGroupInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
