// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineSeatInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnlineSeatInformationResponseBody body;

    public static GetOnlineSeatInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineSeatInformationResponse self = new GetOnlineSeatInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineSeatInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineSeatInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnlineSeatInformationResponse setBody(GetOnlineSeatInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineSeatInformationResponseBody getBody() {
        return this.body;
    }

}
