// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultCatalogPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaProfilingResultCatalogPageResponseBody body;

    public static ListMetaProfilingResultCatalogPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultCatalogPageResponse self = new ListMetaProfilingResultCatalogPageResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultCatalogPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaProfilingResultCatalogPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaProfilingResultCatalogPageResponse setBody(ListMetaProfilingResultCatalogPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaProfilingResultCatalogPageResponseBody getBody() {
        return this.body;
    }

}
