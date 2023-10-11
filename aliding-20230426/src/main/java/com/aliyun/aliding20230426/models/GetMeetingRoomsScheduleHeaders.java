// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeetingRoomsScheduleHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMeetingRoomsScheduleHeadersAccountContext accountContext;

    public static GetMeetingRoomsScheduleHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingRoomsScheduleHeaders self = new GetMeetingRoomsScheduleHeaders();
        return TeaModel.build(map, self);
    }

    public GetMeetingRoomsScheduleHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMeetingRoomsScheduleHeaders setAccountContext(GetMeetingRoomsScheduleHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMeetingRoomsScheduleHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMeetingRoomsScheduleHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetMeetingRoomsScheduleHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMeetingRoomsScheduleHeadersAccountContext self = new GetMeetingRoomsScheduleHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMeetingRoomsScheduleHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
