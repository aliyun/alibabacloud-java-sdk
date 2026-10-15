// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandiseSceneDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MerchandiseSceneDetectionResponseBody body;

    public static MerchandiseSceneDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MerchandiseSceneDetectionResponse self = new MerchandiseSceneDetectionResponse();
        return TeaModel.build(map, self);
    }

    public MerchandiseSceneDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MerchandiseSceneDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MerchandiseSceneDetectionResponse setBody(MerchandiseSceneDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MerchandiseSceneDetectionResponseBody getBody() {
        return this.body;
    }

}
