// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportContactFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-uf61xdtm0mf73k</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb3xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>AF9834D8-6D09-4A1B-BADB-B019D9D444C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportContactFlowRequest self = new ExportContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public ExportContactFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ExportContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportContactFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
