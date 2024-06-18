// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTaskCopiesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetTaskCopiesHeadersAccountContext accountContext;

    public static GetTaskCopiesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTaskCopiesHeaders self = new GetTaskCopiesHeaders();
        return TeaModel.build(map, self);
    }

    public GetTaskCopiesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTaskCopiesHeaders setAccountContext(GetTaskCopiesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetTaskCopiesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetTaskCopiesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetTaskCopiesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetTaskCopiesHeadersAccountContext self = new GetTaskCopiesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetTaskCopiesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
