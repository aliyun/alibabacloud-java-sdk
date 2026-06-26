// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentResourcePool extends TeaModel {
    /**
     * <p>The real-time allocation status of the resource pool, including the specific allocation details for each function.</p>
     */
    @NameInMap("allocationStatus")
    public ResidentResourceAllocationStatus allocationStatus;

    @NameInMap("associatedPoolId")
    public String associatedPoolId;

    /**
     * <p>The resource property field that represents the creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The expiration time of the resource pool.</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The last modification time, including operations such as scaling, renewal, and renaming.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("poolType")
    public String poolType;

    @NameInMap("residentResourcePoolId")
    public String residentResourcePoolId;

    /**
     * <p>The resource property field that represents the resource name.</p>
     */
    @NameInMap("residentResourcePoolName")
    public String residentResourcePoolName;

    /**
     * <p>The overall specifications of the resource pool.</p>
     */
    @NameInMap("resourcePoolCapacity")
    public ResidentResourceCapacity resourcePoolCapacity;

    @NameInMap("resourcePoolConfig")
    public ResidentResourceCapacity resourcePoolConfig;

    @NameInMap("timedConfig")
    public TimedPoolConfig timedConfig;

    public static ResidentResourcePool build(java.util.Map<String, ?> map) throws Exception {
        ResidentResourcePool self = new ResidentResourcePool();
        return TeaModel.build(map, self);
    }

    public ResidentResourcePool setAllocationStatus(ResidentResourceAllocationStatus allocationStatus) {
        this.allocationStatus = allocationStatus;
        return this;
    }
    public ResidentResourceAllocationStatus getAllocationStatus() {
        return this.allocationStatus;
    }

    public ResidentResourcePool setAssociatedPoolId(String associatedPoolId) {
        this.associatedPoolId = associatedPoolId;
        return this;
    }
    public String getAssociatedPoolId() {
        return this.associatedPoolId;
    }

    public ResidentResourcePool setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ResidentResourcePool setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ResidentResourcePool setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ResidentResourcePool setPoolType(String poolType) {
        this.poolType = poolType;
        return this;
    }
    public String getPoolType() {
        return this.poolType;
    }

    public ResidentResourcePool setResidentResourcePoolId(String residentResourcePoolId) {
        this.residentResourcePoolId = residentResourcePoolId;
        return this;
    }
    public String getResidentResourcePoolId() {
        return this.residentResourcePoolId;
    }

    public ResidentResourcePool setResidentResourcePoolName(String residentResourcePoolName) {
        this.residentResourcePoolName = residentResourcePoolName;
        return this;
    }
    public String getResidentResourcePoolName() {
        return this.residentResourcePoolName;
    }

    public ResidentResourcePool setResourcePoolCapacity(ResidentResourceCapacity resourcePoolCapacity) {
        this.resourcePoolCapacity = resourcePoolCapacity;
        return this;
    }
    public ResidentResourceCapacity getResourcePoolCapacity() {
        return this.resourcePoolCapacity;
    }

    public ResidentResourcePool setResourcePoolConfig(ResidentResourceCapacity resourcePoolConfig) {
        this.resourcePoolConfig = resourcePoolConfig;
        return this;
    }
    public ResidentResourceCapacity getResourcePoolConfig() {
        return this.resourcePoolConfig;
    }

    public ResidentResourcePool setTimedConfig(TimedPoolConfig timedConfig) {
        this.timedConfig = timedConfig;
        return this;
    }
    public TimedPoolConfig getTimedConfig() {
        return this.timedConfig;
    }

}
