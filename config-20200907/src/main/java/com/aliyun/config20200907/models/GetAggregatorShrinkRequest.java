// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorShrinkRequest extends TeaModel {
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
    public String tagShrink;

    public static GetAggregatorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorShrinkRequest self = new GetAggregatorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregatorShrinkRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    @Deprecated
    public GetAggregatorShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
