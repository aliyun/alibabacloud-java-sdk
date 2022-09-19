// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PublishAndDeployTaskFlowRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("VersionComments")
    public String versionComments;

    public static PublishAndDeployTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAndDeployTaskFlowRequest self = new PublishAndDeployTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public PublishAndDeployTaskFlowRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public PublishAndDeployTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public PublishAndDeployTaskFlowRequest setVersionComments(String versionComments) {
        this.versionComments = versionComments;
        return this;
    }
    public String getVersionComments() {
        return this.versionComments;
    }

}
