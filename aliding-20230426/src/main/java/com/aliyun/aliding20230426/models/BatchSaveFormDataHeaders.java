// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchSaveFormDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchSaveFormDataHeadersAccountContext accountContext;

    public static BatchSaveFormDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveFormDataHeaders self = new BatchSaveFormDataHeaders();
        return TeaModel.build(map, self);
    }

    public BatchSaveFormDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchSaveFormDataHeaders setAccountContext(BatchSaveFormDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchSaveFormDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchSaveFormDataHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static BatchSaveFormDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchSaveFormDataHeadersAccountContext self = new BatchSaveFormDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchSaveFormDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
