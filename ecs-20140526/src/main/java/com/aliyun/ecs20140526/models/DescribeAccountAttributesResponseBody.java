// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    /**
     * <p>Details about account privileges specified by AccountAttributeItem in the specified region.</p>
     */
    @NameInMap("AccountAttributeItems")
    public DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of privilege attributes in the account.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The data disk category. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The expiration time of a privilege. This parameter is returned only when the account privilege has an expiration time. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The billing method of the instance.</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The type of the instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The value of the resource quota in the specified region. Valid values:</p>
         * <br>
         * <p>The values returned for the resource quotas to which the following AttributeName values correspond are 0 or positive integers:</p>
         * <br>
         * <p>*   max-security-groups</p>
         * <p>*   max-elastic-network-interfaces</p>
         * <p>*   max-postpaid-instance-vcpu-count</p>
         * <p>*   max-spot-instance-vcpu-count</p>
         * <p>*   used-postpaid-instance-vcpu-count</p>
         * <p>*   used-spot-instance-vcpu-count</p>
         * <p>*   max-postpaid-yundisk-capacity</p>
         * <p>*   used-postpaid-yundisk-capacity</p>
         * <p>*   max-dedicated-hosts</p>
         * <p>*   max-axt-command-count</p>
         * <p>*   max-axt-invocation-daily</p>
         * <p>*   max-cloud-assistant-activation-count</p>
         * <br>
         * <p>When the AttributeName parameter is set to supported-postpay-instance-types, an instance type is returned. For more information, see [Instance families](~~25378~~).</p>
         * <br>
         * <p>When the AttributeName parameter is set to real-name-authentications, one of the following values is returned:</p>
         * <br>
         * <p>*   yes</p>
         * <p>*   none</p>
         * <p>*   unnecessary</p>
         * <br>
         * <p>When the AttributeName parameter is set to instance-network-type, one of the following values is returned:</p>
         * <br>
         * <p>*   vpc</p>
         * <p>*   classic</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         */
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
        /**
         * <p>The type of the resource quota in the specified region. Valid values:</p>
         * <br>
         * <p>*   instance-network-type: available network types</p>
         * <p>*   max-security-groups: the maximum number of security groups</p>
         * <p>*   max-elastic-network-interfaces: the maximum number of ENIs</p>
         * <p>*   max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances</p>
         * <p>*   max-spot-instance-vcpu-count: the maximum number of vCPUs for preemptible instances</p>
         * <p>*   used-postpaid-instance-vcpu-count: the number of vCPUs that have been allocated to pay-as-you-go instances</p>
         * <p>*   used-spot-instance-vcpu-count: the number of vCPUs that have been allocated to preemptible instances</p>
         * <p>*   max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks</p>
         * <p>*   used-postpaid-yundisk-capacity: the capacity of pay-as-you-go disks that have been created</p>
         * <p>*   max-dedicated-hosts: the maximum number of dedicated hosts</p>
         * <p>*   supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances</p>
         * <p>*   max-axt-command-count: the maximum number of Cloud Assistant commands</p>
         * <p>*   max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day</p>
         * <p>*   real-name-authentication: whether the account has passed the real-name verification</p>
         * <p>*   max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The specific values of resource quotas.</p>
         */
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
