// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetErServiceResponseBody extends TeaModel {
    /**
     * <p>The billing mode. Valid values:</p>
     * <ul>
     * <li>er_paymode: billed for customers on the China site.</li>
     * <li>er_freemode: free for customers on the China site.</li>
     * <li>er_paymodeintl: billed for customers on the International site.</li>
     * <li>err_freemodeintl: free for customers on the International site</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>er_paymode</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service status. Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Running</li>
     * <li>NotOpened</li>
     * </ul>
     * 
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
