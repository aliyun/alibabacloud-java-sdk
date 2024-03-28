// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebHostingFilesResponseBody body;

    public static ListWebHostingFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingFilesResponse self = new ListWebHostingFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListWebHostingFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebHostingFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebHostingFilesResponse setBody(ListWebHostingFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebHostingFilesResponseBody getBody() {
        return this.body;
    }

}
