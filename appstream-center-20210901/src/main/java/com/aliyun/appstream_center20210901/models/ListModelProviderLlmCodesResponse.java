// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderLlmCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelProviderLlmCodesResponseBody body;

    public static ListModelProviderLlmCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderLlmCodesResponse self = new ListModelProviderLlmCodesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelProviderLlmCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelProviderLlmCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelProviderLlmCodesResponse setBody(ListModelProviderLlmCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelProviderLlmCodesResponseBody getBody() {
        return this.body;
    }

}
