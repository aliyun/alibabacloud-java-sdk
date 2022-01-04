// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRdsDBInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRdsDBInstanceAttributeResponseBody body;

    public static GetRdsDBInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRdsDBInstanceAttributeResponse self = new GetRdsDBInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetRdsDBInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRdsDBInstanceAttributeResponse setBody(GetRdsDBInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRdsDBInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
