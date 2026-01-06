// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkMeetingListHeadersAccountContext accountContext;

    public static GetDingtalkMeetingListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingListHeaders self = new GetDingtalkMeetingListHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkMeetingListHeaders setAccountContext(GetDingtalkMeetingListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkMeetingListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkMeetingListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkMeetingListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingListHeadersAccountContext self = new GetDingtalkMeetingListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
