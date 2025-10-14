// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationCategoriesResponseBody body;

    public static ListNormalizationCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationCategoriesResponse self = new ListNormalizationCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationCategoriesResponse setBody(ListNormalizationCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationCategoriesResponseBody getBody() {
        return this.body;
    }

}
