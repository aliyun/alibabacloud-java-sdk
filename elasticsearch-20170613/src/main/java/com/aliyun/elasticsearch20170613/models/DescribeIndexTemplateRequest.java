// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeIndexTemplateRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndexTemplateRequest self = new DescribeIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIndexTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
