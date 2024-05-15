// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstanceHistoryEventsRequestNotBefore notBefore;

    /**
     * <p>The lifecycle state of the system event. This parameter takes effect only when InstanceEventCycleStatus.N is not specified. Valid values:</p>
     * <br>
     * <p>*   Scheduled</p>
     * <p>*   Avoided</p>
     * <p>*   Executing</p>
     * <p>*   Executed</p>
     * <p>*   Canceled</p>
     * <p>*   Failed</p>
     * <p>*   Inquiring</p>
     */
    @NameInMap("EventCycleStatus")
    public String eventCycleStatus;

    /**
     * <p>The ID of system event N. Valid values of N: 1 to 100. You can repeat this parameter to pass multiple values.</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The type of the system event. This parameter takes effect only when InstanceEventType.N is not specified. Valid values:</p>
     * <br>
     * <p>*   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</p>
     * <p>*   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</p>
     * <p>*   SystemFailure.Reboot: The instance is restarted due to a system error.</p>
     * <p>*   SystemFailure.Redeploy: The instance is redeployed due to a system error.</p>
     * <p>*   SystemFailure.Delete: The instance is released due to an instance creation failure.</p>
     * <p>*   InstanceFailure.Reboot: The instance is restarted due to an instance error.</p>
     * <p>*   InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</p>
     * <p>*   InstanceExpiration.Delete: The subscription instance is released due to expiration.</p>
     * <p>*   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</p>
     * <p>*   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</p>
     * <br>
     * <p>>  For more information, see [Overview](https://help.aliyun.com/document_detail/66574.html). The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>>  This parameter is not publicly available.</p>
     */
    @NameInMap("ImpactLevel")
    public String impactLevel;

    /**
     * <p>The lifecycle state of system event N. Valid values of N: 1 to 7. You can repeat this parameter to pass multiple values. Valid values:</p>
     * <br>
     * <p>*   Scheduled</p>
     * <p>*   Avoided</p>
     * <p>*   Executing</p>
     * <p>*   Executed</p>
     * <p>*   Canceled</p>
     * <p>*   Failed</p>
     * <p>*   Inquiring</p>
     */
    @NameInMap("InstanceEventCycleStatus")
    public java.util.List<String> instanceEventCycleStatus;

    /**
     * <p>The type of system event N. Valid values of N: 1 to 30. You can repeat this parameter to pass multiple values. Valid values:</p>
     * <br>
     * <p>*   SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</p>
     * <p>*   SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</p>
     * <p>*   SystemFailure.Reboot: The instance is restarted due to a system error.</p>
     * <p>*   SystemFailure.Redeploy: The instance is redeployed due to a system error.</p>
     * <p>*   SystemFailure.Delete: The instance is released due to an instance creation failure.</p>
     * <p>*   InstanceFailure.Reboot: The instance is restarted due to an instance error.</p>
     * <p>*   InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</p>
     * <p>*   InstanceExpiration.Delete: The subscription instance is released due to expiration.</p>
     * <p>*   AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</p>
     * <p>*   AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</p>
     * <br>
     * <p>>  For more information, see [Overview](https://help.aliyun.com/document_detail/66574.html). The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The ID of the instance. If this parameter is not specified, the system events of all instances in the specified region are queried.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the resource. You can call [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of resource N. Valid values of N: 1 to 100. You can repeat this parameter to pass multiple values. Valid values:</p>
     * <br>
     * <p>*   When `ResourceType` is set to instance, ResourceId.N specifies the ID of instance N.</p>
     * <p>*   When `ResourceType` is set to ddh, ResourceId.N specifies the ID of dedicated host N.</p>
     * <p>*   When `ResourceType` is set to managedhost, ResourceId.N specifies the ID of physical machine N from a smart hosting pool.</p>
     * <br>
     * <p>If this parameter is not specified, the system events of all resources of the type specified by `ResourceType` in the region specified by `RegionId` are queried.</p>
     * <br>
     * <p>>  We recommend that you use `ResourceId.N` to specify one or more resource IDs. If you specify both `ResourceId.N` and `InstanceId`, `ResourceId.N` takes precedence by default.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   instance: ECS instance</p>
     * <p>*   ddh: dedicated host</p>
     * <p>*   managehost: physical machine in a smart hosting pool</p>
     * <br>
     * <p>Default value: instance.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstanceHistoryEventsRequestTag> tag;

    public static DescribeInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsRequest self = new DescribeInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHistoryEventsRequest setEventPublishTime(DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime) {
        this.eventPublishTime = eventPublishTime;
        return this;
    }
    public DescribeInstanceHistoryEventsRequestEventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    public DescribeInstanceHistoryEventsRequest setNotBefore(DescribeInstanceHistoryEventsRequestNotBefore notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public DescribeInstanceHistoryEventsRequestNotBefore getNotBefore() {
        return this.notBefore;
    }

    public DescribeInstanceHistoryEventsRequest setEventCycleStatus(String eventCycleStatus) {
        this.eventCycleStatus = eventCycleStatus;
        return this;
    }
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    public DescribeInstanceHistoryEventsRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

    public DescribeInstanceHistoryEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeInstanceHistoryEventsRequest setImpactLevel(String impactLevel) {
        this.impactLevel = impactLevel;
        return this;
    }
    public String getImpactLevel() {
        return this.impactLevel;
    }

    public DescribeInstanceHistoryEventsRequest setInstanceEventCycleStatus(java.util.List<String> instanceEventCycleStatus) {
        this.instanceEventCycleStatus = instanceEventCycleStatus;
        return this;
    }
    public java.util.List<String> getInstanceEventCycleStatus() {
        return this.instanceEventCycleStatus;
    }

    public DescribeInstanceHistoryEventsRequest setInstanceEventType(java.util.List<String> instanceEventType) {
        this.instanceEventType = instanceEventType;
        return this;
    }
    public java.util.List<String> getInstanceEventType() {
        return this.instanceEventType;
    }

    public DescribeInstanceHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceHistoryEventsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceHistoryEventsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceHistoryEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceHistoryEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceHistoryEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceHistoryEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceHistoryEventsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeInstanceHistoryEventsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceHistoryEventsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstanceHistoryEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeInstanceHistoryEventsRequest setTag(java.util.List<DescribeInstanceHistoryEventsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstanceHistoryEventsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstanceHistoryEventsRequestEventPublishTime extends TeaModel {
        /**
         * <p>The end of the time range in which to query published system events. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The beginning of the time range in which to query published system events. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("Start")
        public String start;

        public static DescribeInstanceHistoryEventsRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestEventPublishTime self = new DescribeInstanceHistoryEventsRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsRequestEventPublishTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeInstanceHistoryEventsRequestEventPublishTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeInstanceHistoryEventsRequestNotBefore extends TeaModel {
        /**
         * <p>The latest scheduled end time for the system event. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The earliest scheduled start time for the system event. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("Start")
        public String start;

        public static DescribeInstanceHistoryEventsRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestNotBefore self = new DescribeInstanceHistoryEventsRequestNotBefore();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsRequestNotBefore setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeInstanceHistoryEventsRequestNotBefore setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeInstanceHistoryEventsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the resource.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceHistoryEventsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestTag self = new DescribeInstanceHistoryEventsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceHistoryEventsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
