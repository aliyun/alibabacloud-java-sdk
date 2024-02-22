// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceTypesResponseBody body;

    public static ListDataSourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTypesResponse self = new ListDataSourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceTypesResponse setBody(ListDataSourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceTypesResponseBody getBody() {
        return this.body;
    }

}
