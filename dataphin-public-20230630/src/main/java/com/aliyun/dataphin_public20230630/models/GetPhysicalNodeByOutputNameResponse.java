// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeByOutputNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalNodeByOutputNameResponseBody body;

    public static GetPhysicalNodeByOutputNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeByOutputNameResponse self = new GetPhysicalNodeByOutputNameResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeByOutputNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalNodeByOutputNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalNodeByOutputNameResponse setBody(GetPhysicalNodeByOutputNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalNodeByOutputNameResponseBody getBody() {
        return this.body;
    }

}
