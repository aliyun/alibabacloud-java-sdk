// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDigitalDocStructureJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDigitalDocStructureJobResponseBody body;

    public static SubmitDigitalDocStructureJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalDocStructureJobResponse self = new SubmitDigitalDocStructureJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalDocStructureJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDigitalDocStructureJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDigitalDocStructureJobResponse setBody(SubmitDigitalDocStructureJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDigitalDocStructureJobResponseBody getBody() {
        return this.body;
    }

}
