// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PublishAndDeployTaskFlowRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The description of the version.</p>
     */
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
