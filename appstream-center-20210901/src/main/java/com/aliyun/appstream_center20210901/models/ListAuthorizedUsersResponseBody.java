// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersResponseBody extends TeaModel {
    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page, which is the same as the PageSize request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1A4F2D-713A-5C98-8AF6-1B5D0868****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that meet the query conditions. This parameter is used to determine whether to continue pagination.</p>
     * <ul>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, this value is the number of authorization records. If the same user has multiple authorization records, the user is counted multiple times. Therefore, this value may be greater than the actual number of users.</li>
     * <li>When the authorization mode is <code>Session</code>, this value is the number of deduplicated users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of authorized users on the current page. Multiple authorization records for the same user are merged into one item in the response. If no authorized users meet the conditions, an empty list is returned.</p>
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
         * <p>The account type of the user. Valid values:</p>
         * <ul>
         * <li>simple: convenience account</li>
         * <li>ad: AD domain account from an enterprise AD domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The application ID. This parameter is returned only when AppId is specified in the request, and the value is the same as the request parameter. This parameter is not returned if AppId is not specified or when querying by app instance group set.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The app instance group ID of the authorization relationship to which the user belongs. When querying by app instance group, this value is the same as the request parameter. When querying by app instance group set, this value is the primary app instance group ID of the set.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The app instance group set ID. This parameter is returned only when querying by app instance group set, and the value is the same as the AppInstanceGroupSetId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        @NameInMap("AppInstanceGroupSetId")
        public String appInstanceGroupSetId;

        /**
         * <p>The list of persistent session IDs granted to the user. This parameter is returned only when the authorization mode (AuthMode) of the app instance group is <code>Session</code>. This parameter is not affected by the filtering of the AppInstancePersistentId request parameter and always lists all persistent sessions granted to the user.</p>
         */
        @NameInMap("AppInstancePersistentIds")
        public java.util.List<String> appInstancePersistentIds;

        /**
         * <p>The authorization mode of the app instance group, which determines the return scope of this operation. Valid values:</p>
         * <ul>
         * <li>App: Application authorization. This mode authorizes the applications under the app instance group to the user and does not restrict which sessions the user can use.</li>
         * <li>Session: Session authorization. This mode authorizes the persistent sessions under the app instance group to the user and does not restrict which applications the user can use. In this case, AppInstancePersistentIds returns the persistent sessions granted to the user.</li>
         * <li>AppInstanceGroup: App instance group authorization. This mode authorizes the entire app instance group to the user, allowing the user to use any session under the app instance group to open any application.</li>
         * </ul>
         * <p>When querying by app instance group set, the authorization mode of the primary app instance group of the set is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        @NameInMap("AuthMode")
        public String authMode;

        /**
         * <p>The email address of the user. This parameter is returned only when the account information of the user can be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username. To remove authorization, you can pass this value to the UnAuthorizeUserIds parameter of the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>Specifies whether the current query is not restricted to a specific application. Valid values:</p>
         * <ul>
         * <li>true: AppId is not specified in the request, and all authorized users under the app instance group are returned.</li>
         * <li>false: AppId is specified in the request, and only the users specifically authorized for this application are returned.</li>
         * </ul>
         * <blockquote>
         * <p>This field is determined by whether the AppId request parameter is specified, and is independent of the actual scope of applications the user is authorized for. You cannot use this field to determine whether the user is authorized for all applications.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAuthAllApps")
        public String isAuthAllApps;

        /**
         * <p>The phone number of the user. This parameter is returned only when the account information of the user can be obtained.</p>
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
