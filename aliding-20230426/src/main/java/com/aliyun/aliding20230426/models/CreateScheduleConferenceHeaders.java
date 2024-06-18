// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateScheduleConferenceHeadersAccountContext accountContext;

    public static CreateScheduleConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleConferenceHeaders self = new CreateScheduleConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public CreateScheduleConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateScheduleConferenceHeaders setAccountContext(CreateScheduleConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateScheduleConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateScheduleConferenceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateScheduleConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceHeadersAccountContext self = new CreateScheduleConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
