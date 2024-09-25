// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class PageQueryWhiteListSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageQueryWhiteListSettingResponseBody body;

    public static PageQueryWhiteListSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryWhiteListSettingResponse self = new PageQueryWhiteListSettingResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryWhiteListSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryWhiteListSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQueryWhiteListSettingResponse setBody(PageQueryWhiteListSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryWhiteListSettingResponseBody getBody() {
        return this.body;
    }

}
