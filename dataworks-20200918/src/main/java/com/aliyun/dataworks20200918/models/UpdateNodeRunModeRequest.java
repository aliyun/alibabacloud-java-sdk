// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeRunModeRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchedulerType")
    public Integer schedulerType;

    public static UpdateNodeRunModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRunModeRequest self = new UpdateNodeRunModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRunModeRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateNodeRunModeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public UpdateNodeRunModeRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateNodeRunModeRequest setSchedulerType(Integer schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public Integer getSchedulerType() {
        return this.schedulerType;
    }

}
