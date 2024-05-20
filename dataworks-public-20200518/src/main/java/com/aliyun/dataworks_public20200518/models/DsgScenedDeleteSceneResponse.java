// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgScenedDeleteSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgScenedDeleteSceneResponseBody body;

    public static DsgScenedDeleteSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgScenedDeleteSceneResponse self = new DsgScenedDeleteSceneResponse();
        return TeaModel.build(map, self);
    }

    public DsgScenedDeleteSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgScenedDeleteSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgScenedDeleteSceneResponse setBody(DsgScenedDeleteSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgScenedDeleteSceneResponseBody getBody() {
        return this.body;
    }

}
