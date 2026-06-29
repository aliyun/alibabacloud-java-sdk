// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyRequest extends TeaModel {
    /**
     * <p>The delete instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteSecurityClassifyRequestDeleteCommand deleteCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteSecurityClassifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyRequest self = new DeleteSecurityClassifyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyRequest setDeleteCommand(DeleteSecurityClassifyRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteSecurityClassifyRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteSecurityClassifyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteSecurityClassifyRequestDeleteCommand extends TeaModel {
        /**
         * <p>The categorization ID. If this parameter is not specified, the categorization is matched and deleted based on the categorization name and parent path.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The categorization name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The categorization path. Default value: /.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ParentPath")
        public String parentPath;

        public static DeleteSecurityClassifyRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityClassifyRequestDeleteCommand self = new DeleteSecurityClassifyRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityClassifyRequestDeleteCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteSecurityClassifyRequestDeleteCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteSecurityClassifyRequestDeleteCommand setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

    }

}
