// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstancesFullStatusRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstancesFullStatusRequestNotBefore notBefore;

    /**
     * <p>The IDs of the event. You can specify up to 100 event IDs in a single request.</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The type of the system event. This parameter is valid only when the InstanceEventType.N parameter is not specified. Valid values:</p>
     * <br>
     * <p>*   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</p>
     * <p>*   SystemFailure.Reboot: The instance is restarted due to a system failure.</p>
     * <p>*   InstanceFailure.Reboot: The instance is restarted due to an instance failure.</p>
     * <p>*   InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</p>
     * <p>*   InstanceExpiration.Delete: The subscription instance is released due to expiration.</p>
     * <p>*   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</p>
     * <p>*   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The health state of the instance. Valid values:</p>
     * <br>
     * <p>*   Impaired: The instance is impaired.</p>
     * <p>*   Warning: The performance of the instance is degraded.</p>
     * <p>*   Maintaining: The instance is being maintained.</p>
     * <p>*   Initializing: The instance is being initialized.</p>
     * <p>*   InsufficientData: The state cannot be determined due to insufficient data.</p>
     * <p>*   NotApplicable: The state is not applicable.</p>
     * <br>
     * <p>All these values are case-sensitive.</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The types of system events. You can specify up to 30 event types in a single request.</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The IDs of the instances. You can specify up to 100 instance IDs in a single request.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be a positive integer.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The lifecycle state of the instance. Valid values:</p>
     * <br>
     * <p>*   Starting</p>
     * <p>*   Running</p>
     * <p>*   Stopped</p>
     */
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
        /**
         * <p>The end of the period during which system events are published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The beginning of the period during which system events are published. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
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
        /**
         * <p>The end of the period during which O\&M tasks related to scheduled system events are executed. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The beginning of the period during which O\&M tasks related to scheduled system events are executed. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
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
