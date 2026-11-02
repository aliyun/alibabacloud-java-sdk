// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp91gnw0p***</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The order ID. You can obtain the order ID from &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/order/list?pageIndex=1&pageSize=20">Orders</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list?pageIndex=1&pageSize=20&spm=5176.12818093.top-nav.ditem-ord.36f016d0OQFmJa">Order Management</a> in Alibaba Cloud Expenses and Costs.&gt;Notice: Serverless instances do not support querying by order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6072673****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can query the ID in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance edition identity. You can filter instances of different editions based on the edition number. Valid values:</p>
     * <ul>
     * <li>v2</li>
     * <li>v3</li>
     * <li>confluent</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<GetInstanceListRequestTag> tag;

    public static GetInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListRequest self = new GetInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceListRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceListRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetInstanceListRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public GetInstanceListRequest setTag(java.util.List<GetInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class GetInstanceListRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>If this parameter is left empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <ul>
         * <li><p>If the tag key is empty, this parameter must be empty. If this parameter is left empty, all tag values are matched.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListRequestTag self = new GetInstanceListRequestTag();
            return TeaModel.build(map, self);
        }

        public GetInstanceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
