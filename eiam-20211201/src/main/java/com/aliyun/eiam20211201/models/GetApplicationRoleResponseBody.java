// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationRoleResponseBody extends TeaModel {
    /**
     * <p>The application role information.</p>
     */
    @NameInMap("ApplicationRole")
    public GetApplicationRoleResponseBodyApplicationRole applicationRole;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRoleResponseBody self = new GetApplicationRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationRoleResponseBody setApplicationRole(GetApplicationRoleResponseBodyApplicationRole applicationRole) {
        this.applicationRole = applicationRole;
        return this;
    }
    public GetApplicationRoleResponseBodyApplicationRole getApplicationRole() {
        return this.applicationRole;
    }

    public GetApplicationRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationRoleResponseBodyApplicationRole extends TeaModel {
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
         * <p>The application role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin Role</p>
         */
        @NameInMap("ApplicationRoleName")
        public String applicationRoleName;

        /**
         * <p>The application role value.</p>
         * 
         * <strong>example:</strong>
         * <p>admin_role</p>
         */
        @NameInMap("ApplicationRoleValue")
        public String applicationRoleValue;

        /**
         * <p>The application role description.</p>
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
         * <p>idaas_ue2jvisn35ea5lmthk267xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetApplicationRoleResponseBodyApplicationRole build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationRoleResponseBodyApplicationRole self = new GetApplicationRoleResponseBodyApplicationRole();
            return TeaModel.build(map, self);
        }

        public GetApplicationRoleResponseBodyApplicationRole setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationRoleResponseBodyApplicationRole setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

        public GetApplicationRoleResponseBodyApplicationRole setApplicationRoleName(String applicationRoleName) {
            this.applicationRoleName = applicationRoleName;
            return this;
        }
        public String getApplicationRoleName() {
            return this.applicationRoleName;
        }

        public GetApplicationRoleResponseBodyApplicationRole setApplicationRoleValue(String applicationRoleValue) {
            this.applicationRoleValue = applicationRoleValue;
            return this;
        }
        public String getApplicationRoleValue() {
            return this.applicationRoleValue;
        }

        public GetApplicationRoleResponseBodyApplicationRole setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationRoleResponseBodyApplicationRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
