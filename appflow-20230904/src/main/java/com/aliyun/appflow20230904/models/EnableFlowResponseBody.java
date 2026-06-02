// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class EnableFlowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17CADBF7-B0F4-5FE6-87EB-76B1A69AC422</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowResponseBody self = new EnableFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EnableFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
