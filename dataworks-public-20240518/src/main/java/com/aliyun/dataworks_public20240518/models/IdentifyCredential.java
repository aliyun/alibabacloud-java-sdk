// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class IdentifyCredential extends TeaModel {
    /**
     * <p>The data source.</p>
     */
    @NameInMap("DataSource")
    public IdentifyCredentialDataSource dataSource;

    /**
     * <p>The workspace ID (optional).</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The user ID. If it is a role, the ROLE_ prefix must be added.</p>
     * 
     * <strong>example:</strong>
     * <p>ROLE_300888674340307309</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <ul>
     * <li>Alibaba Cloud account</li>
     * <li>RAM user</li>
     * <li>Role</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>primaryAccount</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static IdentifyCredential build(java.util.Map<String, ?> map) throws Exception {
        IdentifyCredential self = new IdentifyCredential();
        return TeaModel.build(map, self);
    }

    public IdentifyCredential setDataSource(IdentifyCredentialDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public IdentifyCredentialDataSource getDataSource() {
        return this.dataSource;
    }

    public IdentifyCredential setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public IdentifyCredential setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IdentifyCredential setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public static class IdentifyCredentialDataSource extends TeaModel {
        /**
         * <p>The instance ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>710007423244</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zez82ho69yex7s7g</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The password for the data source.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The user type of the data source.</p>
         * <ul>
         * <li>Admin</li>
         * <li>RegularUser</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>RegularUser: Normal user.</li>
         * <li>Admin: Administrator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The type of the data source. Supported types:</p>
         * <ul>
         * <li>hive</li>
         * <li>lindorm_for_engine</li>
         * <li>starrocks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username for the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static IdentifyCredentialDataSource build(java.util.Map<String, ?> map) throws Exception {
            IdentifyCredentialDataSource self = new IdentifyCredentialDataSource();
            return TeaModel.build(map, self);
        }

        public IdentifyCredentialDataSource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public IdentifyCredentialDataSource setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public IdentifyCredentialDataSource setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public IdentifyCredentialDataSource setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public IdentifyCredentialDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public IdentifyCredentialDataSource setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
