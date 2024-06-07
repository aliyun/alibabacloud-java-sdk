// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMeasureDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMeasureDataResponseBody body;

    public static ListMeasureDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMeasureDataResponse self = new ListMeasureDataResponse();
        return TeaModel.build(map, self);
    }

    public ListMeasureDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMeasureDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMeasureDataResponse setBody(ListMeasureDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMeasureDataResponseBody getBody() {
        return this.body;
    }

}
