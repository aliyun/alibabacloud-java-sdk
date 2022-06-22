// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListExperimentTasksByApplicationInVisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExperimentTasksByApplicationInVisionResponseBody body;

    public static ListExperimentTasksByApplicationInVisionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentTasksByApplicationInVisionResponse self = new ListExperimentTasksByApplicationInVisionResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentTasksByApplicationInVisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentTasksByApplicationInVisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentTasksByApplicationInVisionResponse setBody(ListExperimentTasksByApplicationInVisionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentTasksByApplicationInVisionResponseBody getBody() {
        return this.body;
    }

}
