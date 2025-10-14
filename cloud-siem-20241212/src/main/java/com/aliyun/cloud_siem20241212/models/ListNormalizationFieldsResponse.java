// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationFieldsResponseBody body;

    public static ListNormalizationFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationFieldsResponse self = new ListNormalizationFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationFieldsResponse setBody(ListNormalizationFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationFieldsResponseBody getBody() {
        return this.body;
    }

}
