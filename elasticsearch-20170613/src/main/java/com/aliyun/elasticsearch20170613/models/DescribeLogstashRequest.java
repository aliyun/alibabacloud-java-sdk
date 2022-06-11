// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeLogstashRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstashRequest self = new DescribeLogstashRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogstashRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
