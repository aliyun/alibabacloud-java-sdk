// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeILMPolicyRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeILMPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeILMPolicyRequest self = new DescribeILMPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeILMPolicyRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
