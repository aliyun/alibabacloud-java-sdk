// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAttributeRequest self = new DescribeTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAttributeRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
