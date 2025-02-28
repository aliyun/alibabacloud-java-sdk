// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetAATOssInfoForADBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAATOssInfoForADBResponseBody body;

    public static GetAATOssInfoForADBResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAATOssInfoForADBResponse self = new GetAATOssInfoForADBResponse();
        return TeaModel.build(map, self);
    }

    public GetAATOssInfoForADBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAATOssInfoForADBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAATOssInfoForADBResponse setBody(GetAATOssInfoForADBResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAATOssInfoForADBResponseBody getBody() {
        return this.body;
    }

}
