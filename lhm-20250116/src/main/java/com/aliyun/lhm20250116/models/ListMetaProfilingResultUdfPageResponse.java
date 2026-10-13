// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultUdfPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaProfilingResultUdfPageResponseBody body;

    public static ListMetaProfilingResultUdfPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultUdfPageResponse self = new ListMetaProfilingResultUdfPageResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultUdfPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaProfilingResultUdfPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaProfilingResultUdfPageResponse setBody(ListMetaProfilingResultUdfPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaProfilingResultUdfPageResponseBody getBody() {
        return this.body;
    }

}
