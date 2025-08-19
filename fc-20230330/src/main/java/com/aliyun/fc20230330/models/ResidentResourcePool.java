// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentResourcePool extends TeaModel {
    /**
     * <p>资源池实时分配情况，包含每个函数的具体分配情况</p>
     */
    @NameInMap("allocationStatus")
    public ResidentResourceAllocationStatus allocationStatus;

    /**
     * <p>代表创建时间的资源属性字段</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>资源池过期时间</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>上次修改时间，包含扩容、续费、更名等操作</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("residentResourcePoolId")
    public String residentResourcePoolId;

    /**
     * <p>代表资源名称的资源属性字段</p>
     */
    @NameInMap("residentResourcePoolName")
    public String residentResourcePoolName;

    /**
     * <p>资源池总体规格</p>
     */
    @NameInMap("resourcePoolCapacity")
    public ResidentResourceCapacity resourcePoolCapacity;

    @NameInMap("resourcePoolConfig")
    public ResidentResourceCapacity resourcePoolConfig;

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

}
