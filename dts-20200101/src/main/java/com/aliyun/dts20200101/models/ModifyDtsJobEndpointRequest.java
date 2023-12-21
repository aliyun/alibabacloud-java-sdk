// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobEndpointRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("Database")
    public String database;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    @NameInMap("EndpointIp")
    public String endpointIp;

    @NameInMap("EndpointPort")
    public String endpointPort;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("ShardPassword")
    public String shardPassword;

    @NameInMap("ShardUsername")
    public String shardUsername;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

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
