// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSensitiveColumnsDetailResponseBody body;

    public static ListSensitiveColumnsDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsDetailResponse self = new ListSensitiveColumnsDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitiveColumnsDetailResponse setBody(ListSensitiveColumnsDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveColumnsDetailResponseBody getBody() {
        return this.body;
    }

}
