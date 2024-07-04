// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreloadRegionSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreloadRegionSDGResponseBody body;

    public static PreloadRegionSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadRegionSDGResponse self = new PreloadRegionSDGResponse();
        return TeaModel.build(map, self);
    }

    public PreloadRegionSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadRegionSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreloadRegionSDGResponse setBody(PreloadRegionSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadRegionSDGResponseBody getBody() {
        return this.body;
    }

}
