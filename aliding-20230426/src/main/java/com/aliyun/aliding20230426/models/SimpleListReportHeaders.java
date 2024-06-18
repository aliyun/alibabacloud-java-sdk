// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SimpleListReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SimpleListReportHeadersAccountContext accountContext;

    public static SimpleListReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        SimpleListReportHeaders self = new SimpleListReportHeaders();
        return TeaModel.build(map, self);
    }

    public SimpleListReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SimpleListReportHeaders setAccountContext(SimpleListReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SimpleListReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SimpleListReportHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SimpleListReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SimpleListReportHeadersAccountContext self = new SimpleListReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SimpleListReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
