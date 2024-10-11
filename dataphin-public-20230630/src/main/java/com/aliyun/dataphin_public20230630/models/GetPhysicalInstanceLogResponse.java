// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalInstanceLogResponseBody body;

    public static GetPhysicalInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalInstanceLogResponse self = new GetPhysicalInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalInstanceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalInstanceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalInstanceLogResponse setBody(GetPhysicalInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalInstanceLogResponseBody getBody() {
        return this.body;
    }

}
