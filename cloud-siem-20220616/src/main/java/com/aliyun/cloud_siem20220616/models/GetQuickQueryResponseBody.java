// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetQuickQueryResponseBody extends TeaModel {
    /**
     * <p>The query statement.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuickQueryResponseBody self = new GetQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuickQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
