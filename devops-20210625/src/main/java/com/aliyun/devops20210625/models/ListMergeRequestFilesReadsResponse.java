// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestFilesReadsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMergeRequestFilesReadsResponseBody body;

    public static ListMergeRequestFilesReadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestFilesReadsResponse self = new ListMergeRequestFilesReadsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestFilesReadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestFilesReadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMergeRequestFilesReadsResponse setBody(ListMergeRequestFilesReadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestFilesReadsResponseBody getBody() {
        return this.body;
    }

}
