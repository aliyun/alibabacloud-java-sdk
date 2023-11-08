// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchUpdateFormDataByInstanceIdHeadersAccountContext accountContext;

    public static BatchUpdateFormDataByInstanceIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceIdHeaders self = new BatchUpdateFormDataByInstanceIdHeaders();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchUpdateFormDataByInstanceIdHeaders setAccountContext(BatchUpdateFormDataByInstanceIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchUpdateFormDataByInstanceIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchUpdateFormDataByInstanceIdHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static BatchUpdateFormDataByInstanceIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFormDataByInstanceIdHeadersAccountContext self = new BatchUpdateFormDataByInstanceIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFormDataByInstanceIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
