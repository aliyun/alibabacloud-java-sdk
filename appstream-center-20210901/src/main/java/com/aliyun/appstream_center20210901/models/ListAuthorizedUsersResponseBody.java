// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate this call.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1A4F2D-713A-5C98-8AF6-1B5D0868****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of authorization records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of authorized users on the current page. An empty list is returned if no authorization records are matched.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListAuthorizedUsersResponseBodyUsers> users;

    public static ListAuthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersResponseBody self = new ListAuthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAuthorizedUsersResponseBody setUsers(java.util.List<ListAuthorizedUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListAuthorizedUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListAuthorizedUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The user account type.</p>
         * <ul>
         * <li><code>simple</code>: convenience account.</li>
         * <li><code>ad</code>: Active Directory (AD) domain account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The application ID specified in this query. This field is not returned if no application filter condition is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>app-3jm9d0abc00example</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The delivery group ID to which the authorization relationship belongs. When querying cloud browsers, this is the browser group ID. When querying by set, this field is the primary delivery group ID of the set.</p>
         * 
         * <strong>example:</strong>
         * <p>big-3jm9d0abc00example</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The delivery group set ID of this query. This field is returned when querying by set.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        @NameInMap("AppInstanceGroupSetId")
        public String appInstanceGroupSetId;

        /**
         * <p>The list of persistent session IDs authorized to the user. This field is returned when the authorization mode is <code>Session</code>.</p>
         */
        @NameInMap("AppInstancePersistentIds")
        public java.util.List<String> appInstancePersistentIds;

        /**
         * <p>The authorization mode of the delivery group. Valid values:</p>
         * <ul>
         * <li><code>App</code>: Authorization by application.</li>
         * <li><code>Session</code>: Authorization by persistent session.</li>
         * <li><code>AppInstanceGroup</code>: Authorization by delivery group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        @NameInMap("AuthMode")
        public String authMode;

        /**
         * <p>The email address of the user. This field may not be returned if the email address is not available.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The authorized username.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>Indicates whether the query is not restricted to a specific application. Valid values:</p>
         * <ul>
         * <li><code>true</code>: No application filter condition is specified.</li>
         * <li><code>false</code>: An application filter condition is specified.</li>
         * </ul>
         * <p>This field is determined by the query conditions and cannot be used alone to determine whether the user is authorized for all applications.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAuthAllApps")
        public String isAuthAllApps;

        /**
         * <p>The phone number of the user. This field may not be returned if the phone number is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        @NameInMap("Phone")
        public String phone;

        public static ListAuthorizedUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedUsersResponseBodyUsers self = new ListAuthorizedUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedUsersResponseBodyUsers setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListAuthorizedUsersResponseBodyUsers setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAuthorizedUsersResponseBodyUsers setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAuthorizedUsersResponseBodyUsers setAppInstanceGroupSetId(String appInstanceGroupSetId) {
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }
        public String getAppInstanceGroupSetId() {
            return this.appInstanceGroupSetId;
        }

        public ListAuthorizedUsersResponseBodyUsers setAppInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
            this.appInstancePersistentIds = appInstancePersistentIds;
            return this;
        }
        public java.util.List<String> getAppInstancePersistentIds() {
            return this.appInstancePersistentIds;
        }

        public ListAuthorizedUsersResponseBodyUsers setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public ListAuthorizedUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListAuthorizedUsersResponseBodyUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ListAuthorizedUsersResponseBodyUsers setIsAuthAllApps(String isAuthAllApps) {
            this.isAuthAllApps = isAuthAllApps;
            return this;
        }
        public String getIsAuthAllApps() {
            return this.isAuthAllApps;
        }

        public ListAuthorizedUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
