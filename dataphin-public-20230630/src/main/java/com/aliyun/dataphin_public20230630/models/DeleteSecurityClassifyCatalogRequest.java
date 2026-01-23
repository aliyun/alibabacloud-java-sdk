// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyCatalogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteSecurityClassifyCatalogRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteSecurityClassifyCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyCatalogRequest self = new DeleteSecurityClassifyCatalogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyCatalogRequest setDeleteCommand(DeleteSecurityClassifyCatalogRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteSecurityClassifyCatalogRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteSecurityClassifyCatalogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteSecurityClassifyCatalogRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/d1/d2/</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("ReturnRemovedDetails")
        public Boolean returnRemovedDetails;

        public static DeleteSecurityClassifyCatalogRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityClassifyCatalogRequestDeleteCommand self = new DeleteSecurityClassifyCatalogRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityClassifyCatalogRequestDeleteCommand setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DeleteSecurityClassifyCatalogRequestDeleteCommand setReturnRemovedDetails(Boolean returnRemovedDetails) {
            this.returnRemovedDetails = returnRemovedDetails;
            return this;
        }
        public Boolean getReturnRemovedDetails() {
            return this.returnRemovedDetails;
        }

    }

}
