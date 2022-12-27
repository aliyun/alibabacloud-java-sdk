// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstancesFullStatusRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstancesFullStatusRequestNotBefore notBefore;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    // The type of the system event. This parameter takes effect only when the InstanceEventType.N parameter is not specified. Valid values:
    // 
    // *   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.
    // *   SystemFailure.Reboot: The instance is restarted due to a system failure.
    // *   InstanceFailure.Reboot: The instance is restarted due to an instance failure.
    // *   InstanceExpiration.Stop: The instance is stopped due to subscription expiration.
    // *   InstanceExpiration.Delete: The instance is released due to subscription expiration.
    // *   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to overdue payments.
    // *   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to overdue payments.
    @NameInMap("EventType")
    public String eventType;

    // The health status of the instance. Valid values:
    // 
    // *   Impaired: The instance is impaired.
    // *   Warning: The instance performance may be degraded due to maintenance or technical issues.
    // *   Maintaining: The instance is undergoing maintenance.
    // *   Initializing: The instance is being initialized.
    // *   InsufficientData: The status cannot be determined due to insufficient data.
    // *   NotApplicable: The parameter is not applicable.
    // 
    // All the values are case-sensitive.
    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: 1 to 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The lifecycle status of the instance. Valid values:
    // 
    // *   Starting
    // *   Running
    // *   Stopped
    @NameInMap("Status")
    public String status;

    public static DescribeInstancesFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusRequest self = new DescribeInstancesFullStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesFullStatusRequest setEventPublishTime(DescribeInstancesFullStatusRequestEventPublishTime eventPublishTime) {
        this.eventPublishTime = eventPublishTime;
        return this;
    }
    public DescribeInstancesFullStatusRequestEventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    public DescribeInstancesFullStatusRequest setNotBefore(DescribeInstancesFullStatusRequestNotBefore notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public DescribeInstancesFullStatusRequestNotBefore getNotBefore() {
        return this.notBefore;
    }

    public DescribeInstancesFullStatusRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

    public DescribeInstancesFullStatusRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeInstancesFullStatusRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeInstancesFullStatusRequest setInstanceEventType(java.util.List<String> instanceEventType) {
        this.instanceEventType = instanceEventType;
        return this;
    }
    public java.util.List<String> getInstanceEventType() {
        return this.instanceEventType;
    }

    public DescribeInstancesFullStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesFullStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstancesFullStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstancesFullStatusRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesFullStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesFullStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesFullStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstancesFullStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstancesFullStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeInstancesFullStatusRequestEventPublishTime extends TeaModel {
        // The end time of the period during which a system event is published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
        @NameInMap("End")
        public String end;

        // The start time of the period during which a system event is published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
        @NameInMap("Start")
        public String start;

        public static DescribeInstancesFullStatusRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusRequestEventPublishTime self = new DescribeInstancesFullStatusRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusRequestEventPublishTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeInstancesFullStatusRequestEventPublishTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeInstancesFullStatusRequestNotBefore extends TeaModel {
        // The end time of the scheduled event execution. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
        @NameInMap("End")
        public String end;

        // The start time of the scheduled event execution. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
        @NameInMap("Start")
        public String start;

        public static DescribeInstancesFullStatusRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusRequestNotBefore self = new DescribeInstancesFullStatusRequestNotBefore();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusRequestNotBefore setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeInstancesFullStatusRequestNotBefore setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
