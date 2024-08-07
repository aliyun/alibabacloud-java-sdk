// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to obtain the ID of the task flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the task flow version. You can call the <a href="https://help.aliyun.com/document_detail/424682.html">ListDAGVersions</a> operation to obtain the ID of the task flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>2****</p>
     */
    @NameInMap("DagVersion")
    public Long dagVersion;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
