// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusRequest extends TeaModel {
    @NameInMap("EventTime")
    public DescribeDisksFullStatusRequestEventTime eventTime;

    /**
     * <p>The ID of EBS device N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The ID of event N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The event type of the EBS device. Valid values:</p>
     * <br>
     * <p>*   Degraded: The performance of the EBS device is degraded.</p>
     * <p>*   SeverelyDegraded: The performance of the EBS device is severely degraded.</p>
     * <p>*   Stalled: The performance of the EBS device is severely affected.</p>
     * <p>*   ErrorDetected: The local disk is damaged.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The health status of the EBS device. Valid values:</p>
     * <br>
     * <p>*   Impaired: The EBS device is damaged.</p>
     * <p>*   Warning: The performance of the EBS device is degraded.</p>
     * <p>*   Initializing: The EBS device is being initialized.</p>
     * <p>*   InsufficientData: The status cannot be determined due to insufficient data.</p>
     * <p>*   NotApplicable: The EBS device cannot be used.</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. The value must be a positive integer.</p>
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
     * <p>The region ID of the EBS device. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the EBS device belongs. If you configure this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The lifecycle status of the EBS device. For more information, see [Disk status](https://help.aliyun.com/document_detail/25689.html). Valid values:</p>
     * <br>
     * <p>*   In_use: The EBS device is in use.</p>
     * <p>*   Available: The EBS device can be attached.</p>
     * <p>*   Attaching: The EBS device is being attached.</p>
     * <p>*   Detaching: The EBS device is being detached.</p>
     * <p>*   Creating: The EBS device is being created.</p>
     * <p>*   ReIniting: The EBS device is being initialized.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags to add to the EBS device.</p>
     */
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
        /**
         * <p>The end of the time range to query occurred events.</p>
         * <br>
         * <p>Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The beginning of the time range to query occurred events.</p>
         * <br>
         * <p>Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
         */
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
        /**
         * <p>The key of tag N to add to the EBS device. A key-value pair consists of a key specified by the Tag.N.Key parameter and a value specified by the `Tag.N.Value` parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>Up to 1,000 resources with the specified tags can be returned in the response.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the EBS device. A key-value pair consists of a key specified by the `Tag.N.Key` parameter and a value specified by the Tag.N.Value parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.</p>
         */
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
