// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateSubscribedCalendarsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateSubscribedCalendarsHeadersAccountContext accountContext;

    public static UpdateSubscribedCalendarsHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribedCalendarsHeaders self = new UpdateSubscribedCalendarsHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribedCalendarsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateSubscribedCalendarsHeaders setAccountContext(UpdateSubscribedCalendarsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateSubscribedCalendarsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateSubscribedCalendarsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateSubscribedCalendarsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscribedCalendarsHeadersAccountContext self = new UpdateSubscribedCalendarsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateSubscribedCalendarsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
