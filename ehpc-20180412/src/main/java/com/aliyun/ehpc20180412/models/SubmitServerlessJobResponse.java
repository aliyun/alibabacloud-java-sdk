// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitServerlessJobResponseBody body;

    public static SubmitServerlessJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitServerlessJobResponse self = new SubmitServerlessJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitServerlessJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitServerlessJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitServerlessJobResponse setBody(SubmitServerlessJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitServerlessJobResponseBody getBody() {
        return this.body;
    }

}
