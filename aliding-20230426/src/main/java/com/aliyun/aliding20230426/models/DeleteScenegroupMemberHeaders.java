// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteScenegroupMemberHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteScenegroupMemberHeadersAccountContext accountContext;

    public static DeleteScenegroupMemberHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenegroupMemberHeaders self = new DeleteScenegroupMemberHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteScenegroupMemberHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteScenegroupMemberHeaders setAccountContext(DeleteScenegroupMemberHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteScenegroupMemberHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteScenegroupMemberHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteScenegroupMemberHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteScenegroupMemberHeadersAccountContext self = new DeleteScenegroupMemberHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteScenegroupMemberHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
