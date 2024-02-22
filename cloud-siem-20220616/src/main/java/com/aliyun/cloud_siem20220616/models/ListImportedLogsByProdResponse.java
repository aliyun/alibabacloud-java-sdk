// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListImportedLogsByProdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImportedLogsByProdResponseBody body;

    public static ListImportedLogsByProdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImportedLogsByProdResponse self = new ListImportedLogsByProdResponse();
        return TeaModel.build(map, self);
    }

    public ListImportedLogsByProdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImportedLogsByProdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImportedLogsByProdResponse setBody(ListImportedLogsByProdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImportedLogsByProdResponseBody getBody() {
        return this.body;
    }

}
