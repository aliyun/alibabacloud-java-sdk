// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DissociateProjectFromImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateProjectFromImageResponseBody body;

    public static DissociateProjectFromImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateProjectFromImageResponse self = new DissociateProjectFromImageResponse();
        return TeaModel.build(map, self);
    }

    public DissociateProjectFromImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateProjectFromImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateProjectFromImageResponse setBody(DissociateProjectFromImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateProjectFromImageResponseBody getBody() {
        return this.body;
    }

}
