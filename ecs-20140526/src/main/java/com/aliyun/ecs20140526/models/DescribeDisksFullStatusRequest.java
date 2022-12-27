// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusRequest extends TeaModel {
    @NameInMap("EventTime")
    public DescribeDisksFullStatusRequestEventTime eventTime;

    // The IDs of EBS devices. You can specify up to 100 EBS device IDs.
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    // The list of event IDs.
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    // The event type. Valid values:
    // 
    // *   Degraded: The performance of the EBS device is degraded.
    // *   SeverelyDegraded: The performance of the EBS device was severely degraded.
    // *   Stalled: The performance of the EBS device is severely affected.
    // *   ErrorDetected: The local disk is damaged.
    @NameInMap("EventType")
    public String eventType;

    // The health status of the EBS device. Valid values:
    // 
    // *   Impaired: The EBS device is damaged.
    // *   Warning: The performance of the EBS device may be degraded.
    // *   Initializing: The EBS device is being initialized.
    // *   InsufficientData: The status cannot be determined due to insufficient data.
    // *   NotApplicable: The EBS device cannot be used.
    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. The value must be a positive integer.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: 1 to 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the EBS device. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which the EBS device belongs. When this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The lifecycle status of the EBS device. For more information, see [Disk status](~~25689~~). Valid values:
    // 
    // *   In_use
    // *   Available
    // *   Attaching
    // *   Detaching
    // *   Creating
    // *   ReIniting
    @NameInMap("Status")
    public String status;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeDisksFullStatusRequestTag> tag;

    public static DescribeDisksFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusRequest self = new DescribeDisksFullStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusRequest setEventTime(DescribeDisksFullStatusRequestEventTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public DescribeDisksFullStatusRequestEventTime getEventTime() {
        return this.eventTime;
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

    public DescribeDisksFullStatusRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDisksFullStatusRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeDisksFullStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDisksFullStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeDisksFullStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDisksFullStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeDisksFullStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDisksFullStatusRequest setTag(java.util.List<DescribeDisksFullStatusRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDisksFullStatusRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDisksFullStatusRequestEventTime extends TeaModel {
        // The end of the time range in which to query occurred events.
        // 
        // The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be displayed in UTC.
        @NameInMap("End")
        public String end;

        // The start of the time range in which to query occurred events.
        // 
        // The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be displayed in UTC.
        @NameInMap("Start")
        public String start;

        public static DescribeDisksFullStatusRequestEventTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusRequestEventTime self = new DescribeDisksFullStatusRequestEventTime();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusRequestEventTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeDisksFullStatusRequestEventTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeDisksFullStatusRequestTag extends TeaModel {
        // The key of tag N added to the EBS device. A key-value pair consists of a key specified by the `Tag.N.Key` parameter and a value specified by the `Tag.N.Value` parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response.
        @NameInMap("Key")
        public String key;

        // The value of tag N added to the EBS device. A key-value pair consists of a key specified by the `Tag.N.Key` parameter and a value specified by the `Tag.N.Value` parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.
        @NameInMap("Value")
        public String value;

        public static DescribeDisksFullStatusRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusRequestTag self = new DescribeDisksFullStatusRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDisksFullStatusRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
