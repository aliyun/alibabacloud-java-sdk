// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServicePublishedApiResponseBody body;

    public static GetDataServicePublishedApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiResponse self = new GetDataServicePublishedApiResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServicePublishedApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServicePublishedApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServicePublishedApiResponse setBody(GetDataServicePublishedApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServicePublishedApiResponseBody getBody() {
        return this.body;
    }

}
