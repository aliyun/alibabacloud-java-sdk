// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteDataSourceRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceRequest self = new DeleteDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceRequest setDeleteCommand(DeleteDataSourceRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteDataSourceRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteDataSourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteDataSourceRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13121</p>
         */
        @NameInMap("ProdDataSourceId")
        public Long prodDataSourceId;

        public static DeleteDataSourceRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSourceRequestDeleteCommand self = new DeleteDataSourceRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteDataSourceRequestDeleteCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DeleteDataSourceRequestDeleteCommand setProdDataSourceId(Long prodDataSourceId) {
            this.prodDataSourceId = prodDataSourceId;
            return this;
        }
        public Long getProdDataSourceId() {
            return this.prodDataSourceId;
        }

    }

}
