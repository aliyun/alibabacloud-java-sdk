// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ResumeTaskFlowInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the execution record of the task flow. You can call the [ListTaskFlowInstance](https://help.aliyun.com/document_detail/424689.html) operation to query the execution record ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    /**
     * <p>The version number of the task flow. You can call the [ListDAGVersions](https://help.aliyun.com/document_detail/424682.html) operation to query the version number.</p>
     */
    @NameInMap("DagVersion")
    public String dagVersion;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ResumeTaskFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeTaskFlowInstanceRequest self = new ResumeTaskFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeTaskFlowInstanceRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ResumeTaskFlowInstanceRequest setDagInstanceId(Long dagInstanceId) {
        this.dagInstanceId = dagInstanceId;
        return this;
    }
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    public ResumeTaskFlowInstanceRequest setDagVersion(String dagVersion) {
        this.dagVersion = dagVersion;
        return this;
    }
    public String getDagVersion() {
        return this.dagVersion;
    }

    public ResumeTaskFlowInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
