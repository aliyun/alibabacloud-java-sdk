// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapToHavanaBindIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MapToHavanaBindIdResponseBody body;

    public static MapToHavanaBindIdResponse build(java.util.Map<String, ?> map) throws Exception {
        MapToHavanaBindIdResponse self = new MapToHavanaBindIdResponse();
        return TeaModel.build(map, self);
    }

    public MapToHavanaBindIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapToHavanaBindIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MapToHavanaBindIdResponse setBody(MapToHavanaBindIdResponseBody body) {
        this.body = body;
        return this;
    }
    public MapToHavanaBindIdResponseBody getBody() {
        return this.body;
    }

}
