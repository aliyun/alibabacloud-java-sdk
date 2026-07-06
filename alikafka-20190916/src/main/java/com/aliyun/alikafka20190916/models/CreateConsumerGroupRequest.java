// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    /**
     * <p>Group name.</p>
     * <ul>
     * <li>Reserved instance: Supports uppercase and lowercase letters, numbers, underscores (_), hyphens (-), and periods (.), limited to 3-64 characters.</li>
     * <li>Serverless instance: Can only contain letters, numbers, and special characters &quot;@._\*$#^!&amp;-&quot;, limited to 1-249 characters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-0pp1l9z8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Tag list.</p>
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
         * <li>N ranges from 1 to 20.</li>
         * <li>Cannot be empty.</li>
         * <li>Supports up to 128 characters, cannot start with aliyun or acs:, and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
         * <li>N ranges from 1 to 20.</li>
         * <li>Can be empty.</li>
         * <li>Supports up to 128 characters, cannot start with aliyun or acs:, and cannot contain <code>http://</code> or <code>https://</code>.</li>
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
