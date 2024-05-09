// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocStructureJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocStructureJobResponseBody body;

    public static SubmitDocStructureJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocStructureJobResponse self = new SubmitDocStructureJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocStructureJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocStructureJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocStructureJobResponse setBody(SubmitDocStructureJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocStructureJobResponseBody getBody() {
        return this.body;
    }

}
