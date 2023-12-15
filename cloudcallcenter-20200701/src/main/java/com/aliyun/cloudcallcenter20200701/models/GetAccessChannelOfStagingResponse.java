// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetAccessChannelOfStagingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessChannelOfStagingResponseBody body;

    public static GetAccessChannelOfStagingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessChannelOfStagingResponse self = new GetAccessChannelOfStagingResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessChannelOfStagingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessChannelOfStagingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessChannelOfStagingResponse setBody(GetAccessChannelOfStagingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessChannelOfStagingResponseBody getBody() {
        return this.body;
    }

}
