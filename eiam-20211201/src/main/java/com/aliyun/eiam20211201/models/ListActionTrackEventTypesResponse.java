// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListActionTrackEventTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActionTrackEventTypesResponseBody body;

    public static ListActionTrackEventTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionTrackEventTypesResponse self = new ListActionTrackEventTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListActionTrackEventTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionTrackEventTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActionTrackEventTypesResponse setBody(ListActionTrackEventTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionTrackEventTypesResponseBody getBody() {
        return this.body;
    }

}
