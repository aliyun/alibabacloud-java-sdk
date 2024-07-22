// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class FindIdpListByLoginIdentifierResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindIdpListByLoginIdentifierResponseBody body;

    public static FindIdpListByLoginIdentifierResponse build(java.util.Map<String, ?> map) throws Exception {
        FindIdpListByLoginIdentifierResponse self = new FindIdpListByLoginIdentifierResponse();
        return TeaModel.build(map, self);
    }

    public FindIdpListByLoginIdentifierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindIdpListByLoginIdentifierResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindIdpListByLoginIdentifierResponse setBody(FindIdpListByLoginIdentifierResponseBody body) {
        this.body = body;
        return this;
    }
    public FindIdpListByLoginIdentifierResponseBody getBody() {
        return this.body;
    }

}
