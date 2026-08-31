// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeClusterRequest extends TeaModel {
    /**
     * <p>The cluster configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterConfig")
    public CreateComputeClusterRequestClusterConfig clusterConfig;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateComputeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeClusterRequest self = new CreateComputeClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeClusterRequest setClusterConfig(CreateComputeClusterRequestClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public CreateComputeClusterRequestClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public CreateComputeClusterRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateComputeClusterRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateComputeClusterRequestClusterConfigClusterSafetyControl extends TeaModel {
        /**
         * <p>The control mode.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPUTE_SOURCE</p>
         */
        @NameInMap("ClusterSafetyAuthType")
        public String clusterSafetyAuthType;

        /**
         * <p>The list of whitelist user group IDs.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of whitelist user IDs.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateComputeClusterRequestClusterConfigClusterSafetyControl build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeClusterRequestClusterConfigClusterSafetyControl self = new CreateComputeClusterRequestClusterConfigClusterSafetyControl();
            return TeaModel.build(map, self);
        }

        public CreateComputeClusterRequestClusterConfigClusterSafetyControl setClusterSafetyAuthType(String clusterSafetyAuthType) {
            this.clusterSafetyAuthType = clusterSafetyAuthType;
            return this;
        }
        public String getClusterSafetyAuthType() {
            return this.clusterSafetyAuthType;
        }

        public CreateComputeClusterRequestClusterConfigClusterSafetyControl setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public CreateComputeClusterRequestClusterConfigClusterSafetyControl setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class CreateComputeClusterRequestClusterConfigConfigList extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateComputeClusterRequestClusterConfigConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeClusterRequestClusterConfigConfigList self = new CreateComputeClusterRequestClusterConfigConfigList();
            return TeaModel.build(map, self);
        }

        public CreateComputeClusterRequestClusterConfigConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateComputeClusterRequestClusterConfigConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateComputeClusterRequestClusterConfig extends TeaModel {
        /**
         * <p>The list of cluster administrator IDs.</p>
         */
        @NameInMap("ClusterAdmins")
        public java.util.List<String> clusterAdmins;

        /**
         * <p>The cluster security control configuration.</p>
         */
        @NameInMap("ClusterSafetyControl")
        public CreateComputeClusterRequestClusterConfigClusterSafetyControl clusterSafetyControl;

        /**
         * <p>The connection configuration items.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<CreateComputeClusterRequestClusterConfigConfigList> configList;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Des")
        public String des;

        /**
         * <p>The cluster name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>CDH6</p>
         */
        @NameInMap("TypeVersion")
        public String typeVersion;

        public static CreateComputeClusterRequestClusterConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeClusterRequestClusterConfig self = new CreateComputeClusterRequestClusterConfig();
            return TeaModel.build(map, self);
        }

        public CreateComputeClusterRequestClusterConfig setClusterAdmins(java.util.List<String> clusterAdmins) {
            this.clusterAdmins = clusterAdmins;
            return this;
        }
        public java.util.List<String> getClusterAdmins() {
            return this.clusterAdmins;
        }

        public CreateComputeClusterRequestClusterConfig setClusterSafetyControl(CreateComputeClusterRequestClusterConfigClusterSafetyControl clusterSafetyControl) {
            this.clusterSafetyControl = clusterSafetyControl;
            return this;
        }
        public CreateComputeClusterRequestClusterConfigClusterSafetyControl getClusterSafetyControl() {
            return this.clusterSafetyControl;
        }

        public CreateComputeClusterRequestClusterConfig setConfigList(java.util.List<CreateComputeClusterRequestClusterConfigConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<CreateComputeClusterRequestClusterConfigConfigList> getConfigList() {
            return this.configList;
        }

        public CreateComputeClusterRequestClusterConfig setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public CreateComputeClusterRequestClusterConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateComputeClusterRequestClusterConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateComputeClusterRequestClusterConfig setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

}
