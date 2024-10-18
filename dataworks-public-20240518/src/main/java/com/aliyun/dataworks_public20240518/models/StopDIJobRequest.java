// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopDIJobRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11668</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    public static StopDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDIJobRequest self = new StopDIJobRequest();
        return TeaModel.build(map, self);
    }

    public StopDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public StopDIJobRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

}
