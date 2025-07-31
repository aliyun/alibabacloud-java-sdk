// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityScansResponseBody body;

    public static ListDataQualityScansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScansResponse self = new ListDataQualityScansResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityScansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityScansResponse setBody(ListDataQualityScansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityScansResponseBody getBody() {
        return this.body;
    }

}
