// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTasksInTaskFlowRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTasksInTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksInTaskFlowRequest self = new ListTasksInTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksInTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListTasksInTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
