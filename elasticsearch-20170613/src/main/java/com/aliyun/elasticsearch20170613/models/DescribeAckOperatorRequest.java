// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeAckOperatorRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeAckOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckOperatorRequest self = new DescribeAckOperatorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAckOperatorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
