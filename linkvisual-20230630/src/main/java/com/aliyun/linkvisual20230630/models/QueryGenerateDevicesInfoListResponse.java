// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryGenerateDevicesInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGenerateDevicesInfoListResponseBody body;

    public static QueryGenerateDevicesInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGenerateDevicesInfoListResponse self = new QueryGenerateDevicesInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGenerateDevicesInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGenerateDevicesInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGenerateDevicesInfoListResponse setBody(QueryGenerateDevicesInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGenerateDevicesInfoListResponseBody getBody() {
        return this.body;
    }

}
