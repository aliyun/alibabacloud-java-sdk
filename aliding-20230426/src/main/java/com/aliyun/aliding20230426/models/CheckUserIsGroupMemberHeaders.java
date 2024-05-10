// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckUserIsGroupMemberHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CheckUserIsGroupMemberHeadersAccountContext accountContext;

    public static CheckUserIsGroupMemberHeaders build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIsGroupMemberHeaders self = new CheckUserIsGroupMemberHeaders();
        return TeaModel.build(map, self);
    }

    public CheckUserIsGroupMemberHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CheckUserIsGroupMemberHeaders setAccountContext(CheckUserIsGroupMemberHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CheckUserIsGroupMemberHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CheckUserIsGroupMemberHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CheckUserIsGroupMemberHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CheckUserIsGroupMemberHeadersAccountContext self = new CheckUserIsGroupMemberHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CheckUserIsGroupMemberHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
