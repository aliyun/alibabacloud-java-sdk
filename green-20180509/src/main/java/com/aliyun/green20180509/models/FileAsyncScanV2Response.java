// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileAsyncScanV2ResponseBody body;

    public static FileAsyncScanV2Response build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanV2Response self = new FileAsyncScanV2Response();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileAsyncScanV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileAsyncScanV2Response setBody(FileAsyncScanV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FileAsyncScanV2ResponseBody getBody() {
        return this.body;
    }

}
