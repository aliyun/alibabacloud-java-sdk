// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityProjectListResponseBody body;

    public static GetQualityProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectListResponse self = new GetQualityProjectListResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityProjectListResponse setBody(GetQualityProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityProjectListResponseBody getBody() {
        return this.body;
    }

}
