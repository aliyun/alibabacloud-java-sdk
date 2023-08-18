// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarTrainingJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvatarTrainingJobsResponseBody body;

    public static ListAvatarTrainingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarTrainingJobsResponse self = new ListAvatarTrainingJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvatarTrainingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvatarTrainingJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvatarTrainingJobsResponse setBody(ListAvatarTrainingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvatarTrainingJobsResponseBody getBody() {
        return this.body;
    }

}
