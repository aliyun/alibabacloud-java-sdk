// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The mitigation plan edition of the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Anti-DDoS Pro and Anti-DDoS Premium (outside the Chinese mainland) Insurance edition.</li>
     * <li><strong>1</strong>: Anti-DDoS Pro and Anti-DDoS Premium (outside the Chinese mainland) Unlimited edition.</li>
     * <li><strong>2</strong>: Anti-DDoS Pro and Anti-DDoS Premium (outside the Chinese mainland) acceleration line.</li>
     * <li><strong>9</strong>: Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland) Professional Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Edition")
    public Integer edition;

    /**
     * <p>The service traffic forwarding status of the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Service traffic forwarding is stopped.</li>
     * <li><strong>1</strong>: Service traffic forwarding is normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enabled")
    public Integer enabled;

    /**
     * <p>The latest expiration time of the Anti-DDoS Pro or Anti-DDoS Premium instances to query. This means that only instances whose expiration time is earlier than the value of <strong>ExpireEndTime</strong> are queried. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640361700000</p>
     */
    @NameInMap("ExpireEndTime")
    public Long expireEndTime;

    /**
     * <p>The earliest expiration time of the Anti-DDoS Pro or Anti-DDoS Premium instances to query. This means that only instances whose expiration time is later than the value of <strong>ExpireStartTime</strong> are queried. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640361500000</p>
     */
    @NameInMap("ExpireStartTime")
    public Long expireStartTime;

    /**
     * <p>The IDs of the Anti-DDoS Pro or Anti-DDoS Premium instances to query. You can specify up to 200 Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The page number for paging.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of instances per page for paging. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The remark of the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The statuses of the Anti-DDoS Pro or Anti-DDoS Premium instances to query. You can specify up to 2 Anti-DDoS Pro or Anti-DDoS Premium instance statuses.</p>
     */
    @NameInMap("Status")
    public java.util.List<Integer> status;

    /**
     * <p>The tags attached to the Anti-DDoS Pro or Anti-DDoS Premium instances to query.</p>
     */
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
         * <p>The tag key attached to the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Maximum value of N: 200, which means you can specify up to 200 tag keys. The configuration rules are as follows:</p>
         * <ul>
         * <li>Each tag consists of a tag key (<strong>Key</strong>) and a tag value (<strong>Value</strong>), separated by a comma (,).</li>
         * <li>Tags are separated by commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>The tag key (<strong>Key</strong>) and tag value (<strong>Value</strong>) must appear in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value attached to the Anti-DDoS Pro or Anti-DDoS Premium instance to query. Maximum value of N: 200, which means you can specify up to 200 tag values. The configuration rules are as follows:</p>
         * <ul>
         * <li>Each tag consists of a tag key (<strong>Key</strong>) and a tag value (<strong>Value</strong>), separated by a comma (,).</li>
         * <li>Tags are separated by commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>The tag key (<strong>Key</strong>) and tag value (<strong>Value</strong>) must appear in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
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
