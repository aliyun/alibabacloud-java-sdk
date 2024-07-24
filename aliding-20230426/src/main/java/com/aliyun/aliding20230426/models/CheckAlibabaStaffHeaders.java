// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckAlibabaStaffHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CheckAlibabaStaffHeadersAccountContext accountContext;

    public static CheckAlibabaStaffHeaders build(java.util.Map<String, ?> map) throws Exception {
        CheckAlibabaStaffHeaders self = new CheckAlibabaStaffHeaders();
        return TeaModel.build(map, self);
    }

    public CheckAlibabaStaffHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CheckAlibabaStaffHeaders setAccountContext(CheckAlibabaStaffHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CheckAlibabaStaffHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CheckAlibabaStaffHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CheckAlibabaStaffHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CheckAlibabaStaffHeadersAccountContext self = new CheckAlibabaStaffHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CheckAlibabaStaffHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
