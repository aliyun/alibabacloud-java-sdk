// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1305A3E0-A291-54BA-A3B2-7D1C12EC4112</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static DeleteEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointResponseBody self = new DeleteEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEndpointResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
