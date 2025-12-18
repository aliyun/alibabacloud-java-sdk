// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-7f00626622af0041****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a> operation to obtain the rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-7f7d626622af0041****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<GetAggregateConfigRuleRequestTag> tag;

    public static GetAggregateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleRequest self = new GetAggregateConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    @Deprecated
    public GetAggregateConfigRuleRequest setTag(java.util.List<GetAggregateConfigRuleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetAggregateConfigRuleRequestTag> getTag() {
        return this.tag;
    }

    public static class GetAggregateConfigRuleRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys.</p>
         * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs</code>:. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAggregateConfigRuleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleRequestTag self = new GetAggregateConfigRuleRequestTag();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAggregateConfigRuleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
