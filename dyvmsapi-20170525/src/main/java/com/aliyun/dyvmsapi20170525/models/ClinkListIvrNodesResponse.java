// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListIvrNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListIvrNodesResponseBody body;

    public static ClinkListIvrNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListIvrNodesResponse self = new ClinkListIvrNodesResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListIvrNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListIvrNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListIvrNodesResponse setBody(ClinkListIvrNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListIvrNodesResponseBody getBody() {
        return this.body;
    }

}
