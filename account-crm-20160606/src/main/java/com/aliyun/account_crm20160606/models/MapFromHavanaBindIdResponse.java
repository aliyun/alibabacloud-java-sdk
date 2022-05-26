// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapFromHavanaBindIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MapFromHavanaBindIdResponseBody body;

    public static MapFromHavanaBindIdResponse build(java.util.Map<String, ?> map) throws Exception {
        MapFromHavanaBindIdResponse self = new MapFromHavanaBindIdResponse();
        return TeaModel.build(map, self);
    }

    public MapFromHavanaBindIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapFromHavanaBindIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MapFromHavanaBindIdResponse setBody(MapFromHavanaBindIdResponseBody body) {
        this.body = body;
        return this;
    }
    public MapFromHavanaBindIdResponseBody getBody() {
        return this.body;
    }

}
