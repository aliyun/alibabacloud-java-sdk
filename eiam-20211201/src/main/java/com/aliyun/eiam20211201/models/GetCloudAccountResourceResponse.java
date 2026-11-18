// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAccountResourceResponseBody body;

    public static GetCloudAccountResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountResourceResponse self = new GetCloudAccountResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAccountResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAccountResourceResponse setBody(GetCloudAccountResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAccountResourceResponseBody getBody() {
        return this.body;
    }

}
