// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the ID of the task flow.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the task flow version. You can call the [ListDAGVersions](~~424682~~) operation to obtain the ID of the task flow version.</p>
     */
    @NameInMap("DagVersion")
    public Long dagVersion;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ReDeployLhDagVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReDeployLhDagVersionRequest self = new ReDeployLhDagVersionRequest();
        return TeaModel.build(map, self);
    }

    public ReDeployLhDagVersionRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ReDeployLhDagVersionRequest setDagVersion(Long dagVersion) {
        this.dagVersion = dagVersion;
        return this;
    }
    public Long getDagVersion() {
        return this.dagVersion;
    }

    public ReDeployLhDagVersionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
