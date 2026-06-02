// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DisableFlowResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0CEBCD9-CE5D-5BDE-B8E5-F3ADD1BB943F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowResponseBody self = new DisableFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DisableFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
