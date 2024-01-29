// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingIndexFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveEditingIndexFileResponseBody body;

    public static GetLiveEditingIndexFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingIndexFileResponse self = new GetLiveEditingIndexFileResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingIndexFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveEditingIndexFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveEditingIndexFileResponse setBody(GetLiveEditingIndexFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveEditingIndexFileResponseBody getBody() {
        return this.body;
    }

}
