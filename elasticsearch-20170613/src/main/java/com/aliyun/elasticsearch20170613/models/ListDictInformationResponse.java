// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDictInformationResponseBody body;

    public static ListDictInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDictInformationResponse self = new ListDictInformationResponse();
        return TeaModel.build(map, self);
    }

    public ListDictInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDictInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDictInformationResponse setBody(ListDictInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDictInformationResponseBody getBody() {
        return this.body;
    }

}
