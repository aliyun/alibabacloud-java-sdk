// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationRolesResponseBody extends TeaModel {
    /**
     * <p>The list of application roles.</p>
     */
    @NameInMap("ApplicationRoles")
    public java.util.List<ListApplicationRolesResponseBodyApplicationRoles> applicationRoles;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRolesResponseBody self = new ListApplicationRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationRolesResponseBody setApplicationRoles(java.util.List<ListApplicationRolesResponseBodyApplicationRoles> applicationRoles) {
        this.applicationRoles = applicationRoles;
        return this;
    }
    public java.util.List<ListApplicationRolesResponseBodyApplicationRoles> getApplicationRoles() {
        return this.applicationRoles;
    }

    public ListApplicationRolesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationRolesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationRolesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationRolesResponseBodyApplicationRoles extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approle_01kh2vuo8v9splv8maak1d22rxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        /**
         * <p>The name of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin Role</p>
         */
        @NameInMap("ApplicationRoleName")
        public String applicationRoleName;

        /**
         * <p>The value of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>admin_role</p>
         */
        @NameInMap("ApplicationRoleValue")
        public String applicationRoleValue;

        /**
         * <p>The description of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin Role Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListApplicationRolesResponseBodyApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationRolesResponseBodyApplicationRoles self = new ListApplicationRolesResponseBodyApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListApplicationRolesResponseBodyApplicationRoles setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationRolesResponseBodyApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

        public ListApplicationRolesResponseBodyApplicationRoles setApplicationRoleName(String applicationRoleName) {
            this.applicationRoleName = applicationRoleName;
            return this;
        }
        public String getApplicationRoleName() {
            return this.applicationRoleName;
        }

        public ListApplicationRolesResponseBodyApplicationRoles setApplicationRoleValue(String applicationRoleValue) {
            this.applicationRoleValue = applicationRoleValue;
            return this;
        }
        public String getApplicationRoleValue() {
            return this.applicationRoleValue;
        }

        public ListApplicationRolesResponseBodyApplicationRoles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationRolesResponseBodyApplicationRoles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
