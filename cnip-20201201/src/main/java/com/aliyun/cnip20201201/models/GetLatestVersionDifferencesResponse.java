// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLatestVersionDifferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLatestVersionDifferencesResponseBody body;

    public static GetLatestVersionDifferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestVersionDifferencesResponse self = new GetLatestVersionDifferencesResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestVersionDifferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestVersionDifferencesResponse setBody(GetLatestVersionDifferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestVersionDifferencesResponseBody getBody() {
        return this.body;
    }

}
