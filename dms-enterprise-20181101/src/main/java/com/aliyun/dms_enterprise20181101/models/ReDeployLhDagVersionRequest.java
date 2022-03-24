// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagVersion")
    public Long dagVersion;

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
