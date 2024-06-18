// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListReportHeadersAccountContext accountContext;

    public static ListReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListReportHeaders self = new ListReportHeaders();
        return TeaModel.build(map, self);
    }

    public ListReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListReportHeaders setAccountContext(ListReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListReportHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListReportHeadersAccountContext self = new ListReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
