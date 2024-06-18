// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteLiveHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteLiveHeadersAccountContext accountContext;

    public static DeleteLiveHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveHeaders self = new DeleteLiveHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteLiveHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteLiveHeaders setAccountContext(DeleteLiveHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteLiveHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteLiveHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DeleteLiveHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveHeadersAccountContext self = new DeleteLiveHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteLiveHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
