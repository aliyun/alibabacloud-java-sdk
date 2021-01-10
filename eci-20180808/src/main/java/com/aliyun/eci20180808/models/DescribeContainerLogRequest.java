// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tail")
    public Integer tail;

    @NameInMap("LastTime")
    public Boolean lastTime;

    @NameInMap("SinceSeconds")
    public Integer sinceSeconds;

    @NameInMap("LimitBytes")
    public Long limitBytes;

    @NameInMap("Timestamps")
    public Boolean timestamps;

    public static DescribeContainerLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogRequest self = new DescribeContainerLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeContainerLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeContainerLogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeContainerLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerLogRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public DescribeContainerLogRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeContainerLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeContainerLogRequest setTail(Integer tail) {
        this.tail = tail;
        return this;
    }
    public Integer getTail() {
        return this.tail;
    }

    public DescribeContainerLogRequest setLastTime(Boolean lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Boolean getLastTime() {
        return this.lastTime;
    }

    public DescribeContainerLogRequest setSinceSeconds(Integer sinceSeconds) {
        this.sinceSeconds = sinceSeconds;
        return this;
    }
    public Integer getSinceSeconds() {
        return this.sinceSeconds;
    }

    public DescribeContainerLogRequest setLimitBytes(Long limitBytes) {
        this.limitBytes = limitBytes;
        return this;
    }
    public Long getLimitBytes() {
        return this.limitBytes;
    }

    public DescribeContainerLogRequest setTimestamps(Boolean timestamps) {
        this.timestamps = timestamps;
        return this;
    }
    public Boolean getTimestamps() {
        return this.timestamps;
    }

}
