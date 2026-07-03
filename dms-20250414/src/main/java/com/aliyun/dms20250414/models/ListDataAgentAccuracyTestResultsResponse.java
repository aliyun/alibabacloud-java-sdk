// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentAccuracyTestResultsResponseBody body;

    public static ListDataAgentAccuracyTestResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestResultsResponse self = new ListDataAgentAccuracyTestResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentAccuracyTestResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentAccuracyTestResultsResponse setBody(ListDataAgentAccuracyTestResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentAccuracyTestResultsResponseBody getBody() {
        return this.body;
    }

}
