// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckConnectivityJobByJobIdResponseBody body;

    public static GetCheckConnectivityJobByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobByJobIdResponse self = new GetCheckConnectivityJobByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckConnectivityJobByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckConnectivityJobByJobIdResponse setBody(GetCheckConnectivityJobByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckConnectivityJobByJobIdResponseBody getBody() {
        return this.body;
    }

}
