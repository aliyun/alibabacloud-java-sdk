// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSuggestV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelSuggestV2ResponseBody body;

    public static HotelSuggestV2Response build(java.util.Map<String, ?> map) throws Exception {
        HotelSuggestV2Response self = new HotelSuggestV2Response();
        return TeaModel.build(map, self);
    }

    public HotelSuggestV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelSuggestV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelSuggestV2Response setBody(HotelSuggestV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelSuggestV2ResponseBody getBody() {
        return this.body;
    }

}
