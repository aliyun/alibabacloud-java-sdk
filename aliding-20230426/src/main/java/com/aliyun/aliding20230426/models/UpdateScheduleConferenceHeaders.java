// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateScheduleConferenceHeadersAccountContext accountContext;

    public static UpdateScheduleConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConferenceHeaders self = new UpdateScheduleConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateScheduleConferenceHeaders setAccountContext(UpdateScheduleConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateScheduleConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateScheduleConferenceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UpdateScheduleConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConferenceHeadersAccountContext self = new UpdateScheduleConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
