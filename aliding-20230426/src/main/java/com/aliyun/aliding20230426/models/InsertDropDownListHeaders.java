// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertDropDownListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InsertDropDownListHeadersAccountContext accountContext;

    public static InsertDropDownListHeaders build(java.util.Map<String, ?> map) throws Exception {
        InsertDropDownListHeaders self = new InsertDropDownListHeaders();
        return TeaModel.build(map, self);
    }

    public InsertDropDownListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InsertDropDownListHeaders setAccountContext(InsertDropDownListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InsertDropDownListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InsertDropDownListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static InsertDropDownListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InsertDropDownListHeadersAccountContext self = new InsertDropDownListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InsertDropDownListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
