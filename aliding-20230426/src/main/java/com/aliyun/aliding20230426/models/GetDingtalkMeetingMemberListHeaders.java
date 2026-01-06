// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkMeetingMemberListHeadersAccountContext accountContext;

    public static GetDingtalkMeetingMemberListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberListHeaders self = new GetDingtalkMeetingMemberListHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkMeetingMemberListHeaders setAccountContext(GetDingtalkMeetingMemberListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkMeetingMemberListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkMeetingMemberListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkMeetingMemberListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberListHeadersAccountContext self = new GetDingtalkMeetingMemberListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
