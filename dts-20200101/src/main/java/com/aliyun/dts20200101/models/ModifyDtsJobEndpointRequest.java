// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobEndpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>150780020300****</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>dtsaw012y2g15q****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>m4312mab158****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>rm-bp10k50h8374w****</p>
     */
    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    /**
     * <strong>example:</strong>
     * <p>172.168.XX.XXX</p>
     */
    @NameInMap("EndpointIp")
    public String endpointIp;

    /**
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("EndpointPort")
    public String endpointPort;

    @NameInMap("EndpointRegionId")
    public String endpointRegionId;

    @NameInMap("ModifyAccount")
    public Boolean modifyAccount;

    /**
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("ShardPassword")
    public String shardPassword;

    /**
     * <strong>example:</strong>
     * <p>shard</p>
     */
    @NameInMap("ShardUsername")
    public String shardUsername;

    /**
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("Username")
    public String username;

    public static ModifyDtsJobEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobEndpointRequest self = new ModifyDtsJobEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobEndpointRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ModifyDtsJobEndpointRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ModifyDtsJobEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDtsJobEndpointRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobEndpointRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobEndpointRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModifyDtsJobEndpointRequest setEndpointInstanceId(String endpointInstanceId) {
        this.endpointInstanceId = endpointInstanceId;
        return this;
    }
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    public ModifyDtsJobEndpointRequest setEndpointInstanceType(String endpointInstanceType) {
        this.endpointInstanceType = endpointInstanceType;
        return this;
    }
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    public ModifyDtsJobEndpointRequest setEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
        return this;
    }
    public String getEndpointIp() {
        return this.endpointIp;
    }

    public ModifyDtsJobEndpointRequest setEndpointPort(String endpointPort) {
        this.endpointPort = endpointPort;
        return this;
    }
    public String getEndpointPort() {
        return this.endpointPort;
    }

    public ModifyDtsJobEndpointRequest setEndpointRegionId(String endpointRegionId) {
        this.endpointRegionId = endpointRegionId;
        return this;
    }
    public String getEndpointRegionId() {
        return this.endpointRegionId;
    }

    public ModifyDtsJobEndpointRequest setModifyAccount(Boolean modifyAccount) {
        this.modifyAccount = modifyAccount;
        return this;
    }
    public Boolean getModifyAccount() {
        return this.modifyAccount;
    }

    public ModifyDtsJobEndpointRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDtsJobEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobEndpointRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ModifyDtsJobEndpointRequest setShardPassword(String shardPassword) {
        this.shardPassword = shardPassword;
        return this;
    }
    public String getShardPassword() {
        return this.shardPassword;
    }

    public ModifyDtsJobEndpointRequest setShardUsername(String shardUsername) {
        this.shardUsername = shardUsername;
        return this;
    }
    public String getShardUsername() {
        return this.shardUsername;
    }

    public ModifyDtsJobEndpointRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifyDtsJobEndpointRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
