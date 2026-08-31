// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterConfig")
    public UpdateComputeClusterRequestClusterConfig clusterConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102311</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static UpdateComputeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeClusterRequest self = new UpdateComputeClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeClusterRequest setClusterConfig(UpdateComputeClusterRequestClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public UpdateComputeClusterRequestClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public UpdateComputeClusterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateComputeClusterRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateComputeClusterRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class UpdateComputeClusterRequestClusterConfigClusterSafetyControl extends TeaModel {
        /**
         * <p>管控模式。CREATE_COMPUTE_SOURCE：有创建计算源权限即可使用；USER_DEFINE：仅白名单用户/用户组可用</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPUTE_SOURCE</p>
         */
        @NameInMap("ClusterSafetyAuthType")
        public String clusterSafetyAuthType;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateComputeClusterRequestClusterConfigClusterSafetyControl build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeClusterRequestClusterConfigClusterSafetyControl self = new UpdateComputeClusterRequestClusterConfigClusterSafetyControl();
            return TeaModel.build(map, self);
        }

        public UpdateComputeClusterRequestClusterConfigClusterSafetyControl setClusterSafetyAuthType(String clusterSafetyAuthType) {
            this.clusterSafetyAuthType = clusterSafetyAuthType;
            return this;
        }
        public String getClusterSafetyAuthType() {
            return this.clusterSafetyAuthType;
        }

        public UpdateComputeClusterRequestClusterConfigClusterSafetyControl setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public UpdateComputeClusterRequestClusterConfigClusterSafetyControl setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class UpdateComputeClusterRequestClusterConfigConfigList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateComputeClusterRequestClusterConfigConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeClusterRequestClusterConfigConfigList self = new UpdateComputeClusterRequestClusterConfigConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateComputeClusterRequestClusterConfigConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateComputeClusterRequestClusterConfigConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateComputeClusterRequestClusterConfig extends TeaModel {
        @NameInMap("ClusterAdmins")
        public java.util.List<String> clusterAdmins;

        @NameInMap("ClusterSafetyControl")
        public UpdateComputeClusterRequestClusterConfigClusterSafetyControl clusterSafetyControl;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<UpdateComputeClusterRequestClusterConfigConfigList> configList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Des")
        public String des;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>CDH6</p>
         */
        @NameInMap("TypeVersion")
        public String typeVersion;

        public static UpdateComputeClusterRequestClusterConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeClusterRequestClusterConfig self = new UpdateComputeClusterRequestClusterConfig();
            return TeaModel.build(map, self);
        }

        public UpdateComputeClusterRequestClusterConfig setClusterAdmins(java.util.List<String> clusterAdmins) {
            this.clusterAdmins = clusterAdmins;
            return this;
        }
        public java.util.List<String> getClusterAdmins() {
            return this.clusterAdmins;
        }

        public UpdateComputeClusterRequestClusterConfig setClusterSafetyControl(UpdateComputeClusterRequestClusterConfigClusterSafetyControl clusterSafetyControl) {
            this.clusterSafetyControl = clusterSafetyControl;
            return this;
        }
        public UpdateComputeClusterRequestClusterConfigClusterSafetyControl getClusterSafetyControl() {
            return this.clusterSafetyControl;
        }

        public UpdateComputeClusterRequestClusterConfig setConfigList(java.util.List<UpdateComputeClusterRequestClusterConfigConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<UpdateComputeClusterRequestClusterConfigConfigList> getConfigList() {
            return this.configList;
        }

        public UpdateComputeClusterRequestClusterConfig setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public UpdateComputeClusterRequestClusterConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateComputeClusterRequestClusterConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateComputeClusterRequestClusterConfig setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

}
