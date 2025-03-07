// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveInputsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaLiveInputsResponseBody body;

    public static ListMediaLiveInputsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveInputsResponse self = new ListMediaLiveInputsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveInputsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaLiveInputsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaLiveInputsResponse setBody(ListMediaLiveInputsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaLiveInputsResponseBody getBody() {
        return this.body;
    }

}
