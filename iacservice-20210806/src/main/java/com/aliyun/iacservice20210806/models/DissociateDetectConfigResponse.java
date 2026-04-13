// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateDetectConfigResponseBody body;

    public static DissociateDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateDetectConfigResponse self = new DissociateDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public DissociateDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateDetectConfigResponse setBody(DissociateDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateDetectConfigResponseBody getBody() {
        return this.body;
    }

}
