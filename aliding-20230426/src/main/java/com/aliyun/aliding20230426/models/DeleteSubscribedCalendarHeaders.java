// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSubscribedCalendarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DeleteSubscribedCalendarHeadersAccountContext accountContext;

    public static DeleteSubscribedCalendarHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribedCalendarHeaders self = new DeleteSubscribedCalendarHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribedCalendarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteSubscribedCalendarHeaders setAccountContext(DeleteSubscribedCalendarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DeleteSubscribedCalendarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DeleteSubscribedCalendarHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static DeleteSubscribedCalendarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteSubscribedCalendarHeadersAccountContext self = new DeleteSubscribedCalendarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DeleteSubscribedCalendarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
