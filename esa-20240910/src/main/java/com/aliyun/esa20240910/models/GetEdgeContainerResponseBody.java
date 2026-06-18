// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>container_95</p>
     */
    @NameInMap("BillingMode")
    public String billingMode;

    /**
     * <strong>example:</strong>
     * <p>esa-cn-jea67jfbs0x</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>9BEB8659-9CDE-5F2C-83E9-50F55277E844</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetEdgeContainerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerResponseBody self = new GetEdgeContainerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerResponseBody setBillingMode(String billingMode) {
        this.billingMode = billingMode;
        return this;
    }
    public String getBillingMode() {
        return this.billingMode;
    }

    public GetEdgeContainerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetEdgeContainerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
