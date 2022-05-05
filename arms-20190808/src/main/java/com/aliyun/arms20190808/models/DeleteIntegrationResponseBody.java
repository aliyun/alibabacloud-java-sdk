// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationResponseBody self = new DeleteIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
