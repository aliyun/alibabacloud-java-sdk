// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListExperimentTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExperimentTagsResponseBody body;

    public static ListExperimentTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentTagsResponse self = new ListExperimentTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentTagsResponse setBody(ListExperimentTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentTagsResponseBody getBody() {
        return this.body;
    }

}
