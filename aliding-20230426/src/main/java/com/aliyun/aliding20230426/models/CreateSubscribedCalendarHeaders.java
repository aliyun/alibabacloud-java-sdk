// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateSubscribedCalendarHeadersAccountContext accountContext;

    public static CreateSubscribedCalendarHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribedCalendarHeaders self = new CreateSubscribedCalendarHeaders();
        return TeaModel.build(map, self);
    }

    public CreateSubscribedCalendarHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateSubscribedCalendarHeaders setAccountContext(CreateSubscribedCalendarHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateSubscribedCalendarHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateSubscribedCalendarHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateSubscribedCalendarHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscribedCalendarHeadersAccountContext self = new CreateSubscribedCalendarHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateSubscribedCalendarHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
