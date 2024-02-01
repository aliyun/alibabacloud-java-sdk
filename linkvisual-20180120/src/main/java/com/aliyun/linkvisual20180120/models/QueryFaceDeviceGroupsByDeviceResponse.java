// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceDeviceGroupsByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceDeviceGroupsByDeviceResponseBody body;

    public static QueryFaceDeviceGroupsByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceDeviceGroupsByDeviceResponse self = new QueryFaceDeviceGroupsByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceDeviceGroupsByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setBody(QueryFaceDeviceGroupsByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceDeviceGroupsByDeviceResponseBody getBody() {
        return this.body;
    }

}
