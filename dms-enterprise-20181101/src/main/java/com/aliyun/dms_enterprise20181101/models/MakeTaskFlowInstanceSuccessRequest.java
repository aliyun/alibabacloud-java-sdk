// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MakeTaskFlowInstanceSuccessRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    @NameInMap("Tid")
    public Long tid;

    public static MakeTaskFlowInstanceSuccessRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeTaskFlowInstanceSuccessRequest self = new MakeTaskFlowInstanceSuccessRequest();
        return TeaModel.build(map, self);
    }

    public MakeTaskFlowInstanceSuccessRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public MakeTaskFlowInstanceSuccessRequest setDagInstanceId(Long dagInstanceId) {
        this.dagInstanceId = dagInstanceId;
        return this;
    }
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    public MakeTaskFlowInstanceSuccessRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
