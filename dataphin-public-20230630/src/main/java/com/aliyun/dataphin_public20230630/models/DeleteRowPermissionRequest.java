// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRowPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteRowPermissionCommand")
    public DeleteRowPermissionRequestDeleteRowPermissionCommand deleteRowPermissionCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteRowPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowPermissionRequest self = new DeleteRowPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRowPermissionRequest setDeleteRowPermissionCommand(DeleteRowPermissionRequestDeleteRowPermissionCommand deleteRowPermissionCommand) {
        this.deleteRowPermissionCommand = deleteRowPermissionCommand;
        return this;
    }
    public DeleteRowPermissionRequestDeleteRowPermissionCommand getDeleteRowPermissionCommand() {
        return this.deleteRowPermissionCommand;
    }

    public DeleteRowPermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteRowPermissionRequestDeleteRowPermissionCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300001234</p>
         */
        @NameInMap("RowPermissionId")
        public Long rowPermissionId;

        public static DeleteRowPermissionRequestDeleteRowPermissionCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteRowPermissionRequestDeleteRowPermissionCommand self = new DeleteRowPermissionRequestDeleteRowPermissionCommand();
            return TeaModel.build(map, self);
        }

        public DeleteRowPermissionRequestDeleteRowPermissionCommand setRowPermissionId(Long rowPermissionId) {
            this.rowPermissionId = rowPermissionId;
            return this;
        }
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

    }

}
