// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryCloudRecordVideoHeadersAccountContext accountContext;

    public static QueryCloudRecordVideoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoHeaders self = new QueryCloudRecordVideoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryCloudRecordVideoHeaders setAccountContext(QueryCloudRecordVideoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryCloudRecordVideoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryCloudRecordVideoHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static QueryCloudRecordVideoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordVideoHeadersAccountContext self = new QueryCloudRecordVideoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordVideoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
