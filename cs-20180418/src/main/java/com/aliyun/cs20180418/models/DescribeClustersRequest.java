// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClustersRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DescribeClustersQuery query;

    public static DescribeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersRequest self = new DescribeClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersRequest setQuery(DescribeClustersQuery query) {
        this.query = query;
        return this;
    }
    public DescribeClustersQuery getQuery() {
        return this.query;
    }

}
