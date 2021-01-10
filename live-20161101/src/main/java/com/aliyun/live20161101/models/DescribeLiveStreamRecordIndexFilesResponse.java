// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLiveStreamRecordIndexFilesResponse setBody(DescribeLiveStreamRecordIndexFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamRecordIndexFilesResponseBody getBody() {
        return this.body;
    }

}
