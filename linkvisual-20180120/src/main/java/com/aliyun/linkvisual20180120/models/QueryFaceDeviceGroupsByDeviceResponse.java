// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceDeviceGroupsByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFaceDeviceGroupsByDeviceResponse setBody(QueryFaceDeviceGroupsByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceDeviceGroupsByDeviceResponseBody getBody() {
        return this.body;
    }

}
