// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublicDatasetResponseBody body;

    public static GetPublicDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetResponse self = new GetPublicDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicDatasetResponse setBody(GetPublicDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicDatasetResponseBody getBody() {
        return this.body;
    }

}
