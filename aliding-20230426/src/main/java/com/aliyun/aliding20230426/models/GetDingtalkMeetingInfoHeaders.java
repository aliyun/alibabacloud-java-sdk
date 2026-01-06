// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkMeetingInfoHeadersAccountContext accountContext;

    public static GetDingtalkMeetingInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingInfoHeaders self = new GetDingtalkMeetingInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkMeetingInfoHeaders setAccountContext(GetDingtalkMeetingInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkMeetingInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkMeetingInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkMeetingInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingInfoHeadersAccountContext self = new GetDingtalkMeetingInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
