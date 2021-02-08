// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    @NameInMap("Status")
    public String status;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("EventTime")
    public DescribeDisksFullStatusRequestEventTime eventTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDisksFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusRequest self = new DescribeDisksFullStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDisksFullStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDisksFullStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDisksFullStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDisksFullStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDisksFullStatusRequest setDiskId(java.util.List<String> diskId) {
        this.diskId = diskId;
        return this;
    }
    public java.util.List<String> getDiskId() {
        return this.diskId;
    }

    public DescribeDisksFullStatusRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

    public DescribeDisksFullStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDisksFullStatusRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeDisksFullStatusRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDisksFullStatusRequest setEventTime(DescribeDisksFullStatusRequestEventTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public DescribeDisksFullStatusRequestEventTime getEventTime() {
        return this.eventTime;
    }

    public DescribeDisksFullStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksFullStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeDisksFullStatusRequestEventTime extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeDisksFullStatusRequestEventTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusRequestEventTime self = new DescribeDisksFullStatusRequestEventTime();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusRequestEventTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DescribeDisksFullStatusRequestEventTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

    }

}
