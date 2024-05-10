// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ReceiverListReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ReceiverListReportHeadersAccountContext accountContext;

    public static ReceiverListReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        ReceiverListReportHeaders self = new ReceiverListReportHeaders();
        return TeaModel.build(map, self);
    }

    public ReceiverListReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ReceiverListReportHeaders setAccountContext(ReceiverListReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ReceiverListReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ReceiverListReportHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ReceiverListReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ReceiverListReportHeadersAccountContext self = new ReceiverListReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ReceiverListReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
