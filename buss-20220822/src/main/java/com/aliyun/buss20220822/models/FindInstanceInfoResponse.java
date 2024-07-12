// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindInstanceInfoResponseBody body;

    public static FindInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        FindInstanceInfoResponse self = new FindInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public FindInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindInstanceInfoResponse setBody(FindInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public FindInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
