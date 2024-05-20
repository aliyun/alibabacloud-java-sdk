// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgSceneQuerySceneListByNameResponseBody body;

    public static DsgSceneQuerySceneListByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneQuerySceneListByNameResponse self = new DsgSceneQuerySceneListByNameResponse();
        return TeaModel.build(map, self);
    }

    public DsgSceneQuerySceneListByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgSceneQuerySceneListByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgSceneQuerySceneListByNameResponse setBody(DsgSceneQuerySceneListByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgSceneQuerySceneListByNameResponseBody getBody() {
        return this.body;
    }

}
