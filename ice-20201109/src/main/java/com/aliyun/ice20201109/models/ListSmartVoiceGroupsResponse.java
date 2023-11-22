// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartVoiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSmartVoiceGroupsResponseBody body;

    public static ListSmartVoiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartVoiceGroupsResponse self = new ListSmartVoiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartVoiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartVoiceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmartVoiceGroupsResponse setBody(ListSmartVoiceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartVoiceGroupsResponseBody getBody() {
        return this.body;
    }

}
