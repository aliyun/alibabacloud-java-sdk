// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAudioFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAudioFilesResponseBody body;

    public static ListAudioFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAudioFilesResponse self = new ListAudioFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListAudioFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAudioFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAudioFilesResponse setBody(ListAudioFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAudioFilesResponseBody getBody() {
        return this.body;
    }

}
