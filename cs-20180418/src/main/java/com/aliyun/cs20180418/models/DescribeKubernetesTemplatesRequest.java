// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeKubernetesTemplatesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeKubernetesTemplatesQuery query;

    public static DescribeKubernetesTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesTemplatesRequest self = new DescribeKubernetesTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesTemplatesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKubernetesTemplatesRequest setQuery(DescribeKubernetesTemplatesQuery query) {
        this.query = query;
        return this;
    }
    public DescribeKubernetesTemplatesQuery getQuery() {
        return this.query;
    }

}
