// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourceTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceTemplatesResponseBody body;

    public static ListDataSourceTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTemplatesResponse self = new ListDataSourceTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceTemplatesResponse setBody(ListDataSourceTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceTemplatesResponseBody getBody() {
        return this.body;
    }

}
