// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSubscribedCalendarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSubscribedCalendarHeadersAccountContext accountContext;

    public static GetSubscribedCalendarHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSubscribedCalendarHeaders self = new GetSubscribedCalendarHeaders();
        return TeaModel.build(map, self);
    }

    public GetSubscribedCalendarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSubscribedCalendarHeaders setAccountContext(GetSubscribedCalendarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSubscribedCalendarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSubscribedCalendarHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetSubscribedCalendarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSubscribedCalendarHeadersAccountContext self = new GetSubscribedCalendarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSubscribedCalendarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
