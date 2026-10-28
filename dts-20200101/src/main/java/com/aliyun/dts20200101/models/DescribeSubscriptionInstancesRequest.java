// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client. Make sure that the value is unique across different requests. <strong>ClientToken</strong> supports only ASCII characters and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong> and no more than the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/49442.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz4us4iruleja</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the change tracking instance.</p>
     * <blockquote>
     * <p>If you specify this parameter, DTS returns the change tracking instances whose names contain the specified value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL change tracking</p>
     */
    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    /**
     * <p>The tags of the data migration instances. This parameter is used as a filter. If this parameter is specified, only instances that have the specified tags are returned.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSubscriptionInstancesRequestTag> tag;

    public static DescribeSubscriptionInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesRequest self = new DescribeSubscriptionInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeSubscriptionInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSubscriptionInstancesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSubscriptionInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSubscriptionInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSubscriptionInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSubscriptionInstancesRequest setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public DescribeSubscriptionInstancesRequest setTag(java.util.List<DescribeSubscriptionInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSubscriptionInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSubscriptionInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <ul>
         * <li>N specifies the sequence number of the tag key. For example, Tag.1.Key specifies the first tag key, and Tag.2.Key specifies the second tag key. You can specify 1 to 20 tag keys at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Empty strings are not allowed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <ul>
         * <li>N specifies the sequence number of the tag value. For example, Tag.1.Value specifies the first tag value, and Tag.2.Value specifies the second tag value. You can specify 1 to 20 tag values at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Empty strings are allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSubscriptionInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesRequestTag self = new DescribeSubscriptionInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSubscriptionInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
