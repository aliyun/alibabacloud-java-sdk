// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListChatRecordDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChatRecordDetailResponseBody body;

    public static ListChatRecordDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatRecordDetailResponse self = new ListChatRecordDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListChatRecordDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatRecordDetailResponse setBody(ListChatRecordDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatRecordDetailResponseBody getBody() {
        return this.body;
    }

}
