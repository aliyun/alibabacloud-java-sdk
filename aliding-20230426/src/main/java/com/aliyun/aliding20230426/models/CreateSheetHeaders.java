// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSheetHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateSheetHeadersAccountContext accountContext;

    public static CreateSheetHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateSheetHeaders self = new CreateSheetHeaders();
        return TeaModel.build(map, self);
    }

    public CreateSheetHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateSheetHeaders setAccountContext(CreateSheetHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateSheetHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateSheetHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateSheetHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSheetHeadersAccountContext self = new CreateSheetHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateSheetHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
