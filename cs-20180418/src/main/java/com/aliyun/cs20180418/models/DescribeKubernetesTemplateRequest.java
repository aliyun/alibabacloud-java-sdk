// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeKubernetesTemplateRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeKubernetesTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesTemplateRequest self = new DescribeKubernetesTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesTemplateRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
