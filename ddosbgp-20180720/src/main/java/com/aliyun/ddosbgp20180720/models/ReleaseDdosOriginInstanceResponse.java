// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ReleaseDdosOriginInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseDdosOriginInstanceResponseBody body;

    public static ReleaseDdosOriginInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDdosOriginInstanceResponse self = new ReleaseDdosOriginInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseDdosOriginInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseDdosOriginInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseDdosOriginInstanceResponse setBody(ReleaseDdosOriginInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseDdosOriginInstanceResponseBody getBody() {
        return this.body;
    }

}
