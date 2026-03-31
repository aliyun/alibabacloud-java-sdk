// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-88ea626622af0055****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<GetAggregatorRequestTag> tag;

    public static GetAggregatorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorRequest self = new GetAggregatorRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregatorRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    @Deprecated
    public GetAggregatorRequest setTag(java.util.List<GetAggregatorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetAggregatorRequestTag> getTag() {
        return this.tag;
    }

    public static class GetAggregatorRequestTag extends TeaModel {
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
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAggregatorRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorRequestTag self = new GetAggregatorRequestTag();
            return TeaModel.build(map, self);
        }

        public GetAggregatorRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAggregatorRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
