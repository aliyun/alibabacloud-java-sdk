// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiOutboundTaskBizDataResponseBody body;

    public static GetAiOutboundTaskBizDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskBizDataResponse self = new GetAiOutboundTaskBizDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskBizDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiOutboundTaskBizDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiOutboundTaskBizDataResponse setBody(GetAiOutboundTaskBizDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiOutboundTaskBizDataResponseBody getBody() {
        return this.body;
    }

}
