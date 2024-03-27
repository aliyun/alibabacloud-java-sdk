// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SyncDigitalVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DigitalVideoCommonResult body;

    public static SyncDigitalVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDigitalVideoResponse self = new SyncDigitalVideoResponse();
        return TeaModel.build(map, self);
    }

    public SyncDigitalVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDigitalVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDigitalVideoResponse setBody(DigitalVideoCommonResult body) {
        this.body = body;
        return this;
    }
    public DigitalVideoCommonResult getBody() {
        return this.body;
    }

}
