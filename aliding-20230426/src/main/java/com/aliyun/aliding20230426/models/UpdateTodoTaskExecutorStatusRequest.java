// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateTodoTaskExecutorStatusRequest extends TeaModel {
    @NameInMap("TenantContext")
    public UpdateTodoTaskExecutorStatusRequestTenantContext tenantContext;

    @NameInMap("executorStatusList")
    public java.util.List<UpdateTodoTaskExecutorStatusRequestExecutorStatusList> executorStatusList;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("taskId")
    public String taskId;

    public static UpdateTodoTaskExecutorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTodoTaskExecutorStatusRequest self = new UpdateTodoTaskExecutorStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTodoTaskExecutorStatusRequest setTenantContext(UpdateTodoTaskExecutorStatusRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateTodoTaskExecutorStatusRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateTodoTaskExecutorStatusRequest setExecutorStatusList(java.util.List<UpdateTodoTaskExecutorStatusRequestExecutorStatusList> executorStatusList) {
        this.executorStatusList = executorStatusList;
        return this;
    }
    public java.util.List<UpdateTodoTaskExecutorStatusRequestExecutorStatusList> getExecutorStatusList() {
        return this.executorStatusList;
    }

    public UpdateTodoTaskExecutorStatusRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateTodoTaskExecutorStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UpdateTodoTaskExecutorStatusRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateTodoTaskExecutorStatusRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateTodoTaskExecutorStatusRequestTenantContext self = new UpdateTodoTaskExecutorStatusRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateTodoTaskExecutorStatusRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class UpdateTodoTaskExecutorStatusRequestExecutorStatusList extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("isDone")
        public Boolean isDone;

        public static UpdateTodoTaskExecutorStatusRequestExecutorStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateTodoTaskExecutorStatusRequestExecutorStatusList self = new UpdateTodoTaskExecutorStatusRequestExecutorStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateTodoTaskExecutorStatusRequestExecutorStatusList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateTodoTaskExecutorStatusRequestExecutorStatusList setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

    }

}
