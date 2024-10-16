// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetErServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>er_paymode</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetErServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErServiceResponseBody self = new GetErServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErServiceResponseBody setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public GetErServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
