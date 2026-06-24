// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeInstanceHistoryEventsRequestNotBefore notBefore;

    /**
     * <p>The lifecycle status of the system event. EventCycleStatus takes effect only when the InstanceEventCycleStatus.N parameter is not specified. Valid values: </p>
     * <ul>
     * <li>Scheduled: the event is waiting to be executed.</li>
     * <li>Avoided: the event has been avoided.</li>
     * <li>Executing: the event is being executed.</li>
     * <li>Executed: the event has been executed.</li>
     * <li>Canceled: the event has been canceled.</li>
     * <li>Failed: the event execution failed.</li>
     * <li>Inquiring: the event is being inquired.</li>
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
     * <p>The type of the system event. EventType takes effect only when the InstanceEventType.N parameter is not specified. Valid values: </p>
     * <ul>
     * <li>SystemMaintenance.Reboot: the instance is restarted due to system maintenance.</li>
     * <li>SystemMaintenance.Redeploy: the instance is redeployed due to system maintenance.</li>
     * <li>SystemFailure.Reboot: the instance is restarted due to a system error.</li>
     * <li>SystemFailure.Redeploy: the instance is redeployed due to a system error.</li>
     * <li>SystemFailure.Delete: the instance is released due to an instance creation failure.</li>
     * <li>InstanceFailure.Reboot: the instance is restarted due to an instance error.</li>
     * <li>InstanceExpiration.Stop: the instance is stopped because the subscription has expired.</li>
     * <li>InstanceExpiration.Delete: the instance is released because the subscription has expired.</li>
     * <li>AccountUnbalanced.Stop: the pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: the pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about event types, see <a href="https://help.aliyun.com/document_detail/66574.html">System event overview</a>. The value of this parameter can only be an instance system event, not a disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemMaintenance.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <blockquote>
     * <p>This parameter is not yet available for use.</p>
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
     * <li>Scheduled: the event is waiting to be executed.</li>
     * <li>Avoided: the event has been avoided.</li>
     * <li>Executing: the event is being executed.</li>
     * <li>Executed: the event has been executed.</li>
     * <li>Canceled: the event has been canceled.</li>
     * <li>Failed: the event execution failed.</li>
     * <li>Inquiring: the event is being inquired.</li>
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
     * <li>SystemMaintenance.Reboot: the instance is restarted due to system maintenance.</li>
     * <li>SystemMaintenance.Redeploy: the instance is redeployed due to system maintenance.</li>
     * <li>SystemFailure.Reboot: the instance is restarted due to a system error.</li>
     * <li>SystemFailure.Redeploy: the instance is redeployed due to a system error.</li>
     * <li>SystemFailure.Delete: the instance is released due to an instance creation failure.</li>
     * <li>InstanceFailure.Reboot: the instance is restarted due to an instance error.</li>
     * <li>InstanceExpiration.Stop: the instance is stopped because the subscription has expired.</li>
     * <li>InstanceExpiration.Delete: the instance is released because the subscription has expired.</li>
     * <li>AccountUnbalanced.Stop: the pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li>AccountUnbalanced.Delete: the pay-as-you-go instance is released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about event types, see <a href="https://help.aliyun.com/document_detail/66574.html">System event overview</a>. The value of this parameter can only be an instance system event, not a disk system event.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemMaintenance.Reboot</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The instance ID. If this parameter is not specified, the system events of all instances in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf678mass4zvr9n1****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page for paging. Valid values: 10 to 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>When the specified value is greater than 0 but less than 10, the default value is 10.</li>
     * <li>When the specified value is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
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
     * <p>This parameter will be deprecated. Use MaxResults and NextToken for pagination instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. Use MaxResults and NextToken for pagination instead.</p>
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
     * <li>When <code>ResourceType=instance</code>, the resource ID indicates the ECS instance ID.</li>
     * <li>When <code>ResourceType=ddh</code>, the resource ID indicates the dedicated host ID.</li>
     * <li>When <code>ResourceType=managedhost</code>, the resource ID indicates the physical machine ID in an intelligent fully managed resource pool.</li>
     * </ul>
     * <p>If this parameter is not specified, the system events of all resources in the specified region (<code>RegionId</code>) and of the specified resource type (<code>ResourceType</code>) are queried.</p>
     * <blockquote>
     * <p>We recommend that you use the <code>ResourceId.N</code> parameter to specify one or more resource IDs. If you specify both <code>ResourceId.N</code> and <code>InstanceId</code>, the <code>ResourceId.N</code> parameter takes precedence by default.</p>
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
         * <p>查询系统事件发布时间的结束时间。按照<a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>标准表示，并需要使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>查询系统事件发布时间的开始时间。按照<a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>标准表示，并需要使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。</p>
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
         * <p>查询系统事件计划执行时间的结束时间。按照<a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>标准表示，并需要使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>查询系统事件计划执行时间的开始时间。按照<a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>标准表示，并需要使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。</p>
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
