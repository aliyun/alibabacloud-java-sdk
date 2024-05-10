// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommentListReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CommentListReportHeadersAccountContext accountContext;

    public static CommentListReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        CommentListReportHeaders self = new CommentListReportHeaders();
        return TeaModel.build(map, self);
    }

    public CommentListReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CommentListReportHeaders setAccountContext(CommentListReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CommentListReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CommentListReportHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CommentListReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CommentListReportHeadersAccountContext self = new CommentListReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CommentListReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
