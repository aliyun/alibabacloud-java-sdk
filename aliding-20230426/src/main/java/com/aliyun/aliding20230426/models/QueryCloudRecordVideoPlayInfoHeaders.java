// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryCloudRecordVideoPlayInfoHeadersAccountContext accountContext;

    public static QueryCloudRecordVideoPlayInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoPlayInfoHeaders self = new QueryCloudRecordVideoPlayInfoHeaders();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoPlayInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryCloudRecordVideoPlayInfoHeaders setAccountContext(QueryCloudRecordVideoPlayInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryCloudRecordVideoPlayInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryCloudRecordVideoPlayInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryCloudRecordVideoPlayInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordVideoPlayInfoHeadersAccountContext self = new QueryCloudRecordVideoPlayInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordVideoPlayInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
