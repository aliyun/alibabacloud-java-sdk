// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210207.models;

import com.aliyun.tea.*;

public class MtlBuildApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MtlBuildApiResponseBody body;

    public static MtlBuildApiResponse build(java.util.Map<String, ?> map) throws Exception {
        MtlBuildApiResponse self = new MtlBuildApiResponse();
        return TeaModel.build(map, self);
    }

    public MtlBuildApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MtlBuildApiResponse setBody(MtlBuildApiResponseBody body) {
        this.body = body;
        return this;
    }
    public MtlBuildApiResponseBody getBody() {
        return this.body;
    }

}
