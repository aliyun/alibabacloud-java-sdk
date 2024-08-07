// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAsyncResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>F79E7305-5314-5069-A701-9591AD051902</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultResponseBody self = new GetAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
