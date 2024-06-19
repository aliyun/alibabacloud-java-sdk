// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-uf6fonnghi50v6nq****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The name of the container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>Specifies whether to query the logs of the previous container if the container exits and restarts. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LastTime")
    public Boolean lastTime;

    /**
     * <p>The limit on the total size of logs. Unit: bytes. Valid values: 1 to 1048576(1 MB).</p>
     * 
     * <strong>example:</strong>
     * <p>123798</p>
     */
    @NameInMap("LimitBytes")
    public Long limitBytes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A relative time in seconds before the current time from which to show logs. Examples: 10, 20, and 30.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SinceSeconds")
    public Integer sinceSeconds;

    /**
     * <p>The beginning of the time range to query. Specify the time in the RFC 3339 standard. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-08-02T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The number of the most recent log entries that you want to query. Default value: 500. Maximum value: 2000.\
     * A maximum of 1 MB log data can be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Tail")
    public Integer tail;

    /**
     * <p>Specifies whether to return the timestamps of logs. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Timestamps")
    public Boolean timestamps;

    public static DescribeContainerLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogRequest self = new DescribeContainerLogRequest();
        return TeaModel.build(map, self);
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

    public DescribeContainerLogRequest setLastTime(Boolean lastTime) {
        this.lastTime = lastTime;
        return this;
    }
    public Boolean getLastTime() {
        return this.lastTime;
    }

    public DescribeContainerLogRequest setLimitBytes(Long limitBytes) {
        this.limitBytes = limitBytes;
        return this;
    }
    public Long getLimitBytes() {
        return this.limitBytes;
    }

    public DescribeContainerLogRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeContainerLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeContainerLogRequest setSinceSeconds(Integer sinceSeconds) {
        this.sinceSeconds = sinceSeconds;
        return this;
    }
    public Integer getSinceSeconds() {
        return this.sinceSeconds;
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

    public DescribeContainerLogRequest setTimestamps(Boolean timestamps) {
        this.timestamps = timestamps;
        return this;
    }
    public Boolean getTimestamps() {
        return this.timestamps;
    }

}
