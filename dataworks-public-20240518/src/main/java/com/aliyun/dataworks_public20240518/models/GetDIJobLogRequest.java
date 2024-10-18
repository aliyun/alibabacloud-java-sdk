// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobLogRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The failover ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailoverId")
    public Long failoverId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6153616438</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    public static GetDIJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogRequest self = new GetDIJobLogRequest();
        return TeaModel.build(map, self);
    }

    public GetDIJobLogRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobLogRequest setFailoverId(Long failoverId) {
        this.failoverId = failoverId;
        return this;
    }
    public Long getFailoverId() {
        return this.failoverId;
    }

    public GetDIJobLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

}
