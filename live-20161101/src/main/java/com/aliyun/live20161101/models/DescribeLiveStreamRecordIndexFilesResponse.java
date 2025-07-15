// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamRecordIndexFilesResponseBody body;

    public static DescribeLiveStreamRecordIndexFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFilesResponse self = new DescribeLiveStreamRecordIndexFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamRecordIndexFilesResponse setBody(DescribeLiveStreamRecordIndexFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamRecordIndexFilesResponseBody getBody() {
        return this.body;
    }

}
