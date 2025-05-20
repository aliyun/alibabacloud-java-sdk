// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertContentWithOptionsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InsertContentWithOptionsHeadersAccountContext accountContext;

    public static InsertContentWithOptionsHeaders build(java.util.Map<String, ?> map) throws Exception {
        InsertContentWithOptionsHeaders self = new InsertContentWithOptionsHeaders();
        return TeaModel.build(map, self);
    }

    public InsertContentWithOptionsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InsertContentWithOptionsHeaders setAccountContext(InsertContentWithOptionsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InsertContentWithOptionsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InsertContentWithOptionsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static InsertContentWithOptionsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InsertContentWithOptionsHeadersAccountContext self = new InsertContentWithOptionsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InsertContentWithOptionsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
