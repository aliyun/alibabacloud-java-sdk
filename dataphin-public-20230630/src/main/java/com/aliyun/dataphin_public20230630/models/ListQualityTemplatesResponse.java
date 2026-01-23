// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQualityTemplatesResponseBody body;

    public static ListQualityTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityTemplatesResponse self = new ListQualityTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualityTemplatesResponse setBody(ListQualityTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityTemplatesResponseBody getBody() {
        return this.body;
    }

}
