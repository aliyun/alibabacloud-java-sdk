// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListFlashSmsSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlashSmsSettingsResponseBody body;

    public static ListFlashSmsSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsSettingsResponse self = new ListFlashSmsSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlashSmsSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlashSmsSettingsResponse setBody(ListFlashSmsSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlashSmsSettingsResponseBody getBody() {
        return this.body;
    }

}
