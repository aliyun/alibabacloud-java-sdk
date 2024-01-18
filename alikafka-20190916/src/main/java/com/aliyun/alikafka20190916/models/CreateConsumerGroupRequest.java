// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The name of the consumer group.</p>
     * <br>
     * <p>*   The value can contain only letters, digits, hyphens (-), and underscores (\_), and the value must contain at least one letter or digit.</p>
     * <p>*   The value must be 3 to 128 characters in length. If the value that you specify contains more than 128 characters, the system automatically truncates the value to 128 characters.</p>
     * <p>*   After a consumer group is created, you cannot change the name of the consumer group.</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the consumer group.</p>
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
         * <p>The tag key.</p>
         * <br>
         * <p>*   You must specify this parameter.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>*   You can leave this parameter empty.</p>
         * <p>*   The tag value can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
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
