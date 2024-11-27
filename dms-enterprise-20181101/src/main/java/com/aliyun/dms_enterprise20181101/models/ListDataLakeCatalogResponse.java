// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeCatalogResponseBody body;

    public static ListDataLakeCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeCatalogResponse self = new ListDataLakeCatalogResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeCatalogResponse setBody(ListDataLakeCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeCatalogResponseBody getBody() {
        return this.body;
    }

}
