// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocTaskResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>131211211</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SubTaskId")
    public Integer subTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute_SQL_300000843_1611548758327</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetAdHocTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocTaskResultRequest self = new GetAdHocTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAdHocTaskResultRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetAdHocTaskResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetAdHocTaskResultRequest setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

    public GetAdHocTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
