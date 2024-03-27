// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListSensitiveColumnsDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSensitiveColumnsDetailResponse setBody(ListSensitiveColumnsDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveColumnsDetailResponseBody getBody() {
        return this.body;
    }

}
