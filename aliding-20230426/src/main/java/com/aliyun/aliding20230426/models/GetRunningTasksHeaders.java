// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRunningTasksHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetRunningTasksHeadersAccountContext accountContext;

    public static GetRunningTasksHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetRunningTasksHeaders self = new GetRunningTasksHeaders();
        return TeaModel.build(map, self);
    }

    public GetRunningTasksHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetRunningTasksHeaders setAccountContext(GetRunningTasksHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetRunningTasksHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetRunningTasksHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetRunningTasksHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetRunningTasksHeadersAccountContext self = new GetRunningTasksHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetRunningTasksHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
