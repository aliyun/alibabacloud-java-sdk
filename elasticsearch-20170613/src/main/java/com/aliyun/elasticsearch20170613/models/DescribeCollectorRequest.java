// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeCollectorRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollectorRequest self = new DescribeCollectorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCollectorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
