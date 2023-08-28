// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteTodoTaskRequest extends TeaModel {
    @NameInMap("TenantContext")
    public DeleteTodoTaskRequestTenantContext tenantContext;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("taskId")
    public String taskId;

    public static DeleteTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTodoTaskRequest self = new DeleteTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTodoTaskRequest setTenantContext(DeleteTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteTodoTaskRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DeleteTodoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DeleteTodoTaskRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteTodoTaskRequestTenantContext self = new DeleteTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
