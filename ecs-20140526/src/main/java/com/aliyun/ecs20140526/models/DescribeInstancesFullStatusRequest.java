// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstancesFullStatusRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstancesFullStatusRequestNotBefore notBefore;

    /**
     * <p>The list of event IDs. You can specify up to 100 event IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>e-bp1hygp5b04o56l0****</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The type of a system event. The EventType parameter takes effect only when InstanceEventType.N is not specified. Valid values: </p>
     * <ul>
     * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance. </li>
     * <li>SystemFailure.Reboot: The instance is restarted due to a system failure.</li>
     * <li>InstanceFailure.Reboot: The instance is restarted due to an instance failure.</li>
     * <li>InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</li>
     * <li>InstanceExpiration.Delete: The subscription instance is released due to expiration.</li>
     * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InstanceExpiration.Stop</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The health status of the instance. Valid values: </p>
     * <ul>
     * <li>Impaired: The service is impaired. </li>
     * <li>Warning: The instance performance may be degraded due to maintenance.</li>
     * <li>Maintaining: The instance is under maintenance.</li>
     * <li>Initializing: The instance is being initialized. </li>
     * <li>InsufficientData: The data is insufficient. </li>
     * <li>NotApplicable: Not applicable.</li>
     * </ul>
     * <p>The values are case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>Initializing</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The list of instance system event types. You can specify up to 30 instance event types.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceExpiration.Stop</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The list of instance IDs. You can specify up to 100 instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the results. Valid values: positive integers.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
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
     * <p>The lifecycle status of the instance. Valid values: </p>
     * <ul>
     * <li>Starting: The instance is being started.</li>
     * <li>Running: The instance is running.</li>
     * <li>Stopped: The instance is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
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
         * <p>The end of the time range during which the events are published. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start of the time range during which the events are published. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-30T00:00:00Z</p>
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
         * <p>The end of the time range during which the events are scheduled to execute. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-30T00:00:00Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start of the time range during which the events are scheduled to execute. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
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
