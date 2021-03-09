// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotlineRecordDetailResponseBody body;

    public static ListHotlineRecordDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordDetailResponse self = new ListHotlineRecordDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotlineRecordDetailResponse setBody(ListHotlineRecordDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineRecordDetailResponseBody getBody() {
        return this.body;
    }

}
