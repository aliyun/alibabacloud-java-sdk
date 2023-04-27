// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SuspendTaskFlowInstanceRequest extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    /**
     * <p>The ID of the execution record of the task flow. You can call the [ListTaskFlowInstance](~~424689~~) operation to query the execution record ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SuspendTaskFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendTaskFlowInstanceRequest self = new SuspendTaskFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SuspendTaskFlowInstanceRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public SuspendTaskFlowInstanceRequest setDagInstanceId(Long dagInstanceId) {
        this.dagInstanceId = dagInstanceId;
        return this;
    }
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    public SuspendTaskFlowInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
