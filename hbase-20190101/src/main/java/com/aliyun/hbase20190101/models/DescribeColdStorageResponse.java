// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeColdStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeColdStorageResponseBody body;

    public static DescribeColdStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageResponse self = new DescribeColdStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColdStorageResponse setBody(DescribeColdStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColdStorageResponseBody getBody() {
        return this.body;
    }

}
