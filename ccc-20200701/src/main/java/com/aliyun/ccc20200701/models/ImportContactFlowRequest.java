// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportContactFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FlowPackageData")
    public String flowPackageData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>DE803553-8AA9-4B9D-9E4E-A82BC69EDCEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportContactFlowRequest self = new ImportContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public ImportContactFlowRequest setFlowPackageData(String flowPackageData) {
        this.flowPackageData = flowPackageData;
        return this;
    }
    public String getFlowPackageData() {
        return this.flowPackageData;
    }

    public ImportContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportContactFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
