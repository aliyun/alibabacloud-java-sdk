// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAttributeResponse self = new DescribeTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
