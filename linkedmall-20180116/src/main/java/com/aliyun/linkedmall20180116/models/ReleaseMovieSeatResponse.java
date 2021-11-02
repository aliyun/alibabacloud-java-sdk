// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReleaseMovieSeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseMovieSeatResponseBody body;

    public static ReleaseMovieSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMovieSeatResponse self = new ReleaseMovieSeatResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseMovieSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseMovieSeatResponse setBody(ReleaseMovieSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseMovieSeatResponseBody getBody() {
        return this.body;
    }

}
