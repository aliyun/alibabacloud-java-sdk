// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetFormDataByIdListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchGetFormDataByIdListHeadersAccountContext accountContext;

    public static BatchGetFormDataByIdListHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFormDataByIdListHeaders self = new BatchGetFormDataByIdListHeaders();
        return TeaModel.build(map, self);
    }

    public BatchGetFormDataByIdListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchGetFormDataByIdListHeaders setAccountContext(BatchGetFormDataByIdListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchGetFormDataByIdListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchGetFormDataByIdListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static BatchGetFormDataByIdListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListHeadersAccountContext self = new BatchGetFormDataByIdListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
