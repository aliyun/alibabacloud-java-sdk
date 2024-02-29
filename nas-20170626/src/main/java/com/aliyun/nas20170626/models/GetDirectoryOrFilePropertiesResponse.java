// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetDirectoryOrFilePropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDirectoryOrFilePropertiesResponseBody body;

    public static GetDirectoryOrFilePropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryOrFilePropertiesResponse self = new GetDirectoryOrFilePropertiesResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectoryOrFilePropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectoryOrFilePropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectoryOrFilePropertiesResponse setBody(GetDirectoryOrFilePropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectoryOrFilePropertiesResponseBody getBody() {
        return this.body;
    }

}
