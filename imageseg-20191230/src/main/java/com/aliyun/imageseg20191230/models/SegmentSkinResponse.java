// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SegmentSkinResponseBody body;

    public static SegmentSkinResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinResponse self = new SegmentSkinResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSkinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentSkinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentSkinResponse setBody(SegmentSkinResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentSkinResponseBody getBody() {
        return this.body;
    }

}
