// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordDetailRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordDetailCommand")
    public GetOperationRecordDetailRequestRecordDetailCommand recordDetailCommand;

    public static GetOperationRecordDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordDetailRequest self = new GetOperationRecordDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordDetailRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetOperationRecordDetailRequest setRecordDetailCommand(GetOperationRecordDetailRequestRecordDetailCommand recordDetailCommand) {
        this.recordDetailCommand = recordDetailCommand;
        return this;
    }
    public GetOperationRecordDetailRequestRecordDetailCommand getRecordDetailCommand() {
        return this.recordDetailCommand;
    }

    public static class GetOperationRecordDetailRequestRecordDetailCommand extends TeaModel {
        /**
         * <p>The operation record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetOperationRecordDetailRequestRecordDetailCommand build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordDetailRequestRecordDetailCommand self = new GetOperationRecordDetailRequestRecordDetailCommand();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordDetailRequestRecordDetailCommand setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetOperationRecordDetailRequestRecordDetailCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
