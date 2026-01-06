// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMetricDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkMeetingMetricDataHeadersAccountContext accountContext;

    public static GetDingtalkMeetingMetricDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMetricDataHeaders self = new GetDingtalkMeetingMetricDataHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMetricDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkMeetingMetricDataHeaders setAccountContext(GetDingtalkMeetingMetricDataHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkMeetingMetricDataHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkMeetingMetricDataHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkMeetingMetricDataHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMetricDataHeadersAccountContext self = new GetDingtalkMeetingMetricDataHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMetricDataHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
