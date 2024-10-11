// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalNodeContentResponseBody body;

    public static GetPhysicalNodeContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeContentResponse self = new GetPhysicalNodeContentResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalNodeContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalNodeContentResponse setBody(GetPhysicalNodeContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalNodeContentResponseBody getBody() {
        return this.body;
    }

}
