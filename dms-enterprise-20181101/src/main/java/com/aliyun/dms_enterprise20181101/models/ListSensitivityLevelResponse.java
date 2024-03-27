// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSensitivityLevelResponseBody body;

    public static ListSensitivityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitivityLevelResponse self = new ListSensitivityLevelResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitivityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitivityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSensitivityLevelResponse setBody(ListSensitivityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitivityLevelResponseBody getBody() {
        return this.body;
    }

}
