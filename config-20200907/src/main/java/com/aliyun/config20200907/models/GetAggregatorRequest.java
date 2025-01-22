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

    @NameInMap("Tag")
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

    public GetAggregatorRequest setTag(java.util.List<GetAggregatorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetAggregatorRequestTag> getTag() {
        return this.tag;
    }

    public static class GetAggregatorRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
