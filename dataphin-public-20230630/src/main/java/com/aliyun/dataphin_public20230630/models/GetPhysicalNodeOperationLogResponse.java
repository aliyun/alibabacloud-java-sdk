// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeOperationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalNodeOperationLogResponseBody body;

    public static GetPhysicalNodeOperationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeOperationLogResponse self = new GetPhysicalNodeOperationLogResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeOperationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalNodeOperationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalNodeOperationLogResponse setBody(GetPhysicalNodeOperationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalNodeOperationLogResponseBody getBody() {
        return this.body;
    }

}
