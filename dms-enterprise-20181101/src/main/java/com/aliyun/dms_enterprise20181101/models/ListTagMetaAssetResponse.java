// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTagMetaAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagMetaAssetResponseBody body;

    public static ListTagMetaAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagMetaAssetResponse self = new ListTagMetaAssetResponse();
        return TeaModel.build(map, self);
    }

    public ListTagMetaAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagMetaAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagMetaAssetResponse setBody(ListTagMetaAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagMetaAssetResponseBody getBody() {
        return this.body;
    }

}
