// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelNoticeV2ResponseBody body;

    public static GetHotelNoticeV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeV2Response self = new GetHotelNoticeV2Response();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelNoticeV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelNoticeV2Response setBody(GetHotelNoticeV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelNoticeV2ResponseBody getBody() {
        return this.body;
    }

}
