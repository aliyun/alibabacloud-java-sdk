// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityTemplatesResponseBody body;

    public static ListDataQualityTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityTemplatesResponse self = new ListDataQualityTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityTemplatesResponse setBody(ListDataQualityTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityTemplatesResponseBody getBody() {
        return this.body;
    }

}
