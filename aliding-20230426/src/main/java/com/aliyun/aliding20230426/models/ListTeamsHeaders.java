// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTeamsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListTeamsHeadersAccountContext accountContext;

    public static ListTeamsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsHeaders self = new ListTeamsHeaders();
        return TeaModel.build(map, self);
    }

    public ListTeamsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListTeamsHeaders setAccountContext(ListTeamsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListTeamsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListTeamsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListTeamsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsHeadersAccountContext self = new ListTeamsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListTeamsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
