// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeOperationLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n_231131</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetPhysicalNodeOperationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeOperationLogRequest self = new GetPhysicalNodeOperationLogRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeOperationLogRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetPhysicalNodeOperationLogRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPhysicalNodeOperationLogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
