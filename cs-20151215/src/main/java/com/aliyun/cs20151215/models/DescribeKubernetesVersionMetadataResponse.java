// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeKubernetesVersionMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesVersionMetadataResponse self = new DescribeKubernetesVersionMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesVersionMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
