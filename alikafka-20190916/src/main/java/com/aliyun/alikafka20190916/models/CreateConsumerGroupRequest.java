// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The consumer group name.</p>
     * <ul>
     * <li>Reserved instances:
     * Can contain letters, digits, underscores (_), hyphens (-), and periods (.). The value must be 3 to 64 characters in length.</li>
     * <li>Serverless instances:
     * Can contain only letters, digits, and special characters &quot;@._*$#^!&amp;-&quot;. The value must be 1 to 249 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-0pp1l9z8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateConsumerGroupRequestTag> tag;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateConsumerGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConsumerGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateConsumerGroupRequest setTag(java.util.List<CreateConsumerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateConsumerGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateConsumerGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>The tag key cannot be empty.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>The tag value can be empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateConsumerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateConsumerGroupRequestTag self = new CreateConsumerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateConsumerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateConsumerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
