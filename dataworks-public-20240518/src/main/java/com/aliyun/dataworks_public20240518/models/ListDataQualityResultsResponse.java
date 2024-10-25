// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityResultsResponseBody body;

    public static ListDataQualityResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityResultsResponse self = new ListDataQualityResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityResultsResponse setBody(ListDataQualityResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityResultsResponseBody getBody() {
        return this.body;
    }

}
