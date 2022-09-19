// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class StopTaskFlowInstanceRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    @NameInMap("Tid")
    public Long tid;

    public static StopTaskFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTaskFlowInstanceRequest self = new StopTaskFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopTaskFlowInstanceRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public StopTaskFlowInstanceRequest setDagInstanceId(Long dagInstanceId) {
        this.dagInstanceId = dagInstanceId;
        return this;
    }
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    public StopTaskFlowInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
