// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanAddOrUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgDesensPlanAddOrUpdateResponseBody body;

    public static DsgDesensPlanAddOrUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanAddOrUpdateResponse self = new DsgDesensPlanAddOrUpdateResponse();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanAddOrUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgDesensPlanAddOrUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgDesensPlanAddOrUpdateResponse setBody(DsgDesensPlanAddOrUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgDesensPlanAddOrUpdateResponseBody getBody() {
        return this.body;
    }

}
