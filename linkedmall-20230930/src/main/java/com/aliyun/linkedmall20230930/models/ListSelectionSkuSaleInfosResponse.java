// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListSelectionSkuSaleInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkuSaleInfoListResult body;

    public static ListSelectionSkuSaleInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSelectionSkuSaleInfosResponse self = new ListSelectionSkuSaleInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListSelectionSkuSaleInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSelectionSkuSaleInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSelectionSkuSaleInfosResponse setBody(SkuSaleInfoListResult body) {
        this.body = body;
        return this;
    }
    public SkuSaleInfoListResult getBody() {
        return this.body;
    }

}
