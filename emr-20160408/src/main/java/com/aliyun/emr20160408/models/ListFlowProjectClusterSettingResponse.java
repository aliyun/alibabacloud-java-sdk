// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowProjectClusterSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowProjectClusterSettingResponseBody body;

    public static ListFlowProjectClusterSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectClusterSettingResponse self = new ListFlowProjectClusterSettingResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectClusterSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowProjectClusterSettingResponse setBody(ListFlowProjectClusterSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

}
