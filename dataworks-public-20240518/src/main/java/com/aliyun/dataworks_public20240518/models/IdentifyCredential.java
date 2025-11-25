// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class IdentifyCredential extends TeaModel {
    @NameInMap("DataSource")
    public IdentifyCredentialDataSource dataSource;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("UserId")
    public String userId;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Password")
        public String password;

        @NameInMap("Role")
        public String role;

        @NameInMap("Type")
        public String type;

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
