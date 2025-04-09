// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandDataVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExpandDataVolumeResponseBody body;

    public static ExpandDataVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpandDataVolumeResponse self = new ExpandDataVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ExpandDataVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpandDataVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpandDataVolumeResponse setBody(ExpandDataVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpandDataVolumeResponseBody getBody() {
        return this.body;
    }

}
