// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineageByTaskIdRequest extends TeaModel {
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
    @NameInMap("TableLineageByTaskIdQuery")
    public GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery tableLineageByTaskIdQuery;

    public static GetTableLineageByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineageByTaskIdRequest self = new GetTableLineageByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTableLineageByTaskIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTableLineageByTaskIdRequest setTableLineageByTaskIdQuery(GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery tableLineageByTaskIdQuery) {
        this.tableLineageByTaskIdQuery = tableLineageByTaskIdQuery;
        return this;
    }
    public GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery getTableLineageByTaskIdQuery() {
        return this.tableLineageByTaskIdQuery;
    }

    public static class GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery extends TeaModel {
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

        public static GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery build(java.util.Map<String, ?> map) throws Exception {
            GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery self = new GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery();
            return TeaModel.build(map, self);
        }

        public GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery setNeedNotExistObject(Boolean needNotExistObject) {
            this.needNotExistObject = needNotExistObject;
            return this;
        }
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        public GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery setTaskEnv(String taskEnv) {
            this.taskEnv = taskEnv;
            return this;
        }
        public String getTaskEnv() {
            return this.taskEnv;
        }

        public GetTableLineageByTaskIdRequestTableLineageByTaskIdQuery setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
