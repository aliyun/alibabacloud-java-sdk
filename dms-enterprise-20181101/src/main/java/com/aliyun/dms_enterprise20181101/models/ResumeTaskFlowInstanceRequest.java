// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ResumeTaskFlowInstanceRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagInstanceId")
    public Long dagInstanceId;

    @NameInMap("DagVersion")
    public String dagVersion;

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
