// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetDownloadExcelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDownloadExcelListResponseBody body;

    public static GetDownloadExcelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadExcelListResponse self = new GetDownloadExcelListResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadExcelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadExcelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownloadExcelListResponse setBody(GetDownloadExcelListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadExcelListResponseBody getBody() {
        return this.body;
    }

}
