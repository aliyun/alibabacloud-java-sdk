// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineageByTaskIdRequest extends TeaModel {
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
     */
    @NameInMap("TableColumnLineageByTaskIdQuery")
    public GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery tableColumnLineageByTaskIdQuery;

    public static GetTableColumnLineageByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineageByTaskIdRequest self = new GetTableColumnLineageByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineageByTaskIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableColumnLineageByTaskIdRequest setTableColumnLineageByTaskIdQuery(GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery tableColumnLineageByTaskIdQuery) {
        this.tableColumnLineageByTaskIdQuery = tableColumnLineageByTaskIdQuery;
        return this;
    }
    public GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery getTableColumnLineageByTaskIdQuery() {
        return this.tableColumnLineageByTaskIdQuery;
    }

    public static class GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery extends TeaModel {
        @NameInMap("NeedNotExistObject")
        public Boolean needNotExistObject;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("TaskEnv")
        public String taskEnv;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery self = new GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery();
            return TeaModel.build(map, self);
        }

        public GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery setNeedNotExistObject(Boolean needNotExistObject) {
            this.needNotExistObject = needNotExistObject;
            return this;
        }
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        public GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery setTaskEnv(String taskEnv) {
            this.taskEnv = taskEnv;
            return this;
        }
        public String getTaskEnv() {
            return this.taskEnv;
        }

        public GetTableColumnLineageByTaskIdRequestTableColumnLineageByTaskIdQuery setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
