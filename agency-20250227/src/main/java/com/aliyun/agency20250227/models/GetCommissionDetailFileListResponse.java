// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCommissionDetailFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommissionDetailFileListResponseBody body;

    public static GetCommissionDetailFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionDetailFileListResponse self = new GetCommissionDetailFileListResponse();
        return TeaModel.build(map, self);
    }

    public GetCommissionDetailFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommissionDetailFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommissionDetailFileListResponse setBody(GetCommissionDetailFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommissionDetailFileListResponseBody getBody() {
        return this.body;
    }

}
