// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateReportHeadersAccountContext accountContext;

    public static CreateReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateReportHeaders self = new CreateReportHeaders();
        return TeaModel.build(map, self);
    }

    public CreateReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateReportHeaders setAccountContext(CreateReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateReportHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static CreateReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateReportHeadersAccountContext self = new CreateReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
