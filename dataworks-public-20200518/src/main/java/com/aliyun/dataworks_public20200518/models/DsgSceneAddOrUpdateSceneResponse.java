// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneAddOrUpdateSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgSceneAddOrUpdateSceneResponseBody body;

    public static DsgSceneAddOrUpdateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneAddOrUpdateSceneResponse self = new DsgSceneAddOrUpdateSceneResponse();
        return TeaModel.build(map, self);
    }

    public DsgSceneAddOrUpdateSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgSceneAddOrUpdateSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgSceneAddOrUpdateSceneResponse setBody(DsgSceneAddOrUpdateSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgSceneAddOrUpdateSceneResponseBody getBody() {
        return this.body;
    }

}
