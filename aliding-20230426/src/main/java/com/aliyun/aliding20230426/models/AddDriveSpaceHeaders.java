// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddDriveSpaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountContext")
    public AddDriveSpaceHeadersAccountContext accountContext;

    public static AddDriveSpaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddDriveSpaceHeaders self = new AddDriveSpaceHeaders();
        return TeaModel.build(map, self);
    }

    public AddDriveSpaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddDriveSpaceHeaders setAccountContext(AddDriveSpaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddDriveSpaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddDriveSpaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddDriveSpaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddDriveSpaceHeadersAccountContext self = new AddDriveSpaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddDriveSpaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
