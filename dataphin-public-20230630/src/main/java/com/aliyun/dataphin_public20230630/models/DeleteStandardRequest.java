// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteStandardRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardRequest self = new DeleteStandardRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardRequest setDeleteCommand(DeleteStandardRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteStandardRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteStandardRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        public static DeleteStandardRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardRequestDeleteCommand self = new DeleteStandardRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteStandardRequestDeleteCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
