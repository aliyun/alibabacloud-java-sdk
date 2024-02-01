// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse setBody(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

}
