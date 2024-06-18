// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDriveSpaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountContext")
    public DeleteDriveSpaceHeadersAccountContext accountContext;

    public static DeleteDriveSpaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveSpaceHeaders self = new DeleteDriveSpaceHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteDriveSpaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteDriveSpaceHeaders setAccountContext(DeleteDriveSpaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteDriveSpaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteDriveSpaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteDriveSpaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteDriveSpaceHeadersAccountContext self = new DeleteDriveSpaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteDriveSpaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
