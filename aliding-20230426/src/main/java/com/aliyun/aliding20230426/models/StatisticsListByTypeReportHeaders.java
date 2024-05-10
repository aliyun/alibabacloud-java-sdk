// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsListByTypeReportHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StatisticsListByTypeReportHeadersAccountContext accountContext;

    public static StatisticsListByTypeReportHeaders build(java.util.Map<String, ?> map) throws Exception {
        StatisticsListByTypeReportHeaders self = new StatisticsListByTypeReportHeaders();
        return TeaModel.build(map, self);
    }

    public StatisticsListByTypeReportHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StatisticsListByTypeReportHeaders setAccountContext(StatisticsListByTypeReportHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StatisticsListByTypeReportHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StatisticsListByTypeReportHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static StatisticsListByTypeReportHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StatisticsListByTypeReportHeadersAccountContext self = new StatisticsListByTypeReportHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StatisticsListByTypeReportHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
