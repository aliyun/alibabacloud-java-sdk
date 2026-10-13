// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultTablePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaProfilingResultTablePageResponseBody body;

    public static ListMetaProfilingResultTablePageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultTablePageResponse self = new ListMetaProfilingResultTablePageResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultTablePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaProfilingResultTablePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaProfilingResultTablePageResponse setBody(ListMetaProfilingResultTablePageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaProfilingResultTablePageResponseBody getBody() {
        return this.body;
    }

}
