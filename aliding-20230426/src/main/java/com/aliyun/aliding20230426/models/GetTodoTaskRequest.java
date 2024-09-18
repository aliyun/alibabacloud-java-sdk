// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTodoTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPJpwtxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantContext")
    public GetTodoTaskRequestTenantContext tenantContext;

    public static GetTodoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTodoTaskRequest self = new GetTodoTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTodoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTodoTaskRequest setTenantContext(GetTodoTaskRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetTodoTaskRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetTodoTaskRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetTodoTaskRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetTodoTaskRequestTenantContext self = new GetTodoTaskRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetTodoTaskRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
