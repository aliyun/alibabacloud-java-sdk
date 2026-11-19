// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityLevelRequest extends TeaModel {
    /**
     * <p>The delete command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteSecurityLevelRequestDeleteCommand deleteCommand;

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
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static DeleteSecurityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityLevelRequest self = new DeleteSecurityLevelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityLevelRequest setDeleteCommand(DeleteSecurityLevelRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteSecurityLevelRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteSecurityLevelRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteSecurityLevelRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class DeleteSecurityLevelRequestDeleteCommand extends TeaModel {
        /**
         * <p>The sensitivity level of the data classification. If this parameter is not specified, the system deletes the data classification level by exact match on the name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The name of the data classification level.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DeleteSecurityLevelRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityLevelRequestDeleteCommand self = new DeleteSecurityLevelRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityLevelRequestDeleteCommand setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DeleteSecurityLevelRequestDeleteCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
