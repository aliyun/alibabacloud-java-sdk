// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataIngestionTemplatesResponseBody body;

    public static ListDataIngestionTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionTemplatesResponse self = new ListDataIngestionTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataIngestionTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataIngestionTemplatesResponse setBody(ListDataIngestionTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataIngestionTemplatesResponseBody getBody() {
        return this.body;
    }

}
