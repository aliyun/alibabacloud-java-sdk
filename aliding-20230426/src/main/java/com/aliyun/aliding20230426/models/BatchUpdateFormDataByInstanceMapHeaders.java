// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceMapHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchUpdateFormDataByInstanceMapHeadersAccountContext accountContext;

    public static BatchUpdateFormDataByInstanceMapHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceMapHeaders self = new BatchUpdateFormDataByInstanceMapHeaders();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceMapHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchUpdateFormDataByInstanceMapHeaders setAccountContext(BatchUpdateFormDataByInstanceMapHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchUpdateFormDataByInstanceMapHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchUpdateFormDataByInstanceMapHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static BatchUpdateFormDataByInstanceMapHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFormDataByInstanceMapHeadersAccountContext self = new BatchUpdateFormDataByInstanceMapHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFormDataByInstanceMapHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
