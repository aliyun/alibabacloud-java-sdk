// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocTaskLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1021</p>
     */
    @NameInMap("Offset")
    public Integer offset;

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

    public static GetAdHocTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocTaskLogRequest self = new GetAdHocTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public GetAdHocTaskLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public GetAdHocTaskLogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetAdHocTaskLogRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetAdHocTaskLogRequest setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

    public GetAdHocTaskLogRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
