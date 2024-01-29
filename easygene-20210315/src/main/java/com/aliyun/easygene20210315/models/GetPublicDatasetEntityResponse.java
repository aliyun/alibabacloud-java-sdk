// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicDatasetEntityResponseBody body;

    public static GetPublicDatasetEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetEntityResponse self = new GetPublicDatasetEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicDatasetEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicDatasetEntityResponse setBody(GetPublicDatasetEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicDatasetEntityResponseBody getBody() {
        return this.body;
    }

}
