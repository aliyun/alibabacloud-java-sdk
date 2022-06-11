// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeApmRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeApmRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApmRequest self = new DescribeApmRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApmRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
