// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCalcEnginesResponseBody body;

    public static ListCalcEnginesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesResponse self = new ListCalcEnginesResponse();
        return TeaModel.build(map, self);
    }

    public ListCalcEnginesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCalcEnginesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCalcEnginesResponse setBody(ListCalcEnginesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCalcEnginesResponseBody getBody() {
        return this.body;
    }

}
