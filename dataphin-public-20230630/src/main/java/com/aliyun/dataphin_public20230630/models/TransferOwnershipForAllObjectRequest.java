// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class TransferOwnershipForAllObjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    @NameInMap("PrivilegeTransferRecord")
    public TransferOwnershipForAllObjectRequestPrivilegeTransferRecord privilegeTransferRecord;

    public static TransferOwnershipForAllObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferOwnershipForAllObjectRequest self = new TransferOwnershipForAllObjectRequest();
        return TeaModel.build(map, self);
    }

    public TransferOwnershipForAllObjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public TransferOwnershipForAllObjectRequest setPrivilegeTransferRecord(TransferOwnershipForAllObjectRequestPrivilegeTransferRecord privilegeTransferRecord) {
        this.privilegeTransferRecord = privilegeTransferRecord;
        return this;
    }
    public TransferOwnershipForAllObjectRequestPrivilegeTransferRecord getPrivilegeTransferRecord() {
        return this.privilegeTransferRecord;
    }

    public static class TransferOwnershipForAllObjectRequestPrivilegeTransferRecord extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000002</p>
         */
        @NameInMap("NewOwner")
        public String newOwner;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("OldOwner")
        public String oldOwner;

        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("TransferComment")
        public String transferComment;

        public static TransferOwnershipForAllObjectRequestPrivilegeTransferRecord build(java.util.Map<String, ?> map) throws Exception {
            TransferOwnershipForAllObjectRequestPrivilegeTransferRecord self = new TransferOwnershipForAllObjectRequestPrivilegeTransferRecord();
            return TeaModel.build(map, self);
        }

        public TransferOwnershipForAllObjectRequestPrivilegeTransferRecord setNewOwner(String newOwner) {
            this.newOwner = newOwner;
            return this;
        }
        public String getNewOwner() {
            return this.newOwner;
        }

        public TransferOwnershipForAllObjectRequestPrivilegeTransferRecord setOldOwner(String oldOwner) {
            this.oldOwner = oldOwner;
            return this;
        }
        public String getOldOwner() {
            return this.oldOwner;
        }

        public TransferOwnershipForAllObjectRequestPrivilegeTransferRecord setTransferComment(String transferComment) {
            this.transferComment = transferComment;
            return this;
        }
        public String getTransferComment() {
            return this.transferComment;
        }

    }

}
