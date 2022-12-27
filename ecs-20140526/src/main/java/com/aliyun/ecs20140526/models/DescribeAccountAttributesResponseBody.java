// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    // Details about account privileges specified by AccountAttributeItem in the specified region.
    @NameInMap("AccountAttributeItems")
    public DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponseBody self = new DescribeAccountAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponseBody setAccountAttributeItems(DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems) {
        this.accountAttributeItems = accountAttributeItems;
        return this;
    }
    public DescribeAccountAttributesResponseBodyAccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public DescribeAccountAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem extends TeaModel {
        // The number of privilege attributes in the account.
        @NameInMap("Count")
        public Integer count;

        // The category of the data disk. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: enhanced SSD (ESSD)
        @NameInMap("DiskCategory")
        public String diskCategory;

        // The expiration time of a privilege. This parameter is returned only when the account privilege has an expiration time. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The billing method of the instance.
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        // The instance type.
        @NameInMap("InstanceType")
        public String instanceType;

        // The value of the resource quota in the specified region. Valid values:
        // 
        // The values returned for the resource quotas to which the following AttributeName values correspond are 0 or positive integers:
        // 
        // * max-security-groups
        // * max-elastic-network-interfaces
        // * max-postpaid-instance-vcpu-count
        // * max-spot-instance-vcpu-count
        // * used-postpaid-instance-vcpu-count
        // * used-spot-instance-vcpu-count
        // * max-postpaid-yundisk-capacity
        // * used-postpaid-yundisk-capacity
        // * max-dedicated-hosts
        // * max-axt-command-count
        // * max-axt-invocation-daily
        // * max-cloud-assistant-activation-count
        // 
        // When the AttributeName parameter is set to supported-postpay-instance-types, an instance type is returned. For more information, see [Instance families](~~25378~~).
        // 
        // When the AttributeName parameter is set to real-name-authentications, one of the following values is returned:
        // 
        // * yes
        // * none
        // * unnecessary
        // 
        // When the AttributeName parameter is set to instance-network-type, one of the following values is returned:
        // 
        // * vpc
        // * classic
        @NameInMap("Value")
        public String value;

        // The ID of the zone.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues setValueItem(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem) {
            this.valueItem = valueItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> getValueItem() {
            return this.valueItem;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem extends TeaModel {
        // The type of the resource quota in the specified region. Valid values:
        // 
        // * instance-network-type: available network types
        // * max-security-groups: the maximum number of security groups
        // * max-elastic-network-interfaces: the maximum number of ENIs
        // * max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances
        // * max-spot-instance-vcpu-count: the maximum number of vCPUs for preemptible instances
        // * used-postpaid-instance-vcpu-count: the number of vCPUs that have been allocated to pay-as-you-go instances
        // * used-spot-instance-vcpu-count: the number of vCPUs that have been allocated to preemptible instances
        // * max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks
        // * used-postpaid-yundisk-capacity: the capacity of pay-as-you-go disks that have been created
        // * max-dedicated-hosts: the maximum number of dedicated hosts
        // * supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances
        // * max-axt-command-count: the maximum number of Cloud Assistant commands
        // * max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day
        // * real-name-authentication: whether an account has completed real-name verification
        // * max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances
        @NameInMap("AttributeName")
        public String attributeName;

        // The specific values of resource quotas.
        @NameInMap("AttributeValues")
        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem setAttributeValues(DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues getAttributeValues() {
            return this.attributeValues;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> accountAttributeItem;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItems self = new DescribeAccountAttributesResponseBodyAccountAttributeItems();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItems setAccountAttributeItem(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> accountAttributeItem) {
            this.accountAttributeItem = accountAttributeItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

    }

}
