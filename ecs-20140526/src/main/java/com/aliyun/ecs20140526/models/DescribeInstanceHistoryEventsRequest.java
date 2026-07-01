// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstanceHistoryEventsRequestNotBefore notBefore;

    /**
     * <p>The lifecycle status of the system event. EventCycleStatus takes effect only when InstanceEventCycleStatus.N is not specified. Valid values: </p>
     * <ul>
     * <li>Scheduled: The event is waiting to be executed.</li>
     * <li>Avoided: The event has been avoided.</li>
     * <li>Executing: The event is being executed.</li>
     * <li>Executed: The event has been executed.</li>
     * <li>Canceled: The event has been canceled.</li>
     * <li>Failed: The event execution failed.</li>
     * <li>Inquiring: The event is being inquired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executed</p>
     */
    @NameInMap("EventCycleStatus")
    public String eventCycleStatus;

    /**
     * <p>One or more system event IDs. Valid values of N: 1 to 100. Specify multiple values in a repeated list format.</p>
     * 
     * <strong>example:</strong>
     * <p>e-uf64yvznlao4jl2c****</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The type of the system event. EventType takes effect only when InstanceEventType.N is not specified. Valid values: </p>
     * <ul>
     * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</li>
     * <li>SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
     * <li>SystemFailure.Reboot: The instance is restarted due to a system error.</li>
     * <li>SystemFailure.Redeploy: The instance is redeployed due to a system error.</li>
     * <li>SystemFailure.Delete: The instance is released due to an instance creation failure.</li>
     * <li>InstanceFailure.Reboot: The instance is restarted due to an instance error.</li>
     * <li>InstanceExpiration.Stop: The instance is stopped due to subscription expiration.</li>
     * <li>InstanceExpiration.Delete: The instance is released due to subscription expiration.</li>
     * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about event types, see <a href="https://help.aliyun.com/document_detail/66574.html">System event overview</a>. The value of this parameter must be an instance system event, not a disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemMaintenance.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ImpactLevel")
    public String impactLevel;

    /**
     * <p>One or more lifecycle statuses of the system event. Valid values of N: 1 to 7. Specify multiple values in a repeated list format. Valid values:</p>
     * <ul>
     * <li>Scheduled: The event is waiting to be executed.</li>
     * <li>Avoided: The event has been avoided.</li>
     * <li>Executing: The event is being executed.</li>
     * <li>Executed: The event has been executed.</li>
     * <li>Canceled: The event has been canceled.</li>
     * <li>Failed: The event execution failed.</li>
     * <li>Inquiring: The event is being inquired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executed</p>
     */
    @NameInMap("InstanceEventCycleStatus")
    public java.util.List<String> instanceEventCycleStatus;

    /**
     * <p>One or more types of the system event. Valid values of N: 1 to 30. Specify multiple values in a repeated list format. Valid values:</p>
     * <ul>
     * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</li>
     * <li>SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
     * <li>SystemFailure.Reboot: The instance is restarted due to a system error.</li>
     * <li>SystemFailure.Redeploy: The instance is redeployed due to a system error.</li>
     * <li>SystemFailure.Delete: The instance is released due to an instance creation failure.</li>
     * <li>InstanceFailure.Reboot: The instance is restarted due to an instance error.</li>
     * <li>InstanceExpiration.Stop: The instance is stopped due to subscription expiration.</li>
     * <li>InstanceExpiration.Delete: The instance is released due to subscription expiration.</li>
     * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about event types, see <a href="https://help.aliyun.com/document_detail/66574.html">System event overview</a>. The value of this parameter must be an instance system event, not a disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemMaintenance.Reboot</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The instance ID. If you do not specify an instance ID, the system events of all instances in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf678mass4zvr9n1****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page for a paging query. Valid values: 10 to 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>When the settings value is greater than 0 but less than 10, the default value is 10.</li>
     * <li>When the settings value is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>f1c9fa9de5752***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. Use MaxResults or NextToken for paginated queries instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. Use MaxResults or NextToken for paginated queries instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the resource. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>One or more resource IDs. Valid values of N: 1 to 100. Specify multiple values in a repeated list format. Valid values:</p>
     * <ul>
     * <li>When <code>ResourceType=instance</code>, the resource ID is the ECS instance ID.</li>
     * <li>When <code>ResourceType=ddh</code>, the resource ID is the dedicated host ID.</li>
     * <li>When <code>ResourceType=managedhost</code>, the resource ID is the physical machine ID in an intelligent fully managed resource pool.</li>
     * </ul>
     * <p>If you do not specify this parameter, the system events of all resources of the specified resource type (<code>ResourceType</code>) in the specified region (<code>RegionId</code>) are queried.</p>
     * <blockquote>
     * <p>Use <code>ResourceId.N</code> to specify one or more resource IDs. If you specify both <code>ResourceId.N</code> and <code>InstanceId</code>, <code>ResourceId.N</code> takes precedence by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-uf678mass4zvr9n1****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>instance: ECS instance.</li>
     * <li>ddh: dedicated host.</li>
     * <li>managedhost: physical machine in an intelligent fully managed resource pool.</li>
     * </ul>
     * <p>Default value: instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags supported by system events.</p>
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

    public DescribeInstanceHistoryEventsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceHistoryEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
         * <p>The end of the time range during which the system event is published. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start of the time range during which the system event is published. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-30T06:32:31Z</p>
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
         * <p>The end of the time range during which the system event is scheduled to execute. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start of the time range during which the system event is scheduled to execute. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-30T06:32:31Z</p>
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
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
