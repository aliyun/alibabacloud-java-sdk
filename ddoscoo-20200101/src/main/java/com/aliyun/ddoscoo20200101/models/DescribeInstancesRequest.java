// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The mitigation plan of the instance to query. Valid values:</p>
     * <br>
     * <p>*   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan</p>
     * <p>*   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan</p>
     * <p>*   **2**: Anti-DDoS Premium instance of the Mainland China Acceleration (MCA) mitigation plan</p>
     * <p>*   **9**: Anti-DDoS Pro instance of the Profession mitigation plan</p>
     */
    @NameInMap("Edition")
    public Integer edition;

    /**
     * <p>The traffic forwarding status of the instance to query. Valid values:</p>
     * <br>
     * <p>*   **0**: The instance no longer forwards service traffic.</p>
     * <p>*   **1**: The instance forwards service traffic as expected.</p>
     */
    @NameInMap("Enabled")
    public Integer enabled;

    /**
     * <p>The end of the time range to query. Instances whose expiration time is earlier than the point in time are queried. This value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("ExpireEndTime")
    public Long expireEndTime;

    /**
     * <p>The beginning of the time range to query. Instances whose expiration time is later than the point in time are queried. This value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("ExpireStartTime")
    public Long expireStartTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The IP address of the instance to query.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The remarks of the instance to query. Fuzzy match is supported.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public java.util.List<Integer> status;

    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setEdition(Integer edition) {
        this.edition = edition;
        return this;
    }
    public Integer getEdition() {
        return this.edition;
    }

    public DescribeInstancesRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

    public DescribeInstancesRequest setExpireEndTime(Long expireEndTime) {
        this.expireEndTime = expireEndTime;
        return this;
    }
    public Long getExpireEndTime() {
        return this.expireEndTime;
    }

    public DescribeInstancesRequest setExpireStartTime(Long expireStartTime) {
        this.expireStartTime = expireStartTime;
        return this;
    }
    public Long getExpireStartTime() {
        return this.expireStartTime;
    }

    public DescribeInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstancesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeInstancesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setStatus(java.util.List<Integer> status) {
        this.status = status;
        return this;
    }
    public java.util.List<Integer> getStatus() {
        return this.status;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N that is added to the instance to query. The maximum value of N is 200. You can specify up to 200 tags. When you specify tags, take note of the following rules:</p>
         * <br>
         * <p>*   Each tag consists of a key (**Key**) and a value (**Value**), which are separated by a comma (,).</p>
         * <p>*   Separate multiple tags with commas (,).</p>
         * <br>
         * <p>>  The tag key (**Key**) and tag value (**Value**) must be specified in pairs.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the instance to query. The maximum value of N is 200. You can specify up to 200 tags. When you specify tags, take note of the following rules:</p>
         * <br>
         * <p>*   Each tag consists of a key (**Key**) and a value (**Value**), which are separated by a comma (,).</p>
         * <p>*   Separate multiple tags with commas (,).</p>
         * <br>
         * <p>>  The tag key (**Key**) and tag value (**Value**) must be specified in pairs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
