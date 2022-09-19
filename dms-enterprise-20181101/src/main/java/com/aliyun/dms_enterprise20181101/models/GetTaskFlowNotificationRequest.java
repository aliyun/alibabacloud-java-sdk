// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowNotificationRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static GetTaskFlowNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowNotificationRequest self = new GetTaskFlowNotificationRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowNotificationRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public GetTaskFlowNotificationRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
