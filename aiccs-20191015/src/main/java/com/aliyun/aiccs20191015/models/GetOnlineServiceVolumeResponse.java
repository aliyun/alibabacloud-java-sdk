// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnlineServiceVolumeResponseBody body;

    public static GetOnlineServiceVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeResponse self = new GetOnlineServiceVolumeResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineServiceVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnlineServiceVolumeResponse setBody(GetOnlineServiceVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineServiceVolumeResponseBody getBody() {
        return this.body;
    }

}
