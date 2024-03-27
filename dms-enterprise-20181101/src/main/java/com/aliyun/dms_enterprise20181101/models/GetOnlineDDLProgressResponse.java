// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOnlineDDLProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnlineDDLProgressResponseBody body;

    public static GetOnlineDDLProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineDDLProgressResponse self = new GetOnlineDDLProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetOnlineDDLProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnlineDDLProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnlineDDLProgressResponse setBody(GetOnlineDDLProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnlineDDLProgressResponseBody getBody() {
        return this.body;
    }

}
