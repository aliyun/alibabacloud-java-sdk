// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityWatchResponseBody body;

    public static GetQualityWatchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchResponse self = new GetQualityWatchResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityWatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityWatchResponse setBody(GetQualityWatchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityWatchResponseBody getBody() {
        return this.body;
    }

}
