// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetBillDetailFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBillDetailFileListResponseBody body;

    public static GetBillDetailFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailFileListResponse self = new GetBillDetailFileListResponse();
        return TeaModel.build(map, self);
    }

    public GetBillDetailFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBillDetailFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBillDetailFileListResponse setBody(GetBillDetailFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBillDetailFileListResponseBody getBody() {
        return this.body;
    }

}
