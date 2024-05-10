// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordTextHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryCloudRecordTextHeadersAccountContext accountContext;

    public static QueryCloudRecordTextHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordTextHeaders self = new QueryCloudRecordTextHeaders();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordTextHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryCloudRecordTextHeaders setAccountContext(QueryCloudRecordTextHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryCloudRecordTextHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryCloudRecordTextHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryCloudRecordTextHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordTextHeadersAccountContext self = new QueryCloudRecordTextHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordTextHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
