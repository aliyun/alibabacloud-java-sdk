// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RetryTransferOwnershipRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    @NameInMap("PrivilegeTransferRecord")
    public RetryTransferOwnershipRequestPrivilegeTransferRecord privilegeTransferRecord;

    public static RetryTransferOwnershipRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTransferOwnershipRequest self = new RetryTransferOwnershipRequest();
        return TeaModel.build(map, self);
    }

    public RetryTransferOwnershipRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RetryTransferOwnershipRequest setPrivilegeTransferRecord(RetryTransferOwnershipRequestPrivilegeTransferRecord privilegeTransferRecord) {
        this.privilegeTransferRecord = privilegeTransferRecord;
        return this;
    }
    public RetryTransferOwnershipRequestPrivilegeTransferRecord getPrivilegeTransferRecord() {
        return this.privilegeTransferRecord;
    }

    public static class RetryTransferOwnershipRequestPrivilegeTransferRecord extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000001</p>
         */
        @NameInMap("NewOwner")
        public String newOwner;

        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("TransferComment")
        public String transferComment;

        public static RetryTransferOwnershipRequestPrivilegeTransferRecord build(java.util.Map<String, ?> map) throws Exception {
            RetryTransferOwnershipRequestPrivilegeTransferRecord self = new RetryTransferOwnershipRequestPrivilegeTransferRecord();
            return TeaModel.build(map, self);
        }

        public RetryTransferOwnershipRequestPrivilegeTransferRecord setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RetryTransferOwnershipRequestPrivilegeTransferRecord setNewOwner(String newOwner) {
            this.newOwner = newOwner;
            return this;
        }
        public String getNewOwner() {
            return this.newOwner;
        }

        public RetryTransferOwnershipRequestPrivilegeTransferRecord setTransferComment(String transferComment) {
            this.transferComment = transferComment;
            return this;
        }
        public String getTransferComment() {
            return this.transferComment;
        }

    }

}
