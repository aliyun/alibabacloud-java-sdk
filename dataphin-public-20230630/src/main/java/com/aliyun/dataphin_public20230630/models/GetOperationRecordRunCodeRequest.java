// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordRunCodeRequest extends TeaModel {
    /**
     * <p>The query command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeCommand")
    public GetOperationRecordRunCodeRequestCodeCommand codeCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetOperationRecordRunCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordRunCodeRequest self = new GetOperationRecordRunCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordRunCodeRequest setCodeCommand(GetOperationRecordRunCodeRequestCodeCommand codeCommand) {
        this.codeCommand = codeCommand;
        return this;
    }
    public GetOperationRecordRunCodeRequestCodeCommand getCodeCommand() {
        return this.codeCommand;
    }

    public GetOperationRecordRunCodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetOperationRecordRunCodeRequestCodeCommand extends TeaModel {
        /**
         * <p>The operation log ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("OperationId")
        public Long operationId;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetOperationRecordRunCodeRequestCodeCommand build(java.util.Map<String, ?> map) throws Exception {
            GetOperationRecordRunCodeRequestCodeCommand self = new GetOperationRecordRunCodeRequestCodeCommand();
            return TeaModel.build(map, self);
        }

        public GetOperationRecordRunCodeRequestCodeCommand setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public GetOperationRecordRunCodeRequestCodeCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
