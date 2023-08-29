// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StatisticsReportHeadersAccountContext accountContext;

    public static StatisticsReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        StatisticsReportHeaders self = new StatisticsReportHeaders();
        return TeaModel.build(map, self);
    }

    public StatisticsReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StatisticsReportHeaders setAccountContext(StatisticsReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StatisticsReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StatisticsReportHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static StatisticsReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StatisticsReportHeadersAccountContext self = new StatisticsReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StatisticsReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
