// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataVolumeResponseBody body;

    public static GetDataVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataVolumeResponse self = new GetDataVolumeResponse();
        return TeaModel.build(map, self);
    }

    public GetDataVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataVolumeResponse setBody(GetDataVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataVolumeResponseBody getBody() {
        return this.body;
    }

}
