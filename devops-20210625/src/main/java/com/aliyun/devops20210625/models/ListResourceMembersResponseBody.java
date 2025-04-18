// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListResourceMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceMembers")
    public java.util.List<ListResourceMembersResponseBodyResourceMembers> resourceMembers;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListResourceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceMembersResponseBody self = new ListResourceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListResourceMembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListResourceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceMembersResponseBody setResourceMembers(java.util.List<ListResourceMembersResponseBodyResourceMembers> resourceMembers) {
        this.resourceMembers = resourceMembers;
        return this;
    }
    public java.util.List<ListResourceMembersResponseBodyResourceMembers> getResourceMembers() {
        return this.resourceMembers;
    }

    public ListResourceMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceMembersResponseBodyResourceMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22212212</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("username")
        public String username;

        public static ListResourceMembersResponseBodyResourceMembers build(java.util.Map<String, ?> map) throws Exception {
            ListResourceMembersResponseBodyResourceMembers self = new ListResourceMembersResponseBodyResourceMembers();
            return TeaModel.build(map, self);
        }

        public ListResourceMembersResponseBodyResourceMembers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListResourceMembersResponseBodyResourceMembers setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListResourceMembersResponseBodyResourceMembers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
