// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSynCloudResourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSynCloudResourceListResponseBody body;

    public static GetSynCloudResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSynCloudResourceListResponse self = new GetSynCloudResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetSynCloudResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSynCloudResourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSynCloudResourceListResponse setBody(GetSynCloudResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSynCloudResourceListResponseBody getBody() {
        return this.body;
    }

}
