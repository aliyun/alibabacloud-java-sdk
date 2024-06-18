// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddScenegroupMemberHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddScenegroupMemberHeadersAccountContext accountContext;

    public static AddScenegroupMemberHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddScenegroupMemberHeaders self = new AddScenegroupMemberHeaders();
        return TeaModel.build(map, self);
    }

    public AddScenegroupMemberHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddScenegroupMemberHeaders setAccountContext(AddScenegroupMemberHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddScenegroupMemberHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddScenegroupMemberHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddScenegroupMemberHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddScenegroupMemberHeadersAccountContext self = new AddScenegroupMemberHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddScenegroupMemberHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
