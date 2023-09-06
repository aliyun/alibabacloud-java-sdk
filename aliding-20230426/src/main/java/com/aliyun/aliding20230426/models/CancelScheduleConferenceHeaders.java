// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CancelScheduleConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CancelScheduleConferenceHeadersAccountContext accountContext;

    public static CancelScheduleConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CancelScheduleConferenceHeaders self = new CancelScheduleConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public CancelScheduleConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CancelScheduleConferenceHeaders setAccountContext(CancelScheduleConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CancelScheduleConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CancelScheduleConferenceHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static CancelScheduleConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CancelScheduleConferenceHeadersAccountContext self = new CancelScheduleConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CancelScheduleConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
