// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body;

    public static QueryFaceAllUserGroupAndDeviceGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupAndDeviceGroupRelationResponse self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setBody(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
