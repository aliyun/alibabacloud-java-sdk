// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    /**
     * <p>Details about account privileges in the specified region.</p>
     */
    @NameInMap("AccountAttributeItems")
    public DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8CE45CD5-31FB-47C2-959D-CA8144CE****</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The data disk category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The expiration time of a privilege. This parameter is returned only when the account privilege has an expiration time. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T12:30:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The value of the resource quota in the specified region. Valid values:</p>
         * <p>The values returned for the resource quotas to which the following AttributeName values correspond are 0 or positive integers:</p>
         * <ul>
         * <li>max-security-groups</li>
         * <li>max-elastic-network-interfaces</li>
         * <li>max-postpaid-instance-vcpu-count</li>
         * <li>max-spot-instance-vcpu-count</li>
         * <li>used-postpaid-instance-vcpu-count</li>
         * <li>used-spot-instance-vcpu-count</li>
         * <li>max-postpaid-yundisk-capacity (the value is deprecated)</li>
         * <li>used-postpaid-yundisk-capacity (the value is deprecated)</li>
         * <li>max-dedicated-hosts</li>
         * <li>max-axt-command-count</li>
         * <li>max-axt-invocation-daily</li>
         * <li>max-cloud-assistant-activation-count</li>
         * </ul>
         * <p>When AttributeName is set to supported-postpay-instance-types, instance types are returned. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * <p>When AttributeName is set to real-name-authentications, one of the following values is returned:</p>
         * <ul>
         * <li>yes</li>
         * <li>none</li>
         * <li>unnecessary</li>
         * </ul>
         * <p>When AttributeName is set to instance-network-type, one of the following values is returned:</p>
         * <ul>
         * <li>vpc</li>
         * <li>classic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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
         * <ul>
         * <li>instance-network-type: the available network types.</li>
         * <li>max-security-groups: the maximum number of security groups.</li>
         * <li>max-elastic-network-interfaces: the maximum number of ENIs.</li>
         * <li>max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances.</li>
         * <li>max-spot-instance-vcpu-count: the maximum number of vCPUs for spot instances.</li>
         * <li>used-postpaid-instance-vcpu-count: the number of vCPUs that were allocated to pay-as-you-go instances.</li>
         * <li>used-spot-instance-vcpu-count: the number of vCPUs that were allocated to spot instances.</li>
         * <li>max-postpaid-yundisk-capacity: the maximum capacity of pay-as-you-go data disks. (The value is deprecated.)</li>
         * <li>used-postpaid-yundisk-capacity: the capacity of pay-as-you-go data disks that were created. (The value is deprecated.)</li>
         * <li>max-dedicated-hosts: the maximum number of dedicated hosts.</li>
         * <li>supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances.</li>
         * <li>max-axt-command-count: the maximum number of Cloud Assistant commands.</li>
         * <li>max-axt-invocation-daily: the maximum number of Cloud Assistant command executions per day.</li>
         * <li>real-name-authentication: whether the account completed the real-name verification.</li>
         * <li>max-cloud-assistant-activation-count: the maximum number of activation codes that can be created to use to register managed instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>max-security-groups</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The values of resource quotas.</p>
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
