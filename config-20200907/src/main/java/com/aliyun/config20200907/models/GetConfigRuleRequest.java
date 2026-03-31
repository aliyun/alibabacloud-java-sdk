// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
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
    public java.util.List<GetConfigRuleRequestTag> tag;

    public static GetConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleRequest self = new GetConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    @Deprecated
    public GetConfigRuleRequest setTag(java.util.List<GetConfigRuleRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetConfigRuleRequestTag> getTag() {
        return this.tag;
    }

    public static class GetConfigRuleRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConfigRuleRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleRequestTag self = new GetConfigRuleRequestTag();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConfigRuleRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
