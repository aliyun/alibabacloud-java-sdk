// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNameAndDescRequest extends TeaModel {
    /**
     * <p>The description that you want to specify for the task flow.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagName")
    public String dagName;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new name that you want to specify for the task flow.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowNameAndDescRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowNameAndDescRequest self = new UpdateTaskFlowNameAndDescRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowNameAndDescRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowNameAndDescRequest setDagName(String dagName) {
        this.dagName = dagName;
        return this;
    }
    public String getDagName() {
        return this.dagName;
    }

    public UpdateTaskFlowNameAndDescRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskFlowNameAndDescRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
