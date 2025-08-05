// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateTaskScheduleExpressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScheduleExpress")
    public String scheduleExpress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static UpdateTaskScheduleExpressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskScheduleExpressRequest self = new UpdateTaskScheduleExpressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskScheduleExpressRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public UpdateTaskScheduleExpressRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateTaskScheduleExpressRequest setScheduleExpress(String scheduleExpress) {
        this.scheduleExpress = scheduleExpress;
        return this;
    }
    public String getScheduleExpress() {
        return this.scheduleExpress;
    }

    public UpdateTaskScheduleExpressRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateTaskScheduleExpressRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
