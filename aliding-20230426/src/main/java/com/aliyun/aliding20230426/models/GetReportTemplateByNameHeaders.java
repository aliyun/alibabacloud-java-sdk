// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportTemplateByNameHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetReportTemplateByNameHeadersAccountContext accountContext;

    public static GetReportTemplateByNameHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateByNameHeaders self = new GetReportTemplateByNameHeaders();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateByNameHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetReportTemplateByNameHeaders setAccountContext(GetReportTemplateByNameHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetReportTemplateByNameHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetReportTemplateByNameHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetReportTemplateByNameHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateByNameHeadersAccountContext self = new GetReportTemplateByNameHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateByNameHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
