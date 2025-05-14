// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMultiDimTableHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddMultiDimTableHeadersAccountContext accountContext;

    public static AddMultiDimTableHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddMultiDimTableHeaders self = new AddMultiDimTableHeaders();
        return TeaModel.build(map, self);
    }

    public AddMultiDimTableHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddMultiDimTableHeaders setAccountContext(AddMultiDimTableHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddMultiDimTableHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddMultiDimTableHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddMultiDimTableHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddMultiDimTableHeadersAccountContext self = new AddMultiDimTableHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddMultiDimTableHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
