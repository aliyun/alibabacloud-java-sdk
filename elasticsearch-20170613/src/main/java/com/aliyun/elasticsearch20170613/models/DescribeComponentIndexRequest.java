// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeComponentIndexRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeComponentIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentIndexRequest self = new DescribeComponentIndexRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentIndexRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
