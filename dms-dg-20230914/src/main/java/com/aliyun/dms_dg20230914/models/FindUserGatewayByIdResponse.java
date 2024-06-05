// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class FindUserGatewayByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindUserGatewayByIdResponseBody body;

    public static FindUserGatewayByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        FindUserGatewayByIdResponse self = new FindUserGatewayByIdResponse();
        return TeaModel.build(map, self);
    }

    public FindUserGatewayByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindUserGatewayByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindUserGatewayByIdResponse setBody(FindUserGatewayByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public FindUserGatewayByIdResponseBody getBody() {
        return this.body;
    }

}
