// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoByRoomCodeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryConferenceInfoByRoomCodeHeadersAccountContext accountContext;

    public static QueryConferenceInfoByRoomCodeHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoByRoomCodeHeaders self = new QueryConferenceInfoByRoomCodeHeaders();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoByRoomCodeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryConferenceInfoByRoomCodeHeaders setAccountContext(QueryConferenceInfoByRoomCodeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryConferenceInfoByRoomCodeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryConferenceInfoByRoomCodeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryConferenceInfoByRoomCodeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceInfoByRoomCodeHeadersAccountContext self = new QueryConferenceInfoByRoomCodeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryConferenceInfoByRoomCodeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
