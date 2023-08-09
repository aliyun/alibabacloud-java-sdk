// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateAdvancedSearchFileRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateAdvancedSearchFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateAdvancedSearchFileRequest self = new GetAggregateAdvancedSearchFileRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateAdvancedSearchFileRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
