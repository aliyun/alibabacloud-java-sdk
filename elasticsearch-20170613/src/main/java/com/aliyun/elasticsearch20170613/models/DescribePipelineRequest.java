// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribePipelineRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineRequest self = new DescribePipelineRequest();
        return TeaModel.build(map, self);
    }

    public DescribePipelineRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
