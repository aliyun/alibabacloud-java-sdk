// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageDistributeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageDistributeInfoResponseBody body;

    public static GetImageDistributeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageDistributeInfoResponse self = new GetImageDistributeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetImageDistributeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageDistributeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageDistributeInfoResponse setBody(GetImageDistributeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageDistributeInfoResponseBody getBody() {
        return this.body;
    }

}
