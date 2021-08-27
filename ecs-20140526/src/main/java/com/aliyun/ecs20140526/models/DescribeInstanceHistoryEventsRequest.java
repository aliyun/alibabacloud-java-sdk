// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("NotBefore")
    public DescribeInstanceHistoryEventsRequestNotBefore notBefore;

    @NameInMap("EventPublishTime")
    public DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

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

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EventCycleStatus")
    public String eventCycleStatus;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("ImpactLevel")
    public String impactLevel;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    @NameInMap("InstanceEventCycleStatus")
    public java.util.List<String> instanceEventCycleStatus;

    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<DescribeInstanceHistoryEventsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsRequest self = new DescribeInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHistoryEventsRequest setNotBefore(DescribeInstanceHistoryEventsRequestNotBefore notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public DescribeInstanceHistoryEventsRequestNotBefore getNotBefore() {
        return this.notBefore;
    }

    public DescribeInstanceHistoryEventsRequest setEventPublishTime(DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime) {
        this.eventPublishTime = eventPublishTime;
        return this;
    }
    public DescribeInstanceHistoryEventsRequestEventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    public DescribeInstanceHistoryEventsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeInstanceHistoryEventsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceHistoryEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceHistoryEventsRequest setEventCycleStatus(String eventCycleStatus) {
        this.eventCycleStatus = eventCycleStatus;
        return this;
    }
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
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

    public DescribeInstanceHistoryEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeInstanceHistoryEventsRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
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

    public DescribeInstanceHistoryEventsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeInstanceHistoryEventsRequest setTag(java.util.List<DescribeInstanceHistoryEventsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstanceHistoryEventsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeInstanceHistoryEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class DescribeInstanceHistoryEventsRequestNotBefore extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstanceHistoryEventsRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestNotBefore self = new DescribeInstanceHistoryEventsRequestNotBefore();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsRequestNotBefore setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DescribeInstanceHistoryEventsRequestNotBefore setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

    }

    public static class DescribeInstanceHistoryEventsRequestEventPublishTime extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstanceHistoryEventsRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestEventPublishTime self = new DescribeInstanceHistoryEventsRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsRequestEventPublishTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DescribeInstanceHistoryEventsRequestEventPublishTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

    }

    public static class DescribeInstanceHistoryEventsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
