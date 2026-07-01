// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DetailCommand")
    public GetOperationRecordByIdRequestDetailCommand detailCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetOperationRecordByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordByIdRequest self = new GetOperationRecordByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordByIdRequest setDetailCommand(GetOperationRecordByIdRequestDetailCommand detailCommand) {
        this.detailCommand = detailCommand;
        return this;
    }
    public GetOperationRecordByIdRequestDetailCommand getDetailCommand() {
        return this.detailCommand;
    }

    public GetOperationRecordByIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetOperationRecordByIdRequestDetailCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public Long operationId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetOperationRecordByIdRequestDetailCommand build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordByIdRequestDetailCommand self = new GetOperationRecordByIdRequestDetailCommand();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordByIdRequestDetailCommand setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public GetOperationRecordByIdRequestDetailCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
