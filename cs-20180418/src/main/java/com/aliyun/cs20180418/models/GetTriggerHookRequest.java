// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class GetTriggerHookRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static GetTriggerHookRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerHookRequest self = new GetTriggerHookRequest();
        return TeaModel.build(map, self);
    }

    public GetTriggerHookRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
