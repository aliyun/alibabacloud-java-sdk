// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceByTagsResponseBody body;

    public static QueryDeviceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByTagsResponse self = new QueryDeviceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceByTagsResponse setBody(QueryDeviceByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceByTagsResponseBody getBody() {
        return this.body;
    }

}
