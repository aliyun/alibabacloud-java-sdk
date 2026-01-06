// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingMemberEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkMeetingMemberEventHeadersAccountContext accountContext;

    public static GetDingtalkMeetingMemberEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingMemberEventHeaders self = new GetDingtalkMeetingMemberEventHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingMemberEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkMeetingMemberEventHeaders setAccountContext(GetDingtalkMeetingMemberEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkMeetingMemberEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkMeetingMemberEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkMeetingMemberEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingMemberEventHeadersAccountContext self = new GetDingtalkMeetingMemberEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingMemberEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
