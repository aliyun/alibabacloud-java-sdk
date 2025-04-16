// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddFolderHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddFolderHeadersAccountContext accountContext;

    public static AddFolderHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddFolderHeaders self = new AddFolderHeaders();
        return TeaModel.build(map, self);
    }

    public AddFolderHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddFolderHeaders setAccountContext(AddFolderHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddFolderHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddFolderHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddFolderHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddFolderHeadersAccountContext self = new AddFolderHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddFolderHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
