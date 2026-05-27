// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchGetUserIdByOpenDingtalkIdHeadersAccountContext accountContext;

    public static BatchGetUserIdByOpenDingtalkIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdHeaders self = new BatchGetUserIdByOpenDingtalkIdHeaders();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchGetUserIdByOpenDingtalkIdHeaders setAccountContext(BatchGetUserIdByOpenDingtalkIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchGetUserIdByOpenDingtalkIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchGetUserIdByOpenDingtalkIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static BatchGetUserIdByOpenDingtalkIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchGetUserIdByOpenDingtalkIdHeadersAccountContext self = new BatchGetUserIdByOpenDingtalkIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchGetUserIdByOpenDingtalkIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
