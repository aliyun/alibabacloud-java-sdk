// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryEndUserHistoryUsageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of users that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of user usage duration entries on the current page.</p>
     */
    @NameInMap("UserUsageInfoList")
    public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoList> userUsageInfoList;

    public static QueryEndUserHistoryUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEndUserHistoryUsageResponseBody self = new QueryEndUserHistoryUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEndUserHistoryUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEndUserHistoryUsageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryEndUserHistoryUsageResponseBody setUserUsageInfoList(java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoList> userUsageInfoList) {
        this.userUsageInfoList = userUsageInfoList;
        return this;
    }
    public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoList> getUserUsageInfoList() {
        return this.userUsageInfoList;
    }

    public static class QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList extends TeaModel {
        /**
         * <p>The desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-abc123</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The desktop name.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoDesktop</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The usage duration of the user on the desktop, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList build(java.util.Map<String, ?> map) throws Exception {
            QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList self = new QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList();
            return TeaModel.build(map, self);
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList extends TeaModel {
        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12345678</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default user group</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList self = new QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList();
            return TeaModel.build(map, self);
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class QueryEndUserHistoryUsageResponseBodyUserUsageInfoList extends TeaModel {
        /**
         * <p>The remarks of the user. This parameter has a value only for convenience account users.</p>
         * 
         * <strong>example:</strong>
         * <p>Test user</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of usage duration details for each desktop.</p>
         */
        @NameInMap("DesktopUsageList")
        public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList> desktopUsageList;

        /**
         * <p>The display name of the user. For convenience account users, this is the actual nickname. For AD users, this is the display name.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The total usage duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The username. For convenience account users, this is the nickname. For AD users, this is the UserPrincipalName.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("EndUserName")
        public String endUserName;

        /**
         * <p>The list of organization paths. For convenience account users, this contains multiple organization paths. For AD users, this is the organizational unit (OU) path.</p>
         */
        @NameInMap("OrgPathList")
        public java.util.List<String> orgPathList;

        /**
         * <p>The list of user groups. This parameter has a value only for convenience account users.</p>
         */
        @NameInMap("UserGroupList")
        public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList> userGroupList;

        public static QueryEndUserHistoryUsageResponseBodyUserUsageInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryEndUserHistoryUsageResponseBodyUserUsageInfoList self = new QueryEndUserHistoryUsageResponseBodyUserUsageInfoList();
            return TeaModel.build(map, self);
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setDesktopUsageList(java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList> desktopUsageList) {
            this.desktopUsageList = desktopUsageList;
            return this;
        }
        public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListDesktopUsageList> getDesktopUsageList() {
            return this.desktopUsageList;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setEndUserName(String endUserName) {
            this.endUserName = endUserName;
            return this;
        }
        public String getEndUserName() {
            return this.endUserName;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setOrgPathList(java.util.List<String> orgPathList) {
            this.orgPathList = orgPathList;
            return this;
        }
        public java.util.List<String> getOrgPathList() {
            return this.orgPathList;
        }

        public QueryEndUserHistoryUsageResponseBodyUserUsageInfoList setUserGroupList(java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryEndUserHistoryUsageResponseBodyUserUsageInfoListUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
