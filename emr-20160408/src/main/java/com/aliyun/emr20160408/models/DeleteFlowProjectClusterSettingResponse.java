// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectClusterSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowProjectClusterSettingResponseBody body;

    public static DeleteFlowProjectClusterSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectClusterSettingResponse self = new DeleteFlowProjectClusterSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectClusterSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowProjectClusterSettingResponse setBody(DeleteFlowProjectClusterSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

}
