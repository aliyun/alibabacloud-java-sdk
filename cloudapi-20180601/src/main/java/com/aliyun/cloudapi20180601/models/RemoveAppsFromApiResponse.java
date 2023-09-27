// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveAppsFromApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAppsFromApiResponseBody body;

    public static RemoveAppsFromApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppsFromApiResponse self = new RemoveAppsFromApiResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAppsFromApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAppsFromApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAppsFromApiResponse setBody(RemoveAppsFromApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAppsFromApiResponseBody getBody() {
        return this.body;
    }

}
