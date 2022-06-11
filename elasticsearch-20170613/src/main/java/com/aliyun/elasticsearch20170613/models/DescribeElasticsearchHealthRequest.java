// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeElasticsearchHealthRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeElasticsearchHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticsearchHealthRequest self = new DescribeElasticsearchHealthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticsearchHealthRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
