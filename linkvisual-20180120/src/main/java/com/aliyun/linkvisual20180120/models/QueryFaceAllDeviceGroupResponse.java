// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaceAllDeviceGroupResponseBody body;

    public static QueryFaceAllDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllDeviceGroupResponse self = new QueryFaceAllDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceAllDeviceGroupResponse setBody(QueryFaceAllDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceAllDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
