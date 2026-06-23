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
     * <p>The project ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The user UID. If the <code>UserType</code> is <code>Role</code>, you must prefix this value with <code>ROLE_</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ROLE_300888674340307309</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The user type. Supported values are:</p>
     * <ul>
     * <li><p>primary account: <code>PrimaryAccount</code></p>
     * </li>
     * <li><p>subaccount: <code>SubAccount</code></p>
     * </li>
     * <li><p>role: <code>Role</code></p>
     * </li>
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
         * <p>The data source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>710007423244</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The data source instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zez82ho69yex7s7g</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The data source password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The user role for the data source. Valid values are:</p>
         * <ul>
         * <li><p><code>Admin</code></p>
         * </li>
         * <li><p><code>RegularUser</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The data source type. Supported values are:</p>
         * <ul>
         * <li><p><code>hive</code></p>
         * </li>
         * <li><p><code>lindorm_for_engine</code></p>
         * </li>
         * <li><p><code>starrocks</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The data source user name.</p>
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
