// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
